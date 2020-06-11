public class FuncList {
	public static boolean isOdd(int x) { return (x % 2 == 1); }	//受け取った数字が奇数か判別

	public String addNamePrefix(boolean male, String name) {	//性別を判別し、適切な呼称をつける
		if (male == true) {
			return "Mr." + name;
		} else {
			return "Ms." + name;
		}
	}
}