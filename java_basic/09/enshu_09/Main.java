import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.*;

public class Main {
	public static void main(String[] args) throws Exception {
        
        /*
        別アプローチ
        Filesのcopyメソッドの引数としてPaths.get(コマンドライン引数)を指定
        */
        // Files.copy(Paths.get(args[0]), Paths.get(args[1]));
        String iFile = args[0];                                     //コピー元ファイル
        String oFile = args[1];                                     //コピー先ファイル
        FileInputStream fis = new FileInputStream(iFile);           //送り側ストリーム開始
        FileOutputStream fos = new FileOutputStream(oFile);         //受け側ストリーム開始
        int i = fis.read();                                         //送り側より受けた内容をint型へ入れる
        while(i != -1) {                                            //読み込みできる内容がなくなるまで（?1）
            fos.write(i);                                           //受け側へ1文字ずつ渡す
            i = fis.read();                                         //送り側から次の内容を受け取る
        }
        fos.flush();                                                //受け側へすぐ内容を書き出すようJVMへ指示
        fos.close();                                                //受け側ストリーム終了
        fis.close();                                                //送り側ストリーム終了
        /*
        実行結果
        元ファイルが存在しない場合            NoSuchFileException  
        コピー後の同名ファイルが存在する場合    FileAlreadyExistsException
        */

    }
}