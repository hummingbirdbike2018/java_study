import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // ���ݓ�����date�^�Ŏ擾
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        // �擾������������Calender�ɃZ�b�g
        c.setTime(now);
        // Calender������̐��l���擾
        int day = c.get(Calendar.DAY_OF_MONTH);
        // �擾�����l�Ɂ{100����Calender�̓��ɃZ�b�g
        //  day += 100;
        //  c.add(Calendar.DAY_OF_MONTH);
        c.add(Calendar.DAY_OF_MONTH, 100);
        // Calender��������Date�^�ɕϊ�
        // Date future = c.getTime();
        now = c.getTime();
        // SimpleDataFormat�Ŏw�肳�ꂽ�`����Date�C���X�^���X�̓��e�\��
        SimpleDateFormat f = new SimpleDateFormat("yyyy�NMM��dd��");
        String s = f.format(now);
        // System.out.println(f.format(future);
        System.out.println(s);
    }
}