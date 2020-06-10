public class Wizard {
    private int hp;//HP
    private int mp;//MP
    private String name;//���O
    private Wand wand;//�������Ă����
    
    void heal(Hero h) {
        System.out.println(this.name + "��" + getWand().getName() + "�𑕔����Ă���");
        int basePoint = 10;                                   // ��{�񕜃|�C���g
        /*
        wand.power�ł̓t�B�[���h��private�̂��߃A�N�Z�X�s��
        getWand().getPower() = �Z�b�g���ꂽwand�C���X�^���X��(.)power�t�B�[���h���Ăяo��
        */
        int recovPoint = (int)(basePoint * getWand().getPower());  // ��ɂ�鑝��
        int cost_mp = 20; //����MP
        System.out.println("MP��" + cost_mp + "�����");
        int remaining_mp = (this.mp -= cost_mp);                     //�c��MP
        System.out.println("�c��MP�F" + remaining_mp);
        h.setHp(h.getHp() + recovPoint);                      // �E�҂�HP���񕜂���
        System.out.println(h.getName() + "��HP��" + recovPoint + "�񕜂����I");
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        if(name == null || name.length() < 3) {
            throw new IllegalArgumentException("�ݒ�l���ُ�ł�");
        }
        this.name = name;
    }

    int getHp() {
        return this.hp;
    }

    void setHp(int hp) {
        if(hp < 0) {
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }

    int getMp() {
        return this.mp;
    }

    void setMp(int mp) {
        if(mp < 0) {
            // �����O�𓊂���
            throw new IllegalArgumentException("�ݒ肷��MP�l���ُ�ł�");
        }
        this.mp = mp;
    }

    Wand getWand() {
        return this.wand;
    }

    void setWand(Wand wand) {
        if(wand == null) {
            throw new IllegalArgumentException("�ݒ肷���null�ł�");
        }
        this.wand = wand;
    }
}
