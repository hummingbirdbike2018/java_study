// 1�T�ړ������胍�W�b�N���v�����Ȃ������I�I�I�I�I

public class Account {
    String accountNumber;           //�����ԍ�
    int balance;                    //�c��

    Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // ������\���̃��\�b�h
    public String toString() {
        // "\\"�̓G�X�P�[�v�V�[�P���X
        // �o�� \���@��ˑ������̂��߃o�b�N�X���b�V���ŕ\������Ă��܂�
        return "\\" + this.balance +  "(�����ԍ�=" + this.accountNumber + ")";
    }

    // ��������̃��\�b�h
    //�I�u�W�F�N�g�^�ϐ�o�������Ƃ���
    public boolean equals(Object o) {
        // ����(���l�F�����A�h���X���w��)�̂��̂�����
        if(this == o) {
            return true;
            // false
        }
        // Object�^�ϐ�o��Account�^�̃C���X�^���X������
        if(o instanceof Account) {
            // Account�^�ϐ�a�ɁAObject�^�ϐ�o��Account�^�Ƃ��ăL���X�g���đ��
            Account a = (Account)o;
            // String�^�ϐ�an1�Ɍ����ԍ���trim�ŋ󔒂��폜���đ��
            String an1 = this.accountNumber.trim();
            // ���l�ɃC���X�^���Xa������
            String an2 = a.accountNumber.trim();
            // String�^�ϐ�an1, an2�͓��e����v�i����)���Ă��邩
            if(an1.equals(an2)) {
                return true;
            }
        }
        // ������ɂ��Y�����Ȃ�
        return false;
    }
}   