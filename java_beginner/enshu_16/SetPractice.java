import java.util.*;

public class SetPractice {
    /*
    Setn�ɂ͏d���A�������Ȃ��B�����set(), get()���Ȃ� 
    */
    public static void main(String[] args) {
        // HashSet
        Set<String> s1 = new HashSet<String>();
        s1.add("1�ڂ̗v�f");
        // �����v�f��ǉ����悤�Ƃ��Ă����������
        s1.add("1�ڂ̗v�f");

        for(int i = 0; i < 10; i++) { 
            s1.add(i + "�ڂ̗v�f");
        }
        // �������o���o��
        for(String s : s1) {
            System.out.printf("HashSet��%2s\n", s);  
        }

        // LinkedHashSet
        Set<String> s2 = new LinkedHashSet<String>();
        for(int i = 0; i < 10; i++) { 
            s2.add(i + "�ڂ̗v�f");
        }
        // �i�[��������
        for(String s : s2) {
            System.out.printf("LinkedHashSet��%2s\n", s);  
        }

        Set<String> s3 = new TreeSet<String>();
        s3.add("orange");
        s3.add("mango");
        s3.add("apple");
        s3.add("banana");
        s3.add("pineapple");
        // ���S�����Â��AString�^�̏ꍇ��������
        for(String s : s3) {
            System.out.printf("TreeSet�̏o�́F%2s\n", s);  
        }
    }
}