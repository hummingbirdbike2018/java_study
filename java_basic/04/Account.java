/* comparable<>で自身を指定*/
public class Account implements Comparable<Account>{
    String accountNo;
    int number;

    Account(String accountNo) {
        this.accountNo = accountNo;
    }
    
    // インターフェースの実装によりcompareToメソッドのオーバーライドを強制 
    public int compareTo(Account obj) {
        if(this.number < obj.number) {
            return -1;
        }
        if(this.number > obj.number) {
            return 1;
        }
            return 0;
    }

    // 等価判定基準をオーバーライド
    public boolean equals(Object o) {                               //引数はObject型
        if(o == this) return true;                                  //自身が引数の場合true
        if(o == null) return false;                                 //nullが引数はfalse
        if(!(o instanceof Account)) return false;                   //型が異なるならばfalse
        Account r = (Account) o;                                    //比較できるよう同型にキャスト
        if(!this.accountNo.trim().equals((r.accountNo.trim()))) {   //空白を除去した口座番号が正しければ等価
            return false;
        }
        return true;                                                //全てパスしたらtrue
    }
}