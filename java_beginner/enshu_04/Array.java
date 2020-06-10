public class Array {
    public static void main(String[] args) {
        // 4-1
        // 型名[] 配列名 = new [要素数];
        int[] points = new int[5];
        // 型名[] 配列名 = { 要素１、要素２..... };
        double[] weights = {1.11, 2.22, 3.33, 4.44};
        boolean[] answers = new boolean[2];
        String[] names = {"suzuki", "tanaka", "takahashi"};

        /* 配列の操作が想定される場合は最初からArrayListを使う */

        // 4-2
        int[] moneyList = {121902, 8302, 55100};

        // .lengthで配列の要素数を取得
        for(int i = 0; i < moneyList.length; i++) {
            // 配列内要素を順に入れていく
            int money = moneyList[i];
            System.out.println("口座残高:"  + money);
        }

        // 拡張for for(型名 代入される変数名 : 配列名)
        for(int money : moneyList) {
            System.out.println("口座残高:"  + money);
        }

    }
}