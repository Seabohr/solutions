package coins;

public class Coins {

	public static void change(double a, double b) {
		a = a * 100;
		b = b * 100;
		double d = b - a;
		if (a > b) {
			System.out.println("Not enough pay");
			return;
		} else if (d == 0) {
			System.out.println("Exact payment");
			return;
		} else {
			for (int c = 1; c < 12; c++) {
				switch (c) {
				case 1:
					int n = 0;
					if (d > 1999) {
						while (d > 1999) {
							d = d - 2000;
							n++;
						}
						System.out.print(n);
						System.out.println(" £20");
						break;
					} else {
						break;
					}
				case 2:
					n = 0;
					if (d > 999) {
						while (d > 999) {
							d = d - 1000;
							n++;
						}
						System.out.print(n);
						System.out.println(" £10");
						break;
					} else {
						break;
					}
				case 3:
					n = 0;
					if (d > 499) {
						while (d > 499) {
							d = d - 500;
							n++;
						}
						System.out.print(n);
						System.out.println(" £5");
						break;
					} else {
						break;
					}
				case 4:
					n = 0;
					if (d > 199) {
						while (d > 199) {
							d = d - 200;
							n++;
						}
						System.out.print(n);
						System.out.println(" £2");
						break;
					} else {
						break;
					}
				case 5:
					n = 0;
					if (d > 99) {
						while (d > 99) {
							d = d - 100;
							n++;
						}
						System.out.print(n);
						System.out.println(" £1");
						break;
					} else {
						break;
					}
				case 6:
					n = 0;
					if (d > 49) {
						while (d > 49) {
							d = d - 50;
							n++;
						}
						System.out.print(n);
						System.out.println(" 50p");
						break;
					} else {
						break;
					}
				case 7:
					n = 0;
					if (d > 19) {
						while (d > 19) {
							d = d - 20;
							n++;
						}
						System.out.print(n);
						System.out.println(" 20p");
						break;
					} else {
						break;
					}
				case 8:
					n = 0;
					if (d > 9) {
						while (d > 9) {
							d = d - 10;
							n++;
						}
						System.out.print(n);
						System.out.println(" 10p");
						break;
					} else {
						break;
					}
				case 9:
					n = 0;
					if (d > 4) {
						while (d > 4) {
							d = d - 5;
							n++;
						}
						System.out.print(n);
						System.out.println(" 5p");
						break;
					} else {
						break;
					}
				case 10:
					n = 0;
					if (d > 1) {
						while (d > 1) {
							d = d - 2;
							n++;
						}
						System.out.print(n);
						System.out.println(" 2p");
						break;
					} else {
						break;
					}
				case 11:
					n = 0;
					if (d > 0) {
						while (d > 0) {
							d = d - 1;
							n++;
						}
						System.out.print(n);
						System.out.println(" 1p");
						break;
					} else {
						break;
					}

				}
			}

		}
	}

}
