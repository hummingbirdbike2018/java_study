import java.io.FileWriter;
import java.io.IOException;

public class Error {
    public static void main(String[] args) throws IOException {  /* ��O������������Ăяo�����ɗ�O��Ԃ��B
                                                                    main���\�b�h�����(JVM)���\�b�h�ł͂Ȃ��̂Ńv���O�����I�� */
        System.out.println("�N��");  
        throw new IOException();                                //throw new�ňӐ}�I�ɗ�O�𔭐�������
    }
}

/*
throws����ꍇ�͕K���Ăяo�����N���X�ɂė�O��`�d����\�������郁�\�b�h�Ăяo�����L���b�`���Ȃ��Ă͂Ȃ�Ȃ�
��O�̓`�d�ɂ��A�Ăяo����ŗ�O���Ăяo������main���\�b�h��JVM���v���O������~�ƂȂ�
*/