class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        // �I�y�����h���ɕ����񂪊܂܂��ꍇ�A���̑��I�y�����h��������Ƃ��Ĉ�����
        String ans = "x+y��" + x + y;
        System.out.println(ans);

        // ()��t����ƕ]�����ʂ��ς�萔�l�̉��Z�Ƃ��Ĉ�����
        String ans2 = "x+y��" + (x + y);
        System.out.println(ans2);
    }
}