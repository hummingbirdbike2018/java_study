class Book implements Comparable<Book>, Cloneable {
    // フィールド
    private String title;
    private Date publishDate;
    private String comment;

    // コンストラクタ
    Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    } 

    // オーバーライドhashCode
    public int hashCode() {
        int result = 30;                            
        result = result * 31 + title.hashCode();     //int型以外はHash値にする(int)に変換
        result = result * 31 + comment.hashCode();                  
        return result;                              
    }

    /* 
    オーバーライドclone
    Dateクラスでもcloneメソッドを定義しておく
    */
    public Book clone() {
        Book b = new Book(title, publishDate, comment);
        b.title  = this.title;
        b.publishDate = (Date)this.publishDate.clone();
        b.comment = this.comment;
        return b;
    }
    // オーバーライドequals
    public boolean equals(Object o) {                           //Object型変数o
        if(o == this) return true;
        if(o == null) return false;
        if(!(o instanceof Book)) return false;
        Book b = (Book) o;                                      
        if(!this.publishDate.equals(b.publishDate)) return false;
        return true;
    }                                                
    // オーバライドcompareTo
    /*
    わからなった部分 
    DateクラスでもcompareToメソッドを定義しておく
    */
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }

    // セッター、ゲッター
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return this.comment;
    }
}