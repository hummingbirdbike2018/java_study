import java.util.*;

interface Func1 {
    public abstract boolean call(int x);
}

interface Func2 {
    public abstract String call(boolean m, String n);
}

public class Main {
	public static void main(String[] args) {    
        /*
        �����̗���
        new -> Func2=FuncList.addNamePrefix -> Func2.call 
        */
        FuncList fl = new FuncList();           //�C���X�^���X������static���\�b�h�ɃA�N�Z�X�ł���悤�ɂ���
        Func1 fl1 = FuncList::isOdd;            //�O���N���X�̃��\�b�h���C���^�[�t�F�[�X�̃��\�b�h�ɑ��
        Func2 fl2 = fl::addNamePrefix;          //��static���\�b�h�փA�N�Z�X�A��L�Ɠ��l�̏���
        System.out.println(fl1.call(33));
        System.out.println(fl2.call(true, "Suzuki"));

        // 6-2
        // Func1 fl3 =  x -> x % 2 == 1;
        // Func2 fl4 =  (male, name) {
        //     if(male == true) {
        //         return "Mr." + name;
        //     } else {
        //         return "Ms." + name;
        //     }
        // } 
    }
}