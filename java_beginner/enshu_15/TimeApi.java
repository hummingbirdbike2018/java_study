/*
���͂ŉ����ł��Ȃ��������K
���ԑ���

*/
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeApi {
    public static void main(String[] args) {   
        // ���ݓ����擾(yyyy�[MM�[dd�j
        LocalDate now = LocalDate.now();
        // 100����̓����擾
        LocalDate future = now.plusDays(100);
        // �����ݒ�
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // 100����̓��t����Œ�`���������ɒu��������iformat(fmt)�j
        System.out.println(future.format(fmt));
    }  
}