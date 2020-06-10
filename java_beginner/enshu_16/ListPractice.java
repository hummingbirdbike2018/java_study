// �R���N�V�������g�����߂�import
import java.util.*;

public class ListPractice {
	public static void main(String[] args) {
		/*
		ArrayList���z��ƈقȂ�_
		�錾���̗v�f���w��Ȃ��A�ォ��v�f��ǉ��ł���
		�C���X�^���X���i�[�ł��邪��{�f�[�^�^�͊i�[�ł��Ȃ�
		��{�f�[�^�^���i�[����ꍇ�A�Ή����郉�b�p�[�N���X�̃C���X�^���X���g��
		��Fint -> Integer, double -> Double
		*/
		// Integer�^�C���X�^���X���i�[����ArrayList��錾
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// ���X�g�֗v�f��ǉ�, �ǉ��������ɘA�ԂɂȂ�
		numbers.add(10);
		numbers.add(20);
		// 0�Ԗڂ̗v�f���擾
		System.out.printf("0�Ԗڂ̗v�f�F%d\n", numbers.get(0));
		// 0�Ԗڂɗv�f��ǉ��B���ɗv�f�����݂���ꍇ�A���荞�݂ő}������B
		numbers.add(0, 40);
		System.out.printf("add���0�Ԗڂ̗v�f�F%d\n", numbers.get(0));
		// �O�Ԗڂ̗v�f���㏑��
		numbers.set(0, 30);
		System.out.printf("set���0�Ԗڂ̗v�f�F%d\n", numbers.get(0));
		// �O�Ԗڂ̗v�f����菜��, �v�f�ԍ����O�ɋl�߂���
		numbers.remove(0);
		// numbers�̗v�f�����`�F�b�N
		System.out.printf("remove���0�Ԗڂ̗v�f�F%d\n", numbers.get(0));
		System.out.printf("numbers�̗v�f���F%d\n", numbers.size());
		
	
		// �g��for�ŗv�f�����o��
		for(int num : numbers) {
			System.out.println(num);
		}

		// for�ŗv�f�����o��
		// �����񐔁��v�f���Ȃ̂�for��p����
		for(int num = 0; num < numbers.size(); num++) {
			System.out.println(numbers.get(num));  
		}

		// �C�e���[�^�i�����q�j�Ŏ��o�� 
		Iterator<Integer> it = numbers.iterator();
		// �����񐔂��s���̂���While��p����
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);  
		}

		// �v�f��S�Ď�菜��
		numbers.clear();
		System.out.printf("clear���numbers�̗v�f���F%d\n", numbers.size());
		// �v�f���󂩔��ʂ���ۂ�isEmpty�̕��������I
		if(numbers.isEmpty()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		/*
		LinkedList
		ArrayList�ƈႢ�v�f�̑}���A�폜�Ɍ����Ă��邪�A�v�f�̎��o���͕s����
		���\�b�h��List�Ɠ���
		*/
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(1);
		list.add(1, 40);
		System.out.println(list.get(2));

		for(int n : list) {
			System.out.println(n);  
		}
	}


}