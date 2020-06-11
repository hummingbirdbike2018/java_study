import java.util.*;
import java.util.stream.*;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        /*
        ��P���I�u�W�F�N�g
        �f�[�^�F�����╶��
        �f�[�^�\���F�z��A���X�g
        �C���X�^���X
        �֐��FIPO�\���𔺂��������W�b�N
        */

        /*
        ���\�b�h�Ɗ֐��̈Ⴂ
        ���\�b�h�̓N���X�ɑ�������̊֐�
        �֐��̓��\�b�h��ϐ��ɑ���ł��A�������邱�Ƃ��ł���
        �C���^�[�t�F�[�X�� �ϐ��� = �������郁�\�b�h����������N���X::���\�b�h��
        */
        MyFunction func = Main::sub; // �錾�����C���^�t�F�[�X�^�ɑ��, ���̂����������̂ł͂Ȃ��Q�Ƃ���`
    	int a = func.call(5, 3);	// �C���^�t�F�[�X�̃��\�b�h�ŌĂяo��
        System.out.println("5-3��" + a);
        /*
        �����_��
        �֐������̏�Œ�`���A�Ăяo�����Ƃ��ł���
        */
        // �u2�̈����̍������߂鏈���v�̎��̂𐶂ݏo���A�������
        // (�^ �������P, ������2...)-> {�����P�C ����2... return �߂�l} 
        MyFunction func2 = (int b, int c) -> {return b - c; }; // �����Ŋ֐��̎��̂����������
        int d = func2.call(5, 3);	/* �C���^�t�F�[�X�̃��\�b�h�ŌĂяo�� */
        System.out.println("5-3��" + d);
        /* �ȗ��L�@
        1.�^���ȗ��ł���
        IntBinaryOperator function = (a) -> {return a * a; }; 
        2.�������P�݂̂̏ꍇ())���ȗ��ł���
        IntBinaryOperator function = a -> {return a * a; }; 
        3.�P��return���̏ꍇreturn,{}���ȗ��ł���
        IntBinaryOperator function = a ->  a * a; 
        */
        
        /*
        �O���u���b�N�ւ̃A�N�Z�X
        �A�N�Z�X�\�ȕϐ��������_�����œǂݍ��߂邪�A�ύX�͂ł��Ȃ�
        */
        int x = 10;
        MyFunction2 func3 = e -> e - x; 

        /* �R���N�V�����ł悭�s������ */
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        // �e�v�f���Q�{�ɂ���(�����_��)
        /* stream�C���X�^���X������foreach���\�b�h��
        �����P�̊֐��I�u�W�F�N�g���󂯎��A�R���N�V�����̊e�v�f�֊֐������s���� */
        list1.stream().forEach(i -> System.out.println(i * 2));
        // ���񏈗���
        list1.parallelStream().forEach(i -> System.out.println(i * 2));
        // �e�v�f�ɑ΂�sleep���Ăяo��(�����_��)
        // list1.stream().forEach(i -> i.sleep());                      //�R���p�C���G���[sleep��������Ȃ�,Thread

        // �z��ɑ΂�stream
        int[] data = {1, 2, 3};
        IntStream its = Arrays.stream(data);

    }

    public static int sub(int a, int b) {
        return a - b; 
    }
} 