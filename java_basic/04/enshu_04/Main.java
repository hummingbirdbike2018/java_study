
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        Instant it1 = Instant.parse("2020-06-10T10:15:30.00Z");  //Instant�^�Ŏ擾
        Date d1 = Date.from(it1);                   //Date�^��
        Instant it2 = Instant.parse("2019-12-03T10:15:30.00Z");
        Date d2 = Date.from(it2);
        Instant it3 = Instant.parse("2020-05-03T10:15:30.00Z");
        Date d3 = Date.from(it3);
		Book b1 = new Book("�G�{", d1, "����");
		Book b2 = new Book("�r�W�l�X��", d2, "�ǂ�");
        Book b3 = new Book("����", d3, "����");
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		Collections.sort(books);
        Book b4 = b1.clone(); //����
        Book b5 = b1;         //�Q��
        b1.setComment("�܂��܂�");
        System.out.println("�R�s�[���̃R�����g:" + b1.getComment());  
        System.out.println("�R�s�[��̃R�����g:" + b4.getComment()); 
        
        books.remove(b1.getTitle());   //b1�ƃ^�C�g�����������̂��폜
        System.out.println("�v�f��:" + books.size());  

	}
}