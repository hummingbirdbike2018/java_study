    public class Main2 {
        // heal���\�b�h
        public static void heal(int hp) {
            hp += 10;
        }
        // heal���\�b�h���I�[�o�[���C�h
        public static void heal(Thief thief) {
            thief.hp += 10;
        }
        // main���\�b�h
        public static void main(String[] args) {
        int baseHp = 25;
        /*
        �C���X�^���X��������baseHP(int 25)��HP�����Ƃ��ăN���X�ϐ��֑��
        �N���X�^�ϐ��̂��ߎQ�Ɠn���ƂȂ�Ăяo����̃A�h���X�������փR�s�[�����
        */
        Thief t = new Thief("�A�T�J", baseHp);
          // �o�͌��ʂ�25:25
        System.out.println(baseHp + " : " + t.hp);
          // baseHP�������Ƃ���heal���\�b�h�ɓn���Ă�int�^�̂��ߒl�n���ƂȂ�Ăяo�����̒l�͕ω����Ȃ�
        heal(baseHp);
          // �N���X�ϐ�Thief��t�������Ƃ���heal(Thief thief)���\�b�h�����s�A�ϐ�t��HP��10������
        heal(t);
          // �o�͌��ʂ�25�F35
        System.out.println(baseHp + " : " + t.hp);
    }    
}