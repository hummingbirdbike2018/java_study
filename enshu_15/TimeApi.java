// ���͂ŉ����ł��Ȃ��������K
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
        // 100����̓��t���`���������ɒu��������
        System.out.println(future.format(fmt));
    }  
}