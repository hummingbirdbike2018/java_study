import jdk.jfr.StackTrace;

public class Main {
	public static void main(String[] args) {
        try {
            // 17?1, 17-2
            // String s = null;
            // 17-3
            int i = Integer.parseInt("�O");      //NumberFormatException
            // System.out.println(s.length());     //NullPointerException  
        } catch(Exception e) {                  //���Ԑ�
            System.out.println("--�X�^�b�N�g���[�X��������--");  
            System.out.println(e);  
            System.out.println("--�X�^�b�N�g���[�X�����܂�--");  
        }
	}
}