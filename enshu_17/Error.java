import java.io.FileWriter;
import java.io.IOException;

public class Error {
    public static void main(String[] args) throws IOException {  //��O������������Ăяo�����ɗ�O��Ԃ��B
                                                                //main���\�b�h�����(JVM)���\�b�h�ł͂Ȃ��̂Ńv���O�����I��
        System.out.println("�N��");  
        throw new IOException();                                //�Ӑ}�I�ɗ�O�𔭐�������
    }
}