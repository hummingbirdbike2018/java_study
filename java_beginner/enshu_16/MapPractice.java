import java.util.*;

public class MapPractice {
    /*
    Mapはキーと値が紐づいた要素の集まり
    PHPで言うところの連想配列
    キーの重複は不可だが値の重複は可
    */
	public static void main(String[] args) {
        // HashMap
        Map<String, Integer> mp1 = new HashMap<>();
        // addではなくput
        mp1.put("key1", 1);
        // 同じキーでputすると上書きされる
        mp1.put("key1", 2);

        
        for(int i = 1; i <= 10; i++) {
            mp1.put("key"+i, i);
        }

        // キーで値を取得
        System.out.println(mp1.get("key1"));
        // 格納されているキーセットを全て取得
        System.out.println(mp1.keySet());

        // 値の取り出し, 順序は保証されない
        for(String key : mp1.keySet()) {    //キーセットを全て取得
            int value = mp1.get(key);       //キーに紐づく値を取得
            System.out.printf("HashMapの出力:キー%s値%d\n", key, value);
        }


        // LinkedHashMap
        Map<String, String> mp2 = new LinkedHashMap<>();

        for(int i = 1; i <= 10; i++) {
            mp2.put("key" + i, "value" + i);
        }
        // 値の取り出し、格納順
        for(String key : mp2.keySet()) {    
            String value = mp2.get(key);       
            System.out.printf("LinkedHashMapの出力:キー%s値%s\n", key, value);
        }

        // TreeMap
        Map<Integer, String> mp3 = new TreeMap<>();
        mp3.put(3, "orange");
        mp3.put(2, "banana");
        mp3.put(5, "lemon");
        mp3.put(1, "mango");
        mp3.put(4, "apple");

        // 値の取り出し、keyが辞書順
        for(int key : mp3.keySet()) {    
            String value = mp3.get(key);       
            System.out.printf("TreeMapの出力:キー%d値%s\n", key, value);
        }
	}
}