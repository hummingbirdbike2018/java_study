public class PoisonMatango extends Matango {

    int suffix;
    // �ōU����
    int attack_times = 5;
    // �q�R���X�g���N�^
    PoisonMatango(char suffix) {
        // �I�[�o�[���[�h
        super(suffix);
    }
    // �U�����\�b�h
    public void attack(Hero h) {
        // �p�����N���X�̃��\�b�h�Ăяo��
        super.attack(h);
        //�ōU���t���O
        if(this.attack_times > 0) {
            System.out.println("����ɓł̖E�q���΂�T����");
            // �E�҂�HP1/5�ɑ�������|�C���g
            int damaged  = h.hp / 5;
            // �E�҂�HP�������
            h.hp -= damaged;
            System.out.println(damaged + "�|�C���g�̃_���[�W�I");
            // �U����1�}�C�i�X
            this.attack_times--;
        }
    }
}
