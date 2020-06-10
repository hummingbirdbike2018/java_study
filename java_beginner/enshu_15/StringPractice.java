import java.util.*;

public class StringPractice {
	public static void main(String[] args) {
        String st1 = "Java Script";
        String st2 = "�@java  ";
        String st3 = "JAVA PROGRAM";
        String st4 = "";
        int i1 = 2020;

        // ����������(�P�[�X���)������ �߂�l bool
        System.out.printf("equals:%s\n", st1.equals(st2));
        // ���������񂩔��� �߂�l bool
        System.out.printf("equalsIgnoreCase:%s\n", st1.equalsIgnoreCase(st2));
        // ������̒������r �߂�l int
        System.out.printf("length:%s\n", st3.length());
        // �󕶎����� �߂�l bool
        System.out.printf("isEmpty:%s\n", st4.isEmpty());  
        // �w�肵����������܂ނ� �߂�l bool
        System.out.printf("contain:%s\n", st1.contains("ja"));
        // �w�肵��������Ŏn�܂邩 �߂�l bool
        System.out.printf("startsWith:%s\n", st1.startsWith("j")); 
        // �w�肵��������ŏI��邩 �߂�l bool
        System.out.printf("endsWith:%s\n", st1.endsWith("a"));
        // �J�E���g���n�߂�ꕶ���ڂ͂O�ƂȂ�A�P�[�X����ʂ����
        // �w�肵�������񂪍ŏ����琔���ĉ��Ԗڂ� �߂�l int
        System.out.printf("indexOf:%s\n", st1.indexOf("Script"));
        // �w�肵�������񂤂��Ōォ�琔���ĉ��Ԗڂ� �߂�l int
        System.out.printf("lastIndexOf:%s\n", st1.lastIndexOf("Script"));
        // �w��̉ӏ��̈ꕶ����؂�o��
        System.out.printf("charAt:%s\n", st1.charAt(5));
        // �w��ʒu����n�܂镶�����C�ӂ̒����؂�o��(�擪�ʒu��0����n�܂�A�I���ʒu?1�܂�)
        System.out.printf("substring:%s\n", st1.substring(1, 4));
        // �������ϊ�
        System.out.printf("toLowerCase:%s\n", st1.toLowerCase());
        // �啶���ϊ�
        System.out.printf("toUpperCase:%s\n", st1.toUpperCase());
        // �O��̃X�y�[�X���폜�i�S�p�X�y�[�X�͏����ł��Ȃ��j
        System.out.printf("trim:%s\n", st2.trim());
        // �������u����
        System.out.printf("replace:%s\n", st1.replace(st1, "JavaAPI"));


        // ������̘A��
        StringBuilder sb = new StringBuilder();
        // �R���N�V����ArrayList
        ArrayList<String> array = new ArrayList<String>();
        array.add(st1);
        array.add(st2);
        array.add(st3);
        // �z����v�f��A�����Ĉꎞ�������ɋL�^
        for(String str : array) {
        sb.append(str);
        }
        // ����������ϐ���
        String result = sb.toString();
        System.out.printf("StringBuilder:%s\n", result);


        // ���K�\��
        Scanner sc = new Scanner(System.in);
        System.out.println("�Q?8�����ȓ��Ŗ��O����͂��Ă������B");
        String name = sc.nextLine();
        // matches
        if(name.matches("[a-zA-Z][a-zA-Z0-9]{1,7}")) {
            System.out.println("���͂������O�́F" + name + "�ł�");
        } else {
            System.out.println("�Q?8�����ȓ��A�擪�̐����̎g�p����сA�L���͎g�p�s�ł��B");
        }

        System.out.println("S����n�܂�id10������͂��Ō��E��t���Ă�����");
        String user_id = sc.nextLine();
        if(user_id.matches("^S.\\d{10}$E")) {
            System.out.println("���͂���id�́F" + user_id + "�ł�");
        } else {
            System.out.println("ID�̌`�����s���ł�");
        }
        
        // �������؂�
        String sn = "Q87F-FGJG-9889-KGJD";
        String[] serial = sn.split("[-]");
        for(String s : serial) {
            System.out.printf("%5s", s);  
        }
        System.out.println("\n");

        // �ꕔ�u����
        String str = "FizzBuzzFizzBuzzFizz";
        String rep = str.replaceAll("[B][a-z]{3}", "Fizz");
        System.out.println(rep);

    }  
}