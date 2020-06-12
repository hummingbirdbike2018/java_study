/*
入門編と内容が一緒のためコメント省略
*/

import java.util.*;

public class Sample {
	public static void main(String[] args) {
        // １?１
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 100; i++) {
            sb.append(i).append(",");
        }
        String s = sb.toString();
        System.out.printf("String sの中身：%2s\n", s);
        String[] a = s.split(",");
        System.out.print("String aの中身：");

        for(String b : a) {
        System.out.printf("%5s", b);
        }
        System.out.print("\n");
        

        // 1-2
        String folder = "c:\\user";
        String file = "readme.txt";
        String filePath = getFilePath(folder, file);
        System.out.printf("ファイルパス：%s\n", filePath);

        /*
        正規表現
        1. .*
        2. A\d{1,2}
        3. U[A-Z]{3}
        */
        
    }
    
        public static String getFilePath(String folder, String file) {
        if(!(folder.endsWith("\\"))) {
            folder += "\\";
        }
        return folder + file;
    }
}