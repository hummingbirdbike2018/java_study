// ���ۃN���X�F���Y
public abstract class Asset {
    String name;
    int price;
    
    Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}