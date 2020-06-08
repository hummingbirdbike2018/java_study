// コレクションを使うためのimport
import java.util.*;

public class ListPractice {
	public static void main(String[] args) {
		/*
		ArrayListが配列と異なる点
		宣言時の要素数指定なし、後から要素を追加できる
		インスタンスを格納できるが基本データ型は格納できない
		基本データ型を格納する場合、対応するラッパークラスのインスタンスを使う
		例：int -> Integer, double -> Double
		*/
		// Integer型インスタンスを格納するArrayListを宣言
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// リストへ要素を追加, 追加した順に連番になる
		numbers.add(10);
		numbers.add(20);
		// 0番目の要素を取得
		System.out.printf("0番目の要素：%d\n", numbers.get(0));
		// 0番目に要素を追加。既に要素が存在する場合、割り込みで挿入する。
		numbers.add(0, 40);
		System.out.printf("add後の0番目の要素：%d\n", numbers.get(0));
		// ０番目の要素を上書き
		numbers.set(0, 30);
		System.out.printf("set後の0番目の要素：%d\n", numbers.get(0));
		// ０番目の要素を取り除く, 要素番号が前に詰められる
		numbers.remove(0);
		// numbersの要素数をチェック
		System.out.printf("remove後の0番目の要素：%d\n", numbers.get(0));
		System.out.printf("numbersの要素数：%d\n", numbers.size());
		
	
		// 拡張forで要素を取り出す
		for(int num : numbers) {
			System.out.println(num);
		}

		// forで要素を取り出す
		// 反復回数＝要素数なのでforを用いる
		for(int num = 0; num < numbers.size(); num++) {
			System.out.println(numbers.get(num));  
		}

		// イテレータ（反復子）で取り出す 
		Iterator<Integer> it = numbers.iterator();
		// 反復回数が不明のためWhileを用いる
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);  
		}

		// 要素を全て取り除く
		numbers.clear();
		System.out.printf("clear後のnumbersの要素数：%d\n", numbers.size());
		// 要素が空か判別する際はisEmptyの方が明示的
		if(numbers.isEmpty()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		/*
		LinkedList
		ArrayListと違い要素の挿入、削除に向いているが、要素の取り出しは不向き
		メソッドはListと同じ
		*/
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(1);
		list.add(1, 40);
		System.out.println(list.get(2));

		for(int n : list) {
			System.out.println(n);  
		}
	}


}