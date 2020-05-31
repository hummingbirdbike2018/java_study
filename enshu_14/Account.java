// 1週目等価判定ロジックが思いつかなかった！！！！！

public class Account {
    String accountNumber;           //口座番号
    int balance;                    //残高

    Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // 文字列表現のメソッド
    public String toString() {
        // "\\"はエスケープシーケンス
        // 出力 \が機種依存文字のためバックスラッシュで表示されてしまう
        return "\\" + this.balance +  "(口座番号=" + this.accountNumber + ")";
    }

    // 等価判定のメソッド
    //オブジェクト型変数oを引数として
    public boolean equals(Object o) {
        // 同一(等値：同じアドレスを指す)のものか判別
        if(this == o) {
            return true;
            // false
        }
        // Object型変数oはAccount型のインスタンスか判別
        if(o instanceof Account) {
            // Account型変数aに、Object型変数oをAccount型としてキャストして代入
            Account a = (Account)o;
            // String型変数an1に口座番号をtrimで空白を削除して代入
            String an1 = this.accountNumber.trim();
            // 同様にインスタンスaも処理
            String an2 = a.accountNumber.trim();
            // String型変数an1, an2は内容が一致（等価)しているか
            if(an1.equals(an2)) {
                return true;
            }
        }
        // いずれにも該当しない
        return false;
    }
}   