import java.io.FileWriter;
import java.io.IOException;

public class Error {
    public static void main(String[] args) throws IOException {  //例外が発生したら呼び出し元に例外を返す。
                                                                //mainメソッドより上は(JVM)メソッドではないのでプログラム終了
        System.out.println("起動");  
        throw new IOException();                                //意図的に例外を発生させる
    }
}