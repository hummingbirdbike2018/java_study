import java.util.*;
import static java.lang.System.*; //static�ŃC���|�[�g���邱�Ƃɂ��N���X���錾���ȗ��ł���

public class Main {
	public static void main(String[] args) {
		StrongBox<String> sb1 = new StrongBox<String>(KeyType.PADLOCK);		//�Ǝ��R���N�V�����N���X��<���ꂽ���f�[�^�^>
		sb1.put("item");							
		out.println(sb1.get());
		}   
}