public class Thief {
    String name;
    int hp;
    int mp;
    
    /*
    �I�[�o�[���[�h �F ���d��`�B������ς��Ē�`���邱�Ƃœ������\�b�h�𕡐���`�ł���
    �I�[�o�[���C�h �F �㏑����`�B�p����N���X�ŃX�[�p�[�N���X�Ɠ������\�b�h����������s���e��ς��Ē�`����
    �R���X�g���N�^�̓I�[�o���C�h�ł��Ȃ�
    �R���X�g���N�^�̃I�[�o�[���[�h(�Ăяo��=>���s)
    */
    // 3 => 1
    Thief(String name) {
        // ���������󂯎��Ȃ��t�B�[���h�ɒl�𒼐ړn��
        this(name, 40, 5);
    }

    // 2 => 2
    Thief(String name, int hp) {
        this(name, hp, 5);
    }

    // 1 => 3
    Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }


}
