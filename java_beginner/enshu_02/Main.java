class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        // オペランド中に文字列が含まれる場合、その他オペランドも文字列として扱われる
        String ans = "x+yは" + x + y;
        System.out.println(ans);

        // ()を付けると評価順位が変わり数値の演算として扱われる
        String ans2 = "x+yは" + (x + y);
        System.out.println(ans2);
    }
}