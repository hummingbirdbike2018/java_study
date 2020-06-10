/* clone�C���^�[�t�F�[�X����
Cloneable�N���X�Ƀ��\�b�h�͂Ȃ��A�����ɑΉ����Ă��邱�Ƃ�\�����邾���̃N���X */
class Hero implements Cloneable {
    String name;
    int hp;
    Sword sword;

    Hero(String name) {
        this.name = name;
    }
    /*
    Object��clone��protected�̂���public�ŃI�[�o�[���C�h
    �A�N�Z�X�C���͐e�N���X�Ɠ�����������ɂ����̂ɐ��񂳂��
    �V���ȃC���X�^���X��new�A�t�B�[���h��S�R�s�[����return������e���L�q
    �߂�l�͎��g�̃N���X��
    */
    public Hero clone() {
        Hero result = new Hero(name);
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;
    }
    // Object�N���X��toString���I�[�o�[���C�h
    public String toString() {
        return "�E��(���O=" + this.name + "/HP=" + this.hp + "/�������Ă��錕=" + this.sword.getName() +")";
    }

    // Object�N���X��hashCode���I�[�o�[���C�h
    public int hashCode() {
        int result = 30;                            //�����l�͓K��
        result = result * 31 + name.hashCode();     //�e�t�B�[���h�̉e����^����
        result = result * 31 + hp;                  //�搔�Ɋ���f���ł���31��p����
        return result;                              //����
    }

    // Object�N���X��equals���I�[�o�[���C�h
    public boolean equals(Object o) {                               //������Object�^
        if(o == this) return true;                                  //���g�������̏ꍇtrue
        if(o == null) return false;                                 //null��������false
        if(!(o instanceof Hero)) return false;                   //�^���قȂ�Ȃ��false
        Hero r = (Hero) o;                                    //��r�ł���悤���^�ɃL���X�g
        if(!this.name.trim().equals((r.name.trim()))) {   //�󔒂������������O����������Γ���
            return false;
        }
        return true;                                                //�S�ăp�X������true
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Sword getSword() {
        return this.sword;
    }
}