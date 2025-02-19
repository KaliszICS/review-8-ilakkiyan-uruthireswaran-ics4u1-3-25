public class PracticeProblem {

	public static String pluralize(String str) {

		str = str.toLowerCase();

		if (str.endsWith("ife")) {
			return "ives";
		}

		else if (str.endsWith("ey")) {
			return "eys";
		}

		else if (str.endsWith("y")) {
			return "ies";
		}

		else {
			return "s";
		}

		
	}

	public static int min(int x, int y, int z) {
		if (x < z && x < y) {
			return x;
		}

		else if (y < x && y < z) {
			return y;
		}

		else {
			return z;
		}
	}

	public static boolean isLeapYear(int leapYear) {
		if (leapYear % 4 == 0) {
			if (leapYear % 100 == 0) {
				if (leapYear % 400 == 0) {
					return true;
		} else {
			return false;
		}
		} else {
			return true;
		}
	
	} else {
		return false;
	}
}
	public static void main(String args[]) {
		String result1 = pluralize("damn");
		System.out.println(result1);

		int result2 = min(4, 3, 5);
		System.out.println(result2);

		boolean result3 = isLeapYear(2012);
		System.out.println(result3);

	}

}


