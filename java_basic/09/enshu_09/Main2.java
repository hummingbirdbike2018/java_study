import java.io.*;
import java.util.*;
import java.util.zip.GZIPOutputStream;

public class Main2 {
	public static void main(String[] args) {
        String iFile = args[0];                             //圧縮処理前のファイル名
        String oFile = args[1];                             //圧縮処理後のファイル名
        FileInputStream fis = null;                         //入力側ストリーム、trycatchブロックの外で初期化
        GZIPOutputStream gzos = null;                       //圧縮ストリーム 、上記と同様
        // 処理させたい内容
        try {
            fis = new FileInputStream(iFile);                               //入力側ストリーム開始
            FileOutputStream fos = new FileOutputStream(oFile);             //受け側ストリーム開始
            BufferedOutputStream bos = new BufferedOutputStream(fos);       //受け側のバッファ処理（ある程度溜めて処理）開始
            gzos = new GZIPOutputStream(bos);                               //圧縮ストリーム開始
            int i = fis.read();                                             
            while(i != -1) {
                i = fis.read();
            }
            gzos.flush();                                                   //圧縮処理を直ちに実行
            gzos.close();                                                   //圧縮ストリーム終了
            fis.close();                                                    //入力側ストリーム終了
            // 例外
            } catch(IOException e) {
                System.out.println("ファイル操作に失敗しました");
            //例外処理
            try {
                if(fis != null) {                                           //入力ストリームが空でない場合、入力側ストリームを終了する
                    fis.close();
                }
                if(gzos != null) {                                          //圧縮ストリームが空でない場合、圧縮ストリームを終了する
                    gzos.close();
                }
            // 例外処理をすることによって発生する例外
            } catch(IOException e2) {
                ;                                               //打つ手はないため処理なし
            }
        }
    }
}
/*
実行結果
text.txtファイルをcopy.txt.gzファイルとして出力
空のアーカイブが作成された
fos(出力) > bos(ブッファ) > gzos(圧縮) > fis(入力)
圧縮処理とバッファ処理多段フィルタ
*/
