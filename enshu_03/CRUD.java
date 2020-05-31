public class CRUD {
    public static void main(String[] args) {
        System.out.print("[メニュー]1：検索　2：登録　3：削除　4：変更　＞");
        int selected = new java.util.Scanner(System.in).nextInt();
        // selectedの値が
        switch(selected) {
            // １のとき
            case 1 :
                System.out.println("検索します");
                // breakしないと次の処理も実行される
                break;
            // ２のとき
            case 2 :
                System.out.println("登録します");
                break;
            // ３のとき
            case 3 :
                System.out.println("削除します");
                break;
            // ４のとき
            case 4 :
                System.out.println("変更します");
                break;
            default :
            System.out.println("該当メニューがありません");
        }
    }
}