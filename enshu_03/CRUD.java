public class CRUD {
    public static void main(String[] args) {
        System.out.print("[���j���[]1�F�����@2�F�o�^�@3�F�폜�@4�F�ύX�@��");
        int selected = new java.util.Scanner(System.in).nextInt();
        // selected�̒l��
        switch(selected) {
            // �P�̂Ƃ�
            case 1 :
                System.out.println("�������܂�");
                // break���Ȃ��Ǝ��̏��������s�����
                break;
            // �Q�̂Ƃ�
            case 2 :
                System.out.println("�o�^���܂�");
                break;
            // �R�̂Ƃ�
            case 3 :
                System.out.println("�폜���܂�");
                break;
            // �S�̂Ƃ�
            case 4 :
                System.out.println("�ύX���܂�");
                break;
            default :
            System.out.println("�Y�����j���[������܂���");
        }
    }
}