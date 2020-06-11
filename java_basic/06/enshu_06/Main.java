import java.util.*;

interface Func1 {
    public abstract boolean call(int x);
}

interface Func2 {
    public abstract String call(boolean m, String n);
}

public class Main {
	public static void main(String[] args) {    
        /*
        処理の流れ
        new -> Func2=FuncList.addNamePrefix -> Func2.call 
        */
        FuncList fl = new FuncList();           //インスタンス化し非staticメソッドにアクセスできるようにする
        Func1 fl1 = FuncList::isOdd;            //外部クラスのメソッドをインターフェースのメソッドに代入
        Func2 fl2 = fl::addNamePrefix;          //非staticメソッドへアクセス、上記と同様の処理
        System.out.println(fl1.call(33));
        System.out.println(fl2.call(true, "Suzuki"));

        // 6-2
        // Func1 fl3 =  x -> x % 2 == 1;
        // Func2 fl4 =  (male, name) {
        //     if(male == true) {
        //         return "Mr." + name;
        //     } else {
        //         return "Ms." + name;
        //     }
        // } 
    }
}