import java.util.Random;

public class Cleric {
    private String name;
    private int hp = 50;
    final static int MAX_HP = 50;
    private int mp = 10;
    final static int MAX_MP = 10;
    
    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public void selfAid() {
        this.mp -= 5;
        this.hp += MAX_HP;
        System.out.println(this.name + "�̓Z���t�G�C�h���g����! MP��" + this.mp + "������I HP��" + this.hp + "�񕜂���!");
    }

    public int pray (int sec) {
        Random rd = new Random();
        // �_����̉񕜗� 0~2�̗���+�b
        int rec = rd.nextInt(3) + sec;
        // �I�I���W�b�N���v�����Ȃ������|�C���g�I�I
        // ���ۂ̉񕜗� (�ő�MP-����MP,�_����̉񕜗�)�̂ǂ��炩�������l���o��
        int acc  = Math.min(this.MAX_HP - this.mp, rec);
        // ����MP�ɉ��Z����
        this.mp += acc;
        System.out.println(this.name + "��" + sec + "�b�F�����I MP��" + acc+ "�񕜂���!");
        return acc;
    }
}