public class IntegerGame {
    public static void main(String[] args) {
        System.out.println("�����ăQ�[��");
        int ans = new java.util.Random().nextInt(10);

        for(int i = 0; i < 5; i++) {
            System.out.println("�O~�X�̐�������͂��Ă�����");
            int num = new java.util.Scanner(System.in).nextInt();

            if(num == ans) {
                System.out.println("������");
                // break�ŏ����𔲂���
                break;
            } else {
                System.out.println("�Ⴂ�܂�");
            }
        }
        System.out.println("�Q�[���I��");
        }
}