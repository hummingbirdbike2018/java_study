public class Wand {
    private String name;     // 杖の名前
    private double power;    // 杖の魔力

    double getPower() {
        return this.power;
    }

    void setPower(double power) {
        if(power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("不正な数値を検出しました");
        }
        this.power = power;
    }

        String getName() {
        return this.name;
    }

    void setName(String name) {
        if(name == null || name.length() < 3) {
            throw new IllegalArgumentException("設定値が異常です");
        }
        this.name = name;
    }
}  