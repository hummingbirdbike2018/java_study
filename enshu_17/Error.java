import java.io.FileWriter;
import java.io.IOException;

public class Error {
    public static void main(String[] args) throws IOException {  /* 例外が発生したら呼び出し元に例外を返す。
                                                                    mainメソッドより上は(JVM)メソッドではないのでプログラム終了 */
        System.out.println("起動");  
        throw new IOException();                                //throw newで意図的に例外を発生させる
    }
}

/*
throwsする場合は必ず呼び出し元クラスにて例外を伝播する可能性があるメソッド呼び出しをキャッチしなくてはならない
例外の伝播により、呼び出し先で例外→呼び出し元→mainメソッド→JVM→プログラム停止となる
*/