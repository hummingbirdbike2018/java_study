public class Main {
    public static void main(String[] args) {
        introduceOneself();
        email("�����̌��ɂ���", "hoge@company.co.jp", "�����ɂ��Ĉȉ��̂悤��....");
        email("hoge@company.co.jp", "�����ɂ��Ĉȉ��̂悤��....");
        // ���\�b�h�̖߂�l��ϐ��ɓ����
        double triangleArea = calcTriangleArea(10, 5);
        System.out.println("�O�p�`�̖ʐρF" + triangleArea);
        double circleArea = calcCircleArea(5);
        System.out.println("�~�̖ʐρF" + circleArea);
    }

    public static void introduceOneself() {
        String name = "suzuki";
        int age = 100;
        float height = 170.0F;
        char zodiac = '�N';

        System.out.println("���O��" + name + "�ł��B�N���" + age + "�΂Őg��" + height + "cm,�\��x��" + zodiac + "�ł�");
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "�Ɉȉ��̃��[���𑗐M���܂���");
        System.out.println("�����F" + title);
        System.out.println("�{���F" + text);
    }
    /* ������ύX���邱�Ƃɂ���ĈႤ���\�b�h�Ƃ��ăI�[�o�[���C�h�ł��� */
    public static void email(String address, String text) {
        System.out.println(address + "�Ɉȉ��̃��[���𑗐M���܂���");
        System.out.println("�����F����");
        System.out.println("�{���F" + text);
    }

    public static double calcTriangleArea(double bottom, double height) {
        return (bottom * height) / 2;
    }

    public static double calcCircleArea(double radius) {
        // �~�����͌��܂������l�Ȃ̂Œ萔�Ƃ���
        final double  PAI = 3.14;
        return (radius * radius) * PAI;
    }
}