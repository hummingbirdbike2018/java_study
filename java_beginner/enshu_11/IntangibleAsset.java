/*
���ۃN���X�G���Y�����ۃN���X�G���`���Y
���ۃN���X�ɂ͈ȉ��̐��񂪂�����
new���Ďg�����Ƃ��ł��Ȃ�
�q�N���X�ɂĒ��ۃ��\�b�h�̃I�[�o���C�h���Ď������Ȃ���΂Ȃ�Ȃ��i�ŏI�I�ɑ��A�]���N���X���őS�Ď����ł����OK) 
*/
public abstract class IntangibleAsset extends Asset {
    String sample;

    IntangibleAsset(String name, int price, String sample) {
        // super�Őe�N���X�̃R���X�g���N�^���Ăш�����n��
        super(name, price);
        this.sample = sample;
    }

    public String getSample() {
        return this.sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }
} 