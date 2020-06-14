import java.io.*;
import java.util.*;
import java.util.zip.GZIPOutputStream;

public class Main2 {
	public static void main(String[] args) {
        String iFile = args[0];                             //���k�����O�̃t�@�C����
        String oFile = args[1];                             //���k������̃t�@�C����
        FileInputStream fis = null;                         //���͑��X�g���[���Atrycatch�u���b�N�̊O�ŏ�����
        GZIPOutputStream gzos = null;                       //���k�X�g���[�� �A��L�Ɠ��l
        // ���������������e
        try {
            fis = new FileInputStream(iFile);                               //���͑��X�g���[���J�n
            FileOutputStream fos = new FileOutputStream(oFile);             //�󂯑��X�g���[���J�n
            BufferedOutputStream bos = new BufferedOutputStream(fos);       //�󂯑��̃o�b�t�@�����i������x���߂ď����j�J�n
            gzos = new GZIPOutputStream(bos);                               //���k�X�g���[���J�n
            int i = fis.read();                                             
            while(i != -1) {
                i = fis.read();
            }
            gzos.flush();                                                   //���k�����𒼂��Ɏ��s
            gzos.close();                                                   //���k�X�g���[���I��
            fis.close();                                                    //���͑��X�g���[���I��
            // ��O
            } catch(IOException e) {
                System.out.println("�t�@�C������Ɏ��s���܂���");
            //��O����
            try {
                if(fis != null) {                                           //���̓X�g���[������łȂ��ꍇ�A���͑��X�g���[�����I������
                    fis.close();
                }
                if(gzos != null) {                                          //���k�X�g���[������łȂ��ꍇ�A���k�X�g���[�����I������
                    gzos.close();
                }
            // ��O���������邱�Ƃɂ���Ĕ��������O
            } catch(IOException e2) {
                ;                                               //�ł�͂Ȃ����ߏ����Ȃ�
            }
        }
    }
}
/*
���s����
text.txt�t�@�C����copy.txt.gz�t�@�C���Ƃ��ďo��
��̃A�[�J�C�u���쐬���ꂽ
fos(�o��) > bos(�u�b�t�@) > gzos(���k) > fis(����)
���k�����ƃo�b�t�@�������i�t�B���^
*/
