public class IntegerGame {
    public static void main(String[] args) {
        System.out.println("数あてゲーム");
        int ans = new java.util.Random().nextInt(10);

        for(int i = 0; i < 5; i++) {
            System.out.println("０~９の数字を入力してくだい");
            int num = new java.util.Scanner(System.in).nextInt();

            if(num == ans) {
                System.out.println("あたり");
                // breakで処理を抜ける
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲーム終了");
        }
}