/* ��{�f�[�^�^
    ���� byte < short < int < long
    ���� �B�� float, ���� double
    �^�U boolean = ture of false 
    ���� char
    ������ String */
public class Main {
    public static void main(String[] args) {
        // �f�[�^�^ �ϐ��� �� �������f�[�^;
        int a = 3;
        int b = 5;
        int c = a * b;
        // '+'�̓������̏���������߃��[�v�����ł͎g��Ȃ�
        System.out.println("�c��" + a + " ����" + b + "�̒����`�̖ʐς́A" + c);
        // �^�U�l
        boolean result = true;
        // �ꕶ�������A�V���O���N�H�[�e�[�V�����ň͂�
        char ch = '��';
        // ����
        double pai = 3.14;
        // �����̑������l�A�Ō��L��long
        long l = 314159265853979L;
        // ������
        String message = "�~�i�g�̍U���I�G��15�|�C���g�̃_���[�W";

        /* �ォ�瓯���ϐ����錾�����Ɠ��e���㏑�������
            �l�̏㏑�����֎~����ꍇ�A�萔��p����
            �萔�͊���Ƃ��đ啶����p����
            final �f�[�^�^  �萔�� = �������f�[�^ */
        final int CONST = 100;

        // ��{�I�ɕ������String�A���l��int�A������double���g��
    }
}