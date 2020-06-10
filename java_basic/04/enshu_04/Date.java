class Date implements Comparable<Date>, Cloneable {
    int publishDate;

    Date(int publishDate) {
        this.publishDate = publishDate;
    }

    public int compareTo(Date o) {
        if(this.publishDate < o.publishDate) { 
        }
        if(this.publishDate > o.publishDate) {
            return 1;
        }
            return 0;
    }

    public Date clone() {
        Date d1 = new Date(publishDate);
        d1.publishDate = this.publishDate;
        return d1;
    }

    public void setDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public int getDate() {
        return this.publishDate;
    }

}