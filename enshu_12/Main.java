public class Main {
    public static void main(String[] args) {
        // �C���X�^���XA��X�^�ϐ�obj�ƌ��Ȃ�
        X obj = new A(); 
        // �C���^�[�t�F�C�X�FX�ɒ�`���ꂽa()���Ăяo����邪�Aimplements, extends��H��
        // �ŏI�p����̃N���XA�̃��\�b�h���Ăяo�����
        obj.a();
        // �V���{���������炸�A�R���p�C���G���[�ɂȂ�B
        // obj.b();
        // obj.c();

        // �C���X�^���XA��Y�^�ϐ�y1�ƌ��Ȃ�
        Y y1 = new A();
        // �C���X�^���XB��Y�^�ϐ�y1�ƌ��Ȃ�
        Y y2 = new B();
        // ���g�̓C���X�^���XA�̂���A�̃��\�b�h�����s�����A���L������
        // �o��Aa
        y1.a();
        // �o��Ba
        y2.a();

        // �z��̌^�̓N���XA�AB�Ƌ��ʂ̃��\�b�h�����e�N���X�FY��p����
        Y array[] = new Y[2];
        array[0] = new A();
        array[1] = new B();
        // �g��for(����^ ����ϐ��F�z��)
        for(Y y : array) {
            y.b();
        }
    }
}