// ���C�u�����ǂݍ���
import java.util.*;

public class Fortune {
    public static void main(String[] args) {
        System.out.println("�悤�����A�肢�̊ق�");
        System.out.println("���Ȃ��̖��O����͂��Ă�������");
        // �X�L���i������
        Scanner sc = new Scanner(System.in);
        // �ʂ̏�����
        // String name = new java.util.Scanner(System.in).nextLine();
        // ���͂��ꂽ��������󂯎��
        String name = sc.next();
        System.out.println("���Ȃ��̔N�����͂��Ă�������");
        String ageString = sc.next();
        // String�^��int�^�ɃL���X�g,(int)�̕\�L�ł͎��iex:1 +2�j�ł͂Ȃ����߃G���[�ɂȂ�
        int age = Integer.parseInt(ageString);
        // �����W�F�l���[�^�[������
        Random rd = new Random();
        // �ʂ̏�����
        // int fortune = new java.util.Random().nextInt(num);
        // �O?�R�̂S�̐��l�������Ƃ��ė����𐶐�
        int fortune = rd.nextInt(4);
        // �C���N�������g�Ł{�P
        fortune++;
        System.out.println("�肢�̌��ʂ��o�܂���");
        System.out.println(age + "�΂�" + name + "����A���Ȃ��̋C�^�ԍ���" + fortune + "�ł�");
        System.out.println("1�F��g�@2�F���g�@3�F�g�@4�F��");
    }
}