public class Main {
public static void main(String[] args) {
        // Object�^�ɂ͒ʏ�̌^�������A������N���X���i�[�ł���
        // Object�^�C���X�^���Xo ���Ԃ�Account�N���X�̃C���X�^���X
        Object o = new Account("4649", 1592);

        System.out.println(o.toString());
        System.out.println(o.equals(o));
    }
}