// 有形資産＞コンピュータ
public class Computer extends TangibleAsset {
    String makerName;

    Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return this.makerName;
    }
}