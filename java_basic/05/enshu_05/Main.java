import java.util.*;
import static java.lang.System.*; //staticでインポートすることによりクラス内宣言を省略できる

public class Main {
	public static void main(String[] args) {
		StrongBox<String> sb1 = new StrongBox<String>(KeyType.PADLOCK);		//独自コレクションクラス名<入れたいデータ型>
		sb1.put("item");							
		out.println(sb1.get());
		}   
}