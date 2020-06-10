import java.util.*;

/*
�S�ẴN���X��Object�N���X�̃��\�b�h�������Ă���
Object�^�ϐ��ɂ͂�����C���X�^���X��������
*/
public class Main {
	public static void main(String[] args) {
                Set<Hero> list = new HashSet<>();
                Hero h1 = new Hero("�~�i�g");
                Sword s = new Sword("�|�̌�");
                h1.setSword(s);
                System.out.println("�����F" + h1.getSword().getName());
                list.add(h1);
                System.out.println("�v�f���F" + list.size());
                /*
                �C���X�^���X�͕ϐ��ւ̑���ł͎Q�Ƃ���邾���ŃR�s�[�͂���Ȃ�
                clone���\�b�h�̓C���X�^���X��new�ƑS�t�B�[���h�R�s�[�̋@�\�������Ă���
                */
                // h1���N���[��
                Hero h2 =h1.clone();
                /*
                �R�s�[���̑�����ύX
                �ʃN���X�̃C���X�^���X�t�B�[���h�𕡐��������ꍇ�A���̃N���X�ɂ�Cloneable��������
                �Ώۃt�B�[���h��resuly field = this,field.clone();�̂悤�ɋL�q����
                */
                h1.getSword().setName("�q�m�L�̖_");
                // �R�s�[���̑�����\��
                System.out.println(h1.getSword().getName());
                // �R�s�[��̑�����\��
                System.out.println(h2.getSword().getName());  

                /* 
                5�̊�{����
                *toString ������\���𓾂�
                *equals ��������
                *hashCode �n�b�V���l�𓾂�
                compareTo �召�֌W�𔻒�
                clone ����
                */

                /*
                �e�N���X�̊J���҂͓K�؂ȏo�͂�������悤Object���\�b�h���I�[�o�[���C�h����Ӗ�������
                �I�[�o�[���C�h�O Hero@6ff3c5b5 <- ����ł͈Ӗ��s��
                �I�[�o�[���C�h�� �E��(���O=���/HP=100/MP100)
                */
                System.out.println(h1); //toString�̌��ʂ��o��

                /*
                ���l�Ɠ����̈Ⴂ
                ����(equals)�F�Q�Ƃ���A�h���X�قȂ��Ă��Ă��������e�Ȃ�true�B�ʁX�̃C���X�^���X���̃t�B�[���h�l�������Ȃ�
                ��������̊���J���҂���߂�i�I�[�o�[���C�h�j�K�v������B�����l��"���l"�ɂȂ��Ă���
                ���l(==)�F�Q�Ƃ���A�h���X�������A���S�ɓ���B����C���X�^���X���̓����t�B�[���h�l���w���Ă���Ȃ�
                Hash�n�R���N�V�����ł͑�̓������H->���̒�����equals�Ō����ɔ��肷��
                */
                Account num = new Account("123456 ");
                Account num2 = new Account(" 123456");
                Account num3 = num;
                System.out.println(num.equals(num2));   //�I�[�o�[���C�h�O�͓��l�Ȃ̂�false
                System.out.println(num.equals(num3));    

                /*
                �n�b�V���l�̏����F�n�b�V���l�͓����C���X�^���X����͓����n�b�V���l�A�����łȂ��ꍇ "�Ȃ�ׂ�" �قȂ�n�b�V���l��������
                ��L�𖞂����悤hashCode���I�[�o���C�h����K�v������
                hash�l�̔�r�͐������m�̔�r�Ȃ̂ō����BhashCode->equals�̏��Ŏ��s�����
                */
                h1 = new Hero("�~�i�g");
                list.remove(h1);        //name�t�B�[���h����v����v�f�̍폜
                System.out.println("�v�f���F" + list.size()); 
                
                /*
                compareTo���\�b�h�͎��R�����Â��̖@�����`����B���ёւ���Ƃ�������~���A�����Ȃ�
                �C���X�^���X����obj�Ǝ��g�̑召�֌W���r�Aobj>�͕��̐��Aobj<�̏ꍇ�͐��̐��A���͂O��Ԃ�
                Collections.sort���s���AcompareTo���Ăяo���Ȃ���\�[�g����
                */
                List<Integer> numbers = new ArrayList<>();
                numbers.add(1111);
                numbers.add(3333);
                numbers.add(2222);
                Collections.sort(numbers);      //��`�������R�����Â��ɏK���\�[�g
                for(int i : numbers) {
                        System.out.println(i);  
                }  
        }
}