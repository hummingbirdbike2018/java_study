public class Array {
    public static void main(String[] args) {
        // 4-1
        // �^��[] �z�� = new [�v�f��];
        int[] points = new int[5];
        // �^��[] �z�� = { �v�f�P�A�v�f�Q..... };
        double[] weights = {1.11, 2.22, 3.33, 4.44};
        boolean[] answers = new boolean[2];
        String[] names = {"suzuki", "tanaka", "takahashi"};

        // 4-2
        int[] moneyList = {121902, 8302, 55100};

        // .length�Ŕz��̗v�f�����擾
        for(int i = 0; i < moneyList.length; i++) {
            // �z����v�f�����ɓ���Ă���
            int money = moneyList[i];
            System.out.println("�����c��:"  + money);
        }

        // �g��for for(�^�� ��������ϐ��� : �z��)
        for(int money : moneyList) {
            System.out.println("�����c��:"  + money);
        }

    }
}