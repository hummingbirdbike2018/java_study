public class Food {
    public static void main(String[] args) {
        int isHungry = new java.util.Random().nextInt(2);
        String food = "���ɂ���";
        // isHungry�̒l���O�Ɠ����Ȃ��
        if(isHungry == 0) {
            System.out.println("�����ł�");
        }else{
            System.out.println("�󕠂ł�");
            System.out.println(food + "�����������܂�");
            System.out.println("������������");
        }

        }
}