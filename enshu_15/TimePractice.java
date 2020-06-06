import java.time.*;
import java.time.format.*;

public class TimePractice {
	public static void main(String[] args) {
        // TimeAPI
        // ���ݓ����擾 �G�|�b�N����
        Instant i1 = Instant.now();
        // long->Instant
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        // Instant->long
        long l = i2.toEpochMilli(); 
        // ���ݓ������擾 ZoneId����
        ZonedDateTime z1 = ZonedDateTime.now();
        // ���w�肵�Ď擾
        ZonedDateTime z2 = ZonedDateTime.of(2020,6,6,22,43,10, 11, ZoneId.of("Asia/Tokyo"));
        // ZonedDateTime->Instant
        Instant i3 = z2.toInstant();
        // Instant->ZonedDateTime
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
        // ZonedDateTime�̂������������o��
        System.out.println("����:"+ z1.getYear() + z1.getMonth() + z1.getDayOfMonth() + z1.getHour() + z1.getMinute());
        
        // �����u�Ԃ����� isEqual
        if(z2.isEqual(z3)) {
            System.out.println("�����u�Ԃł���");  
        }

        //ZonedDateTime��ZoneId�Ȃ���->�B���Ȏ���
        //���ݓ����擾 
        LocalDateTime l1 = LocalDateTime.now();
        System.out.println(l1);
        // LocalDateTime->ZonedDateTime ZoneId����t�^
        ZonedDateTime z4 = l1.atZone(ZoneId.of("Asia/Tokyo"));
        // ZonedDateTime->LocalDateTime 
        LocalDateTime l2 = z4.toLocalDateTime();
        // �t�H�[�}�b�g�`����ݒ�
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // �t�H�[�}�b�g�`���������Ȃ�
        LocalDate l3 = LocalDate.parse("2020/06/10", fmt);
        System.out.println(l3);  
        String today = l2.format(fmt);
        System.out.println(today);

        // �����̓��t���擾
        // 10����
        l1 = l1.plusDays(10);
        System.out.println(l1.format(fmt));
        // 1������
        l1 = l1.plusMonths(1);
        System.out.println(l1.format(fmt));
        
        //�ߋ��̓��t���擾
        // 1�T�ԑO
        l1 = l1.minusWeeks(1);
        System.out.println(l1.format(fmt));
        // �P�N�O
        l1 = l1.minusYears(1);
        System.out.println(l1.format(fmt));
        
        // ���݂̓��t
        LocalDate now = LocalDate.now();
        // ���݂���100����̓��t
        LocalDate pdate = now.plusDays(100);
        // now��pdate���O�̓��t���ɂ����邩
        if(now.isBefore(pdate)) {
            System.out.println("100����͖����̓��t");
        }
        // now��pdate����̓��t���ɂ����邩
        if(now.isAfter(pdate)) {
            System.out.println("100����͉ߋ��̓��t");
        }

        /*
        ���Ԃ�\���N���X
        Duration:���E���E�b
        Period:�����x�[�X
        */
        LocalDate d1 = LocalDate.of(2020,6,1);
        LocalDate d2 = LocalDate.of(2020,6,30);
        
        //�����̒l��������Z
        Period p1 = Period.ofDays(7);
        // �����P�A�Q���Ԃ̓���
        Period p2 = Period.between(d1, d2);
        // �����̒l��N���Z
        Period p3 = Period.ofMonths(1);

        System.out.println(p1); //P7D 
        System.out.println(p2); //P29D
        System.out.println(p3); //P1M
        
        LocalDateTime ldt1 = LocalDateTime.of(2020, 06, 01, 10, 00, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2020, 06, 01, 11, 30, 30);
        // �����P�A�Q�̊��Ԃ̍����������b
        Duration dr1 = Duration.between(ldt1, ldt2); 
        // �w��xxxx����n��m���̒P�ʂɂ���
        Duration dr2 = Duration.ofMinutes(999999L); 

        System.out.println(dr1);  //PT1H30M30S
        System.out.println(dr2);  //PT16666H39M


	}
}