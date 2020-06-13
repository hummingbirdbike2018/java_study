// import文
import java.util.*;


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

    // ライブラリを用いたhashCode
    public int hashCode() {                 
        return HashCodeBuilder.reflectionHashCode(this);                         
    }

    
    // オーバーライドclone
    public Book clone() {
        Book b = new Book(title, publishDate, comment);
        b.title  = this.title;
        b.publishDate = (Date)this.publishDate.clone();
        b.comment = this.comment;
        return b;
    }
    // 8-2
    // ライブラリを用いたequals
    public boolean equals(Object o) {                           //Object型変数o
        return EqualsBuilder.reflectionEquals(this, o);
    }                                                
    // ライブラリを用いたcompareTo
    public int compareTo(Book o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }

    // ライブラリを用いたtoString
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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

    public void setPublishDate(Date publishDate) {
        this.publishDate =  publishDate;
    }

    public Date getPublishDate() {
        return this.publishDate;
    }
}

/*
8-1
ライブラリ保存先フォルダパスc:\javalib
コンパイル  javac c:\javalib\commons-lang.jar Main.java
実行       java c:\javalib\commons-lang.jar Main

自分のMacOS, VSCode環境での実行コマンドは
javac -cp /Users/ユーザ名/java_study/java_basic/libs/ライブラリファイル.jar -encoding SJIS Book.java
*/
