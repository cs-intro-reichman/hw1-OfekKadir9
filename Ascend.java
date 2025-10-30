// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int number = Integer.parseInt (args[0]);
		double a = Math.random() * number;
		double b = Math.random() * number;
		double c = Math.random() * number;
		double min12 = Math.min(a, b);
		double min123 = Math.min(min12, c);
		double max12 = Math.max(a, b);
		double max123 = Math.max(max12, c);
		double max23 = Math.max(b, c);
		double max13 = Math.max(a, c);
		double minmax1223 = Math.min(max12,max23);
		double mid123 = Math.min(minmax1223,max13);
		System.out.println((int) max123 + " " + (int) min123 + " " +
							(int) mid123);
		System.out.println((int) min123 + " " + (int) mid123 + " " +
							(int) max123);
	}
}
