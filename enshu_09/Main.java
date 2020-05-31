public class Main {
    public static void main(String[] args) {
        Thief tf1 = new Thief("アサカ", 50, 10); //名前、HP、MP
        Thief tf2 = new Thief("アサカ", 60);
        Thief tf3 = new Thief("アサカ");

        System.out.println(tf1.name + " 職業：盗賊" + "HP：" + tf1.hp + "MP：" + tf1.mp + "が作成されました。");
        System.out.println(tf2.name + " 職業：盗賊" + "HP：" + tf2.hp + "MP：" + tf2.mp + "が作成されました。");
        System.out.println(tf3.name + " 職業：盗賊" + "HP：" + tf3.hp + "MP：" + tf3.mp + "が作成されました。");
    }
}
