import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.*;

public class Main {
	public static void main(String[] args) throws Exception {
        
        /*
        �ʃA�v���[�`
        Files��copy���\�b�h�̈����Ƃ���Paths.get(�R�}���h���C������)���w��
        */
        // Files.copy(Paths.get(args[0]), Paths.get(args[1]));
        String iFile = args[0];                                     //�R�s�[���t�@�C��
        String oFile = args[1];                                     //�R�s�[��t�@�C��
        FileInputStream fis = new FileInputStream(iFile);           //���葤�X�g���[���J�n
        FileOutputStream fos = new FileOutputStream(oFile);         //�󂯑��X�g���[���J�n
        int i = fis.read();                                         //���葤���󂯂����e��int�^�֓����
        while(i != -1) {                                            //�ǂݍ��݂ł�����e���Ȃ��Ȃ�܂Łi?1�j
            fos.write(i);                                           //�󂯑���1�������n��
            i = fis.read();                                         //���葤���玟�̓��e���󂯎��
        }
        fos.flush();                                                //�󂯑��ւ������e�������o���悤JVM�֎w��
        fos.close();                                                //�󂯑��X�g���[���I��
        fis.close();                                                //���葤�X�g���[���I��
        /*
        ���s����
        ���t�@�C�������݂��Ȃ��ꍇ            NoSuchFileException  
        �R�s�[��̓����t�@�C�������݂���ꍇ    FileAlreadyExistsException
        */

    }
}