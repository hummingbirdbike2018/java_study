public class Array {
    public static void main(String[] args) {
        // 4-1
        // Œ^–¼[] ”z—ñ–¼ = new [—v‘f”];
        int[] points = new int[5];
        // Œ^–¼[] ”z—ñ–¼ = { —v‘f‚PA—v‘f‚Q..... };
        double[] weights = {1.11, 2.22, 3.33, 4.44};
        boolean[] answers = new boolean[2];
        String[] names = {"suzuki", "tanaka", "takahashi"};

        // 4-2
        int[] moneyList = {121902, 8302, 55100};

        // .length‚Å”z—ñ‚Ì—v‘f”‚ğæ“¾
        for(int i = 0; i < moneyList.length; i++) {
            // ”z—ñ“à—v‘f‚ğ‡‚É“ü‚ê‚Ä‚¢‚­
            int money = moneyList[i];
            System.out.println("ŒûÀc‚:"  + money);
        }

        // Šg’£for for(Œ^–¼ ‘ã“ü‚³‚ê‚é•Ï”–¼ : ”z—ñ–¼)
        for(int money : moneyList) {
            System.out.println("ŒûÀc‚:"  + money);
        }

    }
}