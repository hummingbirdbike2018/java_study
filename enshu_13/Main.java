public class Main {
    public static void main(String[] args) {
        Wizard wz = new Wizard();
        Wand wd = new Wand();
        Hero h = new Hero();

        wz.setName("���@�g��");
        wz.setHp(100);
        wz.setMp(100);
        wd.setName("�s�v�c�ȏ�");
        wd.setPower(10);
        wz.setWand(wd);
        h.setName("�V�l�E��");
        

        System.out.println(wd.getName());
        System.out.println(wz.getName());
        wz.heal(h);

    }
    
}