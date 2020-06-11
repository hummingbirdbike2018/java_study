// 5-1
/* ジェネリクス
<>の中に任意の文字を入れ値をnewする際に型を宣言することで文字部分が宣言型に置き換わる
値を取り出す際にキャストしなくていい */
class StrongBox<E> {
    private E item;                                 //出し入れするもの
    private KeyType keyType;                        //列挙型名 変数
    private long count = 0;                         //必要施工回数
    
    public StrongBox(KeyType key) {                 //鍵の種類を受け取るコンストラクタ 
        this.keyType = key;
    }
    public void put(E i) {               
        this.item = i;
    }

    public E get() {                        
        this.count++;                                //get()メソッドが呼ばれる度カウンタを増やす
        switch (this.keyType) {                      //鍵の種別を判定し、該当する種別ごとの処理を実施
            case PADLOCK:
                if(count < 1024) return null;        //カウンタが必要施行回数に到達しない場合、nullを返す
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
        this.count = 0;                               //カウンタを０に戻す
        return this.item;                            //物を取り出す
    }
}