public class Wand {
    private String name;     // ��̖��O
    private double power;    // ��̖���

    double getPower() {
        return this.power;
    }

    void setPower(double power) {
        if(power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("�s���Ȑ��l�����o���܂���");
        }
        this.power = power;
    }

        String getName() {
        return this.name;
    }

    void setName(String name) {
        if(name == null || name.length() < 3) {
            throw new IllegalArgumentException("�ݒ�l���ُ�ł�");
        }
        this.name = name;
    }
}  