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

    // �I�[�o�[���C�hhashCode
    public int hashCode() {
        int result = 30;                            
        result = result * 31 + title.hashCode();     //int�^�ȊO��Hash�l�ɂ���(int)�ɕϊ�
        result = result * 31 + comment.hashCode();                  
        return result;                              
    }

    /* 
    �I�[�o�[���C�hclone
    Date�N���X�ł�clone���\�b�h���`���Ă���
    */
    public Book clone() {
        Book b = new Book(title, publishDate, comment);
        b.title  = this.title;
        b.publishDate = (Date)this.publishDate.clone();
        b.comment = this.comment;
        return b;
    }
    // �I�[�o�[���C�hequals
    public boolean equals(Object o) {                           //Object�^�ϐ�o
        if(o == this) return true;
        if(o == null) return false;
        if(!(o instanceof Book)) return false;
        Book b = (Book) o;                                      
        if(!this.publishDate.equals(b.publishDate)) return false;
        return true;
    }                                                
    // �I�[�o���C�hcompareTo
    /*
    �킩��Ȃ������� 
    Date�N���X�ł�compareTo���\�b�h���`���Ă���
    */
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
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
}