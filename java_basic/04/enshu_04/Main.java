
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Instant it1 = Instant.parse("2020-06-10T10:15:30.00Z");  //Instant型で取得
        Date d1 = Date.from(it1);                   //Date型へ
        Instant it2 = Instant.parse("2019-12-03T10:15:30.00Z");
        Date d2 = Date.from(it2);
        Instant it3 = Instant.parse("2020-05-03T10:15:30.00Z");
        Date d3 = Date.from(it3);
		Book b1 = new Book("絵本", d1, "普通");
		Book b2 = new Book("ビジネス書", d2, "良い");
        Book b3 = new Book("文庫", d3, "悪い");
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		Collections.sort(books);
        Book b4 = b1.clone(); //複製
        Book b5 = b1;         //参照
        b1.setComment("まあまあ");
        System.out.println("コピー元のコメント:" + b1.getComment());  
        System.out.println("コピー先のコメント:" + b4.getComment()); 
        
        books.remove(b1.getTitle());   //b1とタイトルが同じものを削除
        System.out.println("要素数:" + books.size());  

	}
}