import java.util.*;

public class Main {
    // 16-1
    // ���̊e�����i�[����K�؂ȃR���N�V�����́H
    // �S�V�s���{���̖��O�A�����s�⁨�P�Ƃ̏��̏W�܂�ŏd���͂Ȃ��̂�set
    // �T�l�̃e�X�g�̓_�����P�Ƃ̏��̏W�܂�ŏd�������肦��̂�list
    // �ߋ��̑�����b�̖��O�ƔC���A�����s�⁨�y�A���i���O�A�C��)�Ȃ̂�map
	public static void main(String[] args) {
        // 16?2
        Hero h1 = new Hero("���");
        Hero h2 = new Hero("�֓�");
        List<Hero> heros = new ArrayList<Hero>();   //Hero�^heros���X�g
        heros.add(h1);                              //������name�t�B�[���h�܂Ŏ擾���悤�Ƃ���Ɩ߂�l��String�̂��߃G��?�ɂȂ�
        heros.add(h2);
        
        Iterator<Hero> it = heros.iterator();       //�C���e���[�^��Hero�^��heros���X�g���v�f���Q��
        while(it.hasNext()) {                       //hasNext�ŗv�f�������邩����
            Hero e = it.next();                     //next�ŗv�f���w���A�^��Ԃ�
            System.out.println(e.getName());        //������getName����name�t�B�[���h�擾
        }

        // �g��for��
        for(Hero hero : heros) {
            System.out.println(hero.getName()); 
        } 

        // for��
        for(int i = 0; i < heros.size(); i++) {
            System.out.println(heros.get(i).getName()); //heros���X�g����i�Ԗڂ�name�t�B�[���h
        }

        // 16?3
        Map<Hero, Integer> gots = new HashMap<Hero, Integer>();     //Hero,Integer���y�A�Ƃ���gots(���j��)�}�b�v
        gots.put(h1, 1);                                            //put�ŗv�f�ǉ�
        gots.put(h2, 5);
        int gc1 = gots.get(h1);                                     //�L�[�ƕR�Â����l���擾
        System.out.println(h1.getName() + "�̌��j����" + gc1);
        System.out.println(gots.size());                            //map���̃y�A�����擾

        for(Hero key : gots.keySet()) {                             //gots�}�b�v�̂��L�[�v�f���}�b�v�ϐ�key�֏��ɓ���Ă���
            // System.out.println(key);                             //Hero�I�u�W�F�N�g��key�A���j����Integer�^�̂���Hero�I�u�W�F�N�g�ɂ͑��݂��Ȃ�
            int value = gots.get(key);                              //gots�}�b�v�̂���(�l)���擾���A�ϐ��ɓ����
            System.out.println(key.getName() + "�̌��j����" + value); //h1.name
                }
	}
}