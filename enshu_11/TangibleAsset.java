// 資産、物質＞有形資産
public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    //ここでインターフェイスのフィールドを宣言
    double weight;

    TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    // インターフェイスメソッドをオーバーライドして完成させる
    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}