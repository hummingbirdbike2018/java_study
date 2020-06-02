public class StringEdit {
    public static void main(String[] args) {
        // 15-1
        // StringBuilder初期化
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 100; i++) {
            //変数iの後ろにカンマを付けてメモリに追加 
            sb.append(i).append(",");
        }
        // メモリから文字列として出力
        String n = sb.toString();

        System.out.println(n);
        // 文字列をカンマ区切りで分割して配列に格納
        String[] numbers = n.split(",");
        // 
        for(String number : numbers) {
            System.out.print(number + " ");
        }

        // 15-2
        String folder = "c:\\user";
        String file = "text.txt";
        String fullPath = getFilePath(folder, file);
        System.out.println(fullPath);
    }

    public static String getFilePath(String folder, String file) {
        // 文字列folderの終わりが'\'で終了していない場合、文字列の最後に'\'を付ける
        if(!folder.endsWith("\\")) {
            // folder += "\\";
            folder = String.format("%s\\", folder);
        }
        return folder + file;
    }

    // 15-3
    // [] いずれかの文字、[n-m] nからmのいずれか、{} 繰り返し処理、^文字列の最初、＄文字列の最後
    // ①.* 全ての文字列
    // ②A\d{1,2} 一文字目 大文字A(A), 二文字目 数字(\d), 三文字目 {直前の文字を含む、1回以上2回以下の繰り返し = 数字かなし}
    // ③U[A-Z]{3} 一文字目 大文字U 二文字目 A-Zのいずれか 三文字目 {直前文字を含む、3回以上繰り返し = ３?４文字目は英大文字

}
