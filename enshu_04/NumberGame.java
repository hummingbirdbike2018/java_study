public class NumberGame {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};

        for(int number : numbers) {
            System.out.println("�P���̐�������͂��Ă�������");
            int input = new java.util.Scanner(System.in).nextInt();
            
            if(number == input) {
                System.out.println("������");
                break;
            } else {
                System.out.println("�͂���");
            }
        }
    }
}