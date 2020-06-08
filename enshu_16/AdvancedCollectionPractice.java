import java.util.*;

public class AdvancedCollectionPractice {
	public static void main(String[] args) {
        // String型キー、List型値のMap
        Map<String, List<String>> pref = new HashMap<>();
        List<String> l1 = new ArrayList<>();    //リスト１
        l1.add("苺");
        l1.add("かんぴょう");
        l1.add("お米");
        pref.put("栃木県", l1);                 //Mapへキーを添えて追加
        List<String> l2 = new ArrayList<>();
        l2.add("切手");
        l2.add("佃煮");
        l2.add("寿司");
        pref.put("東京都", l2);
        List<String> l3 = new ArrayList<>();
        l3.add("織物");
        l3.add("人形");
        l3.add("漬物");
        pref.put("京都府", l3);

        for(String key : pref.keySet()) {       //Mapのキー一覧（都道府県名）を取得
            System.out.println(key);            //都道府県
            for(String value : pref.get(key)) { //キーからリスト内の値を取得
                System.out.println("特産品：" + value); 
            } 
        }
	}
}