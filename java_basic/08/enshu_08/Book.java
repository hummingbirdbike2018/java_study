// import��
import java.util.*;


class Book implements Comparable<Book>, Cloneable {
    // �t�B�[���h
    private String title;
    private Date publishDate;
    private String comment;

    // �R���X�g���N�^
    Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    } 

    // ���C�u������p����hashCode
    public int hashCode() {                 
        return HashCodeBuilder.reflectionHashCode(this);                         
    }

    
    // �I�[�o�[���C�hclone
    public Book clone() {
        Book b = new Book(title, publishDate, comment);
        b.title  = this.title;
        b.publishDate = (Date)this.publishDate.clone();
        b.comment = this.comment;
        return b;
    }
    // 8-2
    // ���C�u������p����equals
    public boolean equals(Object o) {                           //Object�^�ϐ�o
        return EqualsBuilder.reflectionEquals(this, o);
    }                                                
    // ���C�u������p����compareTo
    public int compareTo(Book o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }

    // ���C�u������p����toString
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    // �Z�b�^�[�A�Q�b�^�[
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
���C�u�����ۑ���t�H���_�p�Xc:\javalib
�R���p�C��  javac c:\javalib\commons-lang.jar Main.java
���s       java c:\javalib\commons-lang.jar Main

������MacOS, VSCode���ł̎��s�R�}���h��
javac -cp /Users/���[�U��/java_study/java_basic/libs/���C�u�����t�@�C��.jar -encoding SJIS Book.java
*/
