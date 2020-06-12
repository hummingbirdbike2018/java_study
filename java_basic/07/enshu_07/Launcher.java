import java.lang.*;
import java.lang.reflect.Method;

public class Launcher {
	public static void main(String[] args) {
        String fqcn = args[0];						//�������A�N�����ׂ��N���X��FQCN�A�R�}���h���C�������Ƃ��Ď󂯎�邽��args[]�ɂ����
        String sw = args[1];						//�������A�N�����@���������� I or E�A�����Ɠ�����args[]�ɓ����
		showMemory();								//�������g�p��
		// �{���̏���
        try {
            Class<?> clazz = Class.forName(fqcn);	//�������̃N���X����clazz�ɑ��
            listMethods(clazz);						//�N���X�̂����\�b�h�ꗗ��\��
            if(sw.equals("E")) {					//��������E�̏ꍇ
                lanchExternal(clazz);				//lanchExternal���\�b�h�����s
            } else if(sw.equals("I")) {				//��������I�̏ꍇ
                lanchInternal(clazz);				//lanchInternal���\�b�h�����s
            } else {
                throw new IllegalArgumentException(	//I��E�ǂ���ł��Ȃ������̏ꍇ�A��O�𔭐�������
                    "�N�����@�̎w�肪�s���ł�"
                );
			}
			// ��O����
            } catch(Exception e) {							
                System.out.println(e.getMessage());	//�G���[���b�Z�[�W���擾
                e.printStackTrace();				//�X�^�b�N�g���[�X�i�G���[���e�j���o��
                System.exit(1);  					//�ُ�I������
            }
            showMemory();							//try������̃���������ʂ�\��
            System.exit(0);							//�ʏ�I������
        }

		// ���\�b�h�ꗗ��\�����郁�\�b�h
        public static void listMethods(Class<?> clazz) {		//�N���X���������Ƃ���
            System.out.println("���\�b�h�̈ꗗ��\�����܂�");  		//���b�Z�[�W
            Method[] methods = clazz.getDeclaredMethods();		//Method�C���X�^���X�Ń��\�b�h�ꗗ��z��Ŏ󂯎��
            for(Method m : methods) {							//�g��for��
                System.out.println(m.getName());  				//�z��̓��e�i���\�b�h�j������\��
            }
        }
		//�O���v���Z�X���\�b�h
        public static void lanchExternal(Class<?> clazz) throws Exception {		//�N���X���������Ƃ���
            ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());	//�v���Z�X�r���_�[�ŃR�}���h���C�����Ajava�Ɉ����Ƃ��ăN���X����n�����s -> java MemoryEater 
            Process proc = pb.start();											//�N������
            proc.waitFor();														//�v���Z�X�̏I���܂ő҂�
        }

		// ���t���N�V�������\�b�h
        public static void lanchInternal(Class<?> clazz) throws Exception {		//�N���X���������Ƃ���
            Method m =  clazz.getMethod("main", String[].class);				//(�Ăяo�����\�b�h��,�����̌^(�������\�b�h������ꍇ�̂�))���擾��m�ɓ����
            String[] args = {};													//�����z���p��
			m.invoke(null, (Object)args);										//invoke���\�b�h��main���\�b�h���Ăяo���e������n��
			/* �������F�ÓI���\�b�h�̑�������null�A
			�������F�Ăяo�����\�b�h�ɓn�������AObject�^�ւ̃L���X�g���K�v */
		}

		// �����̃��W�b�N�̂ݎv������
		// ���݂̃������g�p�ʂ�MB�\�����郁�\�b�h
        public static void showMemory() {
        long t = Runtime.getRuntime().totalMemory();							//����������
        long f = Runtime.getRuntime().freeMemory();								//�󂫃�������
        long u = (t - f) / 1024 / 1024;											//��������-�󂫃�����=�g�p��������
        System.out.println("���݂̃������g�p�ʁF" + u + "MB");  				   
		}
		
		
}
/*
�R�}���h���C�������̋N�����@
java Launcher ���삳����N���X(������) E or I(������)
*/

