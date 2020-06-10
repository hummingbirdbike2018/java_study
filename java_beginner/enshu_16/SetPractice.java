import java.util.*;

public class SetPractice {
    /*
    Setnには重複、順序がない。よってset(), get()もない 
    */
    public static void main(String[] args) {
        // HashSet
        Set<String> s1 = new HashSet<String>();
        s1.add("1個目の要素");
        // 同じ要素を追加しようとしても無視される
        s1.add("1個目の要素");

        for(int i = 0; i < 10; i++) { 
            s1.add(i + "個目の要素");
        }
        // 順序がバラバラ
        for(String s : s1) {
            System.out.printf("HashSetの%2s\n", s);  
        }

        // LinkedHashSet
        Set<String> s2 = new LinkedHashSet<String>();
        for(int i = 0; i < 10; i++) { 
            s2.add(i + "個目の要素");
        }
        // 格納した順序
        for(String s : s2) {
            System.out.printf("LinkedHashSetの%2s\n", s);  
        }

        Set<String> s3 = new TreeSet<String>();
        s3.add("orange");
        s3.add("mango");
        s3.add("apple");
        s3.add("banana");
        s3.add("pineapple");
        // 死全順序づけ、String型の場合辞書並び
        for(String s : s3) {
            System.out.printf("TreeSetの出力：%2s\n", s);  
        }
    }
}