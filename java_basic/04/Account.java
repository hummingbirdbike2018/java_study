/* comparable<>�Ŏ��g���w��*/
public class Account implements Comparable<Account>{
    String accountNo;
    int number;

    Account(String accountNo) {
        this.accountNo = accountNo;
    }
    
    // �C���^�[�t�F�[�X�̎����ɂ��compareTo���\�b�h�̃I�[�o�[���C�h������ 
    public int compareTo(Account obj) {
        if(this.number < obj.number) {
            return -1;
        }
        if(this.number > obj.number) {
            return 1;
        }
            return 0;
    }

    // �����������I�[�o�[���C�h
    public boolean equals(Object o) {                               //������Object�^
        if(o == this) return true;                                  //���g�������̏ꍇtrue
        if(o == null) return false;                                 //null��������false
        if(!(o instanceof Account)) return false;                   //�^���قȂ�Ȃ��false
        Account r = (Account) o;                                    //��r�ł���悤���^�ɃL���X�g
        if(!this.accountNo.trim().equals((r.accountNo.trim()))) {   //�󔒂��������������ԍ�����������Γ���
            return false;
        }
        return true;                                                //�S�ăp�X������true
    }
}