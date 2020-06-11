// 5-1
/* �W�F�l���N�X
<>�̒��ɔC�ӂ̕��������l��new����ۂɌ^��錾���邱�Ƃŕ����������錾�^�ɒu�������
�l�����o���ۂɃL���X�g���Ȃ��Ă��� */
class StrongBox<E> {
    private E item;                                 //�o�����ꂷ�����
    private KeyType keyType;                        //�񋓌^�� �ϐ�
    private long count = 0;                         //�K�v�{�H��
    
    public StrongBox(KeyType key) {                 //���̎�ނ��󂯎��R���X�g���N�^ 
        this.keyType = key;
    }
    public void put(E i) {               
        this.item = i;
    }

    public E get() {                        
        this.count++;                                //get()���\�b�h���Ă΂��x�J�E���^�𑝂₷
        switch (this.keyType) {                      //���̎�ʂ𔻒肵�A�Y�������ʂ��Ƃ̏��������{
            case PADLOCK:
                if(count < 1024) return null;        //�J�E���^���K�v�{�s�񐔂ɓ��B���Ȃ��ꍇ�Anull��Ԃ�
                break;
            case BUTTON:
                if(count < 10000) return null; 
                break;
            case DIAL:
                if(count < 30000) return null; 
                break;
            case FINGER:
                if(count < 1000000) return null; 
                break;
        }
        this.count = 0;                               //�J�E���^���O�ɖ߂�
        return this.item;                            //�������o��
    }
}