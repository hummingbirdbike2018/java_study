public class NumberGame {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};

        for(int number : numbers) {
            System.out.println("１桁の数字を入力してください");
            int input = new java.util.Scanner(System.in).nextInt();
            
            if(number == input) {
                System.out.println("あたり");
                break;
            } else {
                System.out.println("はずれ");
            }
        }
    }
}