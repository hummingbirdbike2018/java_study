public class Food {
    public static void main(String[] args) {
        int isHungry = new java.util.Random().nextInt(2);
        String food = "おにぎり";
        // isHungryの値が０と等価ならば
        if(isHungry == 0) {
            System.out.println("満腹です");
        }else{
            System.out.println("空腹です");
            System.out.println(food + "をいただきます");
            System.out.println("ごちそうさま");
        }

        }
}