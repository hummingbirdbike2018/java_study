public class Main {
    public static void main(String[] args) {
        int[] counts = null;
        float[] heights = {171.3F, 175.0F};
        // countsの要素は空なのでNullPointerExceprionになる
        System.out.println(counts[1]);
        // heightsの要素は２つ
        System.out.println(heights[2]);
    }
}