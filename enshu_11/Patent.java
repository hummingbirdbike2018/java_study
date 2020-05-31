// ñ≥å`éëéYÅÑì¡ãñå†
public class Patent extends IntangibleAsset {
    int hoge;

    Patent(String name, int price, String sample, int hoge) {
        super(name, price, sample);
        this.hoge = hoge;
    }

    public int getHoge() {
        return this.hoge;
    }

    public void setHoge(int hoge) {
        this.hoge = hoge;
    }
}