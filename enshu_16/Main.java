import java.util.*;

public class Main {
    // 16-1
    // 次の各情報を格納する適切なコレクションは？
    // ４７都道府県の名前、順序不問→単独の情報の集まりで重複はないのでset
    // ５人のテストの点数→単独の情報の集まりで重複がありえるのでlist
    // 過去の総理大臣の名前と任期、順序不問→ペア情報（名前、任期)なのでmap
	public static void main(String[] args) {
        // 16?2
        Hero h1 = new Hero("鈴木");
        Hero h2 = new Hero("斎藤");
        List<Hero> heros = new ArrayList<Hero>();   //Hero型herosリスト
        heros.add(h1);                              //ここでnameフィールドまで取得しようとすると戻り値がStringのためエラ?になる
        heros.add(h2);
        
        Iterator<Hero> it = heros.iterator();       //インテレータでHero型のherosリスト内要素を参照
        while(it.hasNext()) {                       //hasNextで要素をさせるか判別
            Hero e = it.next();                     //nextで要素を指し、型を返す
            System.out.println(e.getName());        //ここでgetNameしてnameフィールド取得
        }

        // 拡張for文
        for(Hero hero : heros) {
            System.out.println(hero.getName()); 
        } 

        // for文
        for(int i = 0; i < heros.size(); i++) {
            System.out.println(heros.get(i).getName()); //herosリスト内のi番目のnameフィールド
        }

        // 16?3
        Map<Hero, Integer> gots = new HashMap<Hero, Integer>();     //Hero,Integerをペアとしたgots(撃破数)マップ
        gots.put(h1, 1);                                            //putで要素追加
        gots.put(h2, 5);
        int gc1 = gots.get(h1);                                     //キーと紐づいた値を取得
        System.out.println(h1.getName() + "の撃破数は" + gc1);
        System.out.println(gots.size());                            //map内のペア数を取得

        for(Hero key : gots.keySet()) {                             //gotsマップのもつキー要素をマップ変数keyへ順に入れていく
            // System.out.println(key);                             //Heroオブジェクトのkey、撃破数はInteger型のためHeroオブジェクトには存在しない
            int value = gots.get(key);                              //gotsマップのもつ(値)を取得し、変数に入れる
            System.out.println(key.getName() + "の撃破数は" + value); //h1.name
                }
	}
}