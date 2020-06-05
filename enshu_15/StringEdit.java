public class StringEdit {
    public static void main(String[] args) {
        // 15-1
        // StringBuilder初期化
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 100; i++) {
            //変数iの後ろにカンマを付けてメモリに追加 
            sb.append(i).append(",");
        }
        // オブジェクトから文字列へ変換
        String n = sb.toString();

        System.out.println(n);
        // 文字列をカンマ区切りで分割(split)して配列に格納
        String[] numbers = n.split(",");

        for(String number : numbers) {
            System.out.print(number + " ");
        }

        // 15-2
        String folder = "c:\\user";
        String file = "text.txt";
        String fullPath = getFilePath(folder, file);
        System.out.println(fullPath);
        // printfでformat（)＋printlnが同時に実行できる
        System.out.printf("%03d", 3);
    }

    public static String getFilePath(String folder, String file) {
        // 文字列folderの終わりが'\'で終了していない場合、文字列の最後に'\'を付ける
        if(!folder.endsWith("\\")) {
            /*
            %sはfolderに入っている文字列
            "% 修飾(,３桁毎のカンマ、-左寄せ等) 桁(表示桁数、nm指定で全体n桁、少数以下m桁) 型（d整数, s文字列, f少数, b真偽)"
            桁数は0を頭につけると少数として出力される。("%02d", 5)の場合、05と出力。("%10d", 5)の場合、５の前に9文字分のスペースが入る
            format("書式指定", パラメータ, パラメータ...)
            */
            folder = String.format("%s\\", folder);
        }
        return folder + file;
    }

    
    /*
    15-3 正規表現
    [] いずれかの文字、[n-m] nからmのいずれか、{} 直前の文字の繰り返し回数、^文字列の最初、＄文字列の最後
    No.1 .* 全ての文字列
    No.2 A\d{1,2} 一文字目 大文字A(A), 二文字目 全ての数字(\d), 三文字目 {直前の文字を含む、1回以上2回以下の繰り返し = 数字御orなし}
    No.3 U[A-Z]{3} 一文字目 大文字U 二文字目 A-Zのいずれか 三文字目 {直前文字を含む、3回以上繰り返し = ３?４文字目は英大文字
    */
}
