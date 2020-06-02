public class StringEdit {
    public static void main(String[] args) {
        // 15-1
        // StringBuilder������
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 100; i++) {
            //�ϐ�i�̌��ɃJ���}��t���ă������ɒǉ� 
            sb.append(i).append(",");
        }
        // ���������當����Ƃ��ďo��
        String n = sb.toString();

        System.out.println(n);
        // ��������J���}��؂�ŕ������Ĕz��Ɋi�[
        String[] numbers = n.split(",");
        // 
        for(String number : numbers) {
            System.out.print(number + " ");
        }

        // 15-2
        String folder = "c:\\user";
        String file = "text.txt";
        String fullPath = getFilePath(folder, file);
        System.out.println(fullPath);
    }

    public static String getFilePath(String folder, String file) {
        // ������folder�̏I��肪'\'�ŏI�����Ă��Ȃ��ꍇ�A������̍Ō��'\'��t����
        if(!folder.endsWith("\\")) {
            // folder += "\\";
            folder = String.format("%s\\", folder);
        }
        return folder + file;
    }

    // 15-3
    // [] �����ꂩ�̕����A[n-m] n����m�̂����ꂩ�A{} �J��Ԃ������A^������̍ŏ��A��������̍Ō�
    // �@.* �S�Ă̕�����
    // �AA\d{1,2} �ꕶ���� �啶��A(A), �񕶎��� ����(\d), �O������ {���O�̕������܂ށA1��ȏ�2��ȉ��̌J��Ԃ� = �������Ȃ�}
    // �BU[A-Z]{3} �ꕶ���� �啶��U �񕶎��� A-Z�̂����ꂩ �O������ {���O�������܂ށA3��ȏ�J��Ԃ� = �R?�S�����ڂ͉p�啶��

}
