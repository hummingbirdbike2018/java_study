import java.util.*;

public class AdvancedCollectionPractice {
	public static void main(String[] args) {
        // String�^�L�[�AList�^�l��Map
        Map<String, List<String>> pref = new HashMap<>();
        List<String> l1 = new ArrayList<>();    //���X�g�P
        l1.add("�");
        l1.add("����҂傤");
        l1.add("����");
        pref.put("�Ȗ،�", l1);                 //Map�փL�[��Y���Ēǉ�
        List<String> l2 = new ArrayList<>();
        l2.add("�؎�");
        l2.add("�ώ�");
        l2.add("���i");
        pref.put("�����s", l2);
        List<String> l3 = new ArrayList<>();
        l3.add("�D��");
        l3.add("�l�`");
        l3.add("�Е�");
        pref.put("���s�{", l3);

        for(String key : pref.keySet()) {       //Map�̃L�[�ꗗ�i�s���{�����j���擾
            System.out.println(key);            //�s���{��
            for(String value : pref.get(key)) { //�L�[���烊�X�g���̒l���擾
                System.out.println("���Y�i�F" + value); 
            } 
        }
	}
}