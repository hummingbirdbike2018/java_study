public class IntegerGame {
    public static void main(String[] args) {
        System.out.println("”‚ ‚ÄƒQ[ƒ€");
        int ans = new java.util.Random().nextInt(10);

        for(int i = 0; i < 5; i++) {
            System.out.println("‚O~‚X‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚¢");
            int num = new java.util.Scanner(System.in).nextInt();

            if(num == ans) {
                System.out.println("‚ ‚½‚è");
                // break‚Åˆ—‚ğ”²‚¯‚é
                break;
            } else {
                System.out.println("ˆá‚¢‚Ü‚·");
            }
        }
        System.out.println("ƒQ[ƒ€I—¹");
        }
}