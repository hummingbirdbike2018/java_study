import jdk.jfr.StackTrace;

/*
���@�G���[�A���s���G���[�A�_���G���[�ɑΏ�����

Error�n��O�͑ł�Ȃ�
Exception�n��O�͕K���L���b�`����(�񕜌����݂̂���G���[�̂���)
RuntimeException�n��O�͔C��
*/
public class Main {
	public static void main(String[] args) {
        try {
            // 17?1, 17-2
            // String s = null;
            // 17-3
            int i = Integer.parseInt("�O");      //NumberFormatException
            // System.out.println(s.length());     //NullPointerException  
        } catch(Exception e) {                  //���Ԑ���Exception���ꊇ��ɂ���
            // JVM���ǂ̂悤�Ȍo�܂ŃG���[���o�������L�^�������A�X�^�b�N�g���[�X
            System.out.println("--�X�^�b�N�g���[�X��������--");  
            System.out.println(e);  
            System.out.println("--�X�^�b�N�g���[�X�����܂�--");  
        } finally {
            //��O�̂���Ȃ��Ɋւ�炸�A�K���s����Еt�������Bclose()�Ȃ�
        }

        /* 
        try-with-resorce��
        finally�L�q�Ȃ��ł�������close();���Ă����iAutoClosable����������API����j
        */
        try(��Еt�����K�v�ȕϐ��̐錾) {
            // �{���̏���
        } catch(Exception e) {
            // ��O����
        }
	}
}