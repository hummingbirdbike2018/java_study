public class Food {
    public static void main(String[] args) {
        int isHungry = new java.util.Random().nextInt(2);
        String food = "‚¨‚É‚¬‚è";
        // isHungry‚Ì’l‚ª‚O‚Æ“™‰¿‚È‚ç‚Î
        if(isHungry == 0) {
            System.out.println("–ž• ‚Å‚·");
        }else{
            System.out.println("‹ó• ‚Å‚·");
            System.out.println(food + "‚ð‚¢‚½‚¾‚«‚Ü‚·");
            System.out.println("‚²‚¿‚»‚¤‚³‚Ü");
        }

        }
}