package Buoi1;
public class Bai3 {
	public static void main(String[] args) {
		double tong=0.0, n=0.0;
		double max=Double.parseDouble(args[0]);
		for (String x: args) {
			try {
				n = Double.parseDouble(x);
				if (n>max) max=n;
				tong+=n;
			}
			catch(Exception e)
			{
				n=0;
			}
		}
		System.out.print("Tong =" + tong);
		System.out.print("\nSo lon nhat la: "+max);
	}
}