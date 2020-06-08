import java.util.*;

public class MapPractice {
    /*
    Map�̓L�[�ƒl���R�Â����v�f�̏W�܂�
    PHP�Ō����Ƃ���̘A�z�z��
    �L�[�̏d���͕s�����l�̏d���͉�
    */
	public static void main(String[] args) {
        // HashMap
        Map<String, Integer> mp1 = new HashMap<>();
        // add�ł͂Ȃ�put
        mp1.put("key1", 1);
        // �����L�[��put����Ə㏑�������
        mp1.put("key1", 2);

        
        for(int i = 1; i <= 10; i++) {
            mp1.put("key"+i, i);
        }

        // �L�[�Œl���擾
        System.out.println(mp1.get("key1"));
        // �i�[����Ă���L�[�Z�b�g��S�Ď擾
        System.out.println(mp1.keySet());

        // �l�̎��o��, �����͕ۏ؂���Ȃ�
        for(String key : mp1.keySet()) {    //�L�[�Z�b�g��S�Ď擾
            int value = mp1.get(key);       //�L�[�ɕR�Â��l���擾
            System.out.printf("HashMap�̏o��:�L�[%s�l%d\n", key, value);
        }


        // LinkedHashMap
        Map<String, String> mp2 = new LinkedHashMap<>();

        for(int i = 1; i <= 10; i++) {
            mp2.put("key" + i, "value" + i);
        }
        // �l�̎��o���A�i�[��
        for(String key : mp2.keySet()) {    
            String value = mp2.get(key);       
            System.out.printf("LinkedHashMap�̏o��:�L�[%s�l%s\n", key, value);
        }

        // TreeMap
        Map<Integer, String> mp3 = new TreeMap<>();
        mp3.put(3, "orange");
        mp3.put(2, "banana");
        mp3.put(5, "lemon");
        mp3.put(1, "mango");
        mp3.put(4, "apple");

        // �l�̎��o���Akey��������
        for(int key : mp3.keySet()) {    
            String value = mp3.get(key);       
            System.out.printf("TreeMap�̏o��:�L�[%d�l%s\n", key, value);
        }
	}
}