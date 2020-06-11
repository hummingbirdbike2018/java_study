public class FuncList {
	public static boolean isOdd(int x) { return (x % 2 == 1); }	//ó‚¯æ‚Á‚½”š‚ªŠï”‚©”»•Ê

	public String addNamePrefix(boolean male, String name) {	//«•Ê‚ğ”»•Ê‚µA“KØ‚ÈŒÄÌ‚ğ‚Â‚¯‚é
		if (male == true) {
			return "Mr." + name;
		} else {
			return "Ms." + name;
		}
	}
}