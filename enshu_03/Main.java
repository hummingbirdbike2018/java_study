public class Main {
    public static void main(String[] args) {
        boolean tenki = true;

        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        //elseの'{'をつけ忘れているため直後の処理は実行されないが次の処理は実行される 
        } else 
            System.out.println("DVDを見ます");
            System.out.println("寝ます");
        }
    }