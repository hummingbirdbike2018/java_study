public class FuncList {
	public static boolean isOdd(int x) { return (x % 2 == 1); }	//�󂯎�����������������

	public String addNamePrefix(boolean male, String name) {	//���ʂ𔻕ʂ��A�K�؂Ȍď̂�����
		if (male == true) {
			return "Mr." + name;
		} else {
			return "Ms." + name;
		}
	}
}