public class Main {
    public static void main(String[] args) {
        introduceOneself();
        email("○○の件について", "hoge@company.co.jp", "○○について以下のように....");
        email("hoge@company.co.jp", "○○について以下のように....");
        // メソッドの戻り値を変数に入れる
        double triangleArea = calcTriangleArea(10, 5);
        System.out.println("三角形の面積：" + triangleArea);
        double circleArea = calcCircleArea(5);
        System.out.println("円の面積：" + circleArea);
    }

    public static void introduceOneself() {
        String name = "suzuki";
        int age = 100;
        float height = 170.0F;
        char zodiac = '丑';

        System.out.println("名前は" + name + "です。年齢は" + age + "歳で身長" + height + "cm,十二支は" + zodiac + "です");
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }
    /* 引数を変更することによって違うメソッドとしてオーバーライドできる */
    public static void email(String address, String text) {
        System.out.println(address + "に以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }

    public static double calcTriangleArea(double bottom, double height) {
        return (bottom * height) / 2;
    }

    public static double calcCircleArea(double radius) {
        // 円周率は決まった数値なので定数とする
        final double  PAI = 3.14;
        return (radius * radius) * PAI;
    }
}