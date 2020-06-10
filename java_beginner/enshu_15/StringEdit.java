public class StringEdit {
    public static void main(String[] args) {
        // 15-1
        // StringBuilder������
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 100; i++) {
            //�ϐ�i�̌��ɃJ���}��t���ă������ɒǉ� 
            sb.append(i).append(",");
        }
        // �I�u�W�F�N�g���當����֕ϊ�
        String n = sb.toString();

        System.out.println(n);
        // ��������J���}��؂�ŕ���(split)���Ĕz��Ɋi�[
        String[] numbers = n.split(",");

        for(String number : numbers) {
            System.out.print(number + " ");
        }

        // 15-2
        String folder = "c:\\user";
        String file = "text.txt";
        String fullPath = getFilePath(folder, file);
        System.out.println(fullPath);
        // printf��format�i)�{println�������Ɏ��s�ł���
        System.out.printf("%03d", 3);
    }

    public static String getFilePath(String folder, String file) {
        // ������folder�̏I��肪'\'�ŏI�����Ă��Ȃ��ꍇ�A������̍Ō��'\'��t����
        if(!folder.endsWith("\\")) {
            /*
            %s��folder�ɓ����Ă��镶����
            "% �C��(,�R�����̃J���}�A-���񂹓�) ��(�\�������Anm�w��őS��n���A�����ȉ�m��) �^�id����, s������, f����, b�^�U)"
            ������0�𓪂ɂ���Ə����Ƃ��ďo�͂����B("%02d", 5)�̏ꍇ�A05�Əo�́B("%10d", 5)�̏ꍇ�A�T�̑O��9�������̃X�y�[�X������
            format("�����w��", �p�����[�^, �p�����[�^...)
            */
            folder = String.format("%s\\", folder);
        }
        return folder + file;
    }

    
    /*
    15-3 ���K�\��
    [] �����ꂩ�̕����A[n-m] n����m�̂����ꂩ�A{} ���O�̕����̌J��Ԃ��񐔁A^������̍ŏ��A��������̍Ō�
    No.1 .* �S�Ă̕�����
    No.2 A\d{1,2} �ꕶ���� �啶��A(A), �񕶎��� �S�Ă̐���(\d), �O������ {���O�̕������܂ށA1��ȏ�2��ȉ��̌J��Ԃ� = ������or�Ȃ�}
    No.3 U[A-Z]{3} �ꕶ���� �啶��U �񕶎��� A-Z�̂����ꂩ �O������ {���O�������܂ށA3��ȏ�J��Ԃ� = �R?�S�����ڂ͉p�啶��
    */
}
