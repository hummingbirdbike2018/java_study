/*
抽象クラス；資産＞抽象クラス；無形資産
抽象クラスには以下の制約がかかる
newして使うことができない
子クラスにて抽象メソッドのオーバライドして実装しなければならない（最終的に孫、曽孫クラス等で全て実装できればOK) 
*/
public abstract class IntangibleAsset extends Asset {
    String sample;

    IntangibleAsset(String name, int price, String sample) {
        // superで親クラスのコンストラクタを呼び引数を渡す
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