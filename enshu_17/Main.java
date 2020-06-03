import jdk.jfr.StackTrace;

public class Main {
	public static void main(String[] args) {
        try {
            // 17?1, 17-2
            // String s = null;
            // 17-3
            int i = Integer.parseInt("三");      //NumberFormatException
            // System.out.println(s.length());     //NullPointerException  
        } catch(Exception e) {                  //多態性
            System.out.println("--スタックトレースここから--");  
            System.out.println(e);  
            System.out.println("--スタックトレースここまで--");  
        }
	}
}