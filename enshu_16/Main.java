import java.util.*;

public class Main {
    /*
    16-1
    次の各情報を格納する適切なコレクションは？
    ４７都道府県の名前、順序不問→単独の情報の集まりで重複はないのでset
    ５人のテストの点数→単独の情報の集まりで重複がありえるのでlist
    過去の総理大臣の名前と任期、順序不問→ペア情報（名前、任期)なのでmap
    */
	public static void main(String[] args) {
        // 16-2
        Hero h1 = new Hero("鈴木");
        Hero h2 = new Hero("斎藤");
        List<Hero> heros = new ArrayList<Hero>();   //Hero型ArrayList
        heros.add(h1);                              //要素の追加 
        heros.add(h2);
        
        Iterator<Hero> it = heros.iterator();       //インテレータでHero型のherosリスト内要素を参照
        while(it.hasNext()) {                       //hasNextで要素を指せるか判別
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

        // 16-3
        Map<Hero, Integer> hero = new HashMap<Hero, Integer>();     //Hero,Integerをペアとしたheroマップ
        hero.put(h1, 1);                                            //putでヒーロー毎の撃破数を追加
        hero.put(h2, 5);
        int gc1 = hero.get(h1);                                     //キーh１に紐づく値を取得しgc1へ代入
        System.out.println(h1.getName() + "の撃破数は" + gc1);
        System.out.println(hero.size());                            //sizeでmap内のペア数を取得

        for(Hero key : hero.keySet()) {                             //heroマップのもつhero一覧を取得
            int value = hero.get(key);                              //heroマップのもつキーを指定して(値)を取得し、変数に入れる
            System.out.println(key.getName() + "の撃破数は" + value); //h1.name
                }
	}
}