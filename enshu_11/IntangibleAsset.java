// ΫNXGYΫNXG³`Y
public abstract class IntangibleAsset extends Asset {
    String sample;

    IntangibleAsset(String name, int price, String sample) {
        // superΕeNXΜRXgN^πΔΡψπn·
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