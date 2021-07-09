package peer;

public class Calculate {

	public static String calculate(int x) {
		int y = 0;
		int z = x;
		for (int i = 1; i <= z; i++) {
			if (x % i != 0) {
				return "NONE";
			}
			x = x / i;
			y++;
			if (x == 1) {
				return y + "!";
			}
		}
		return null;
	}
}
