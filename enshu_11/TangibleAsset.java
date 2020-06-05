/*
���Y�A�������L�`���Y
�َ�̌p����implements�A�C���^�[�t�F�[�X�Ɍ��葽�d�p���ł���
����̌p����extends
*/
public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    //�����ŃC���^�[�t�F�C�X�̃t�B�[���h��錾
    double weight;

    TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    // �C���^�[�t�F�C�X���\�b�h���I�[�o�[���C�h���Ċ���������
    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}