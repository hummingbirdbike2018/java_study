public class Main {
    public static void main(String[] args) {
        Thief tf1 = new Thief("�A�T�J", 50, 10); //���O�AHP�AMP
        Thief tf2 = new Thief("�A�T�J", 60);
        Thief tf3 = new Thief("�A�T�J");

        System.out.println(tf1.name + " �E�ƁF����" + "HP�F" + tf1.hp + "MP�F" + tf1.mp + "���쐬����܂����B");
        System.out.println(tf2.name + " �E�ƁF����" + "HP�F" + tf2.hp + "MP�F" + tf2.mp + "���쐬����܂����B");
        System.out.println(tf3.name + " �E�ƁF����" + "HP�F" + tf3.hp + "MP�F" + tf3.mp + "���쐬����܂����B");
    }
}
