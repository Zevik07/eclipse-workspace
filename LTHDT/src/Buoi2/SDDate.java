package Buoi2;
import java.util.Scanner;
public class SDDate {
	public static void main (String []args)
	{
		Scanner temp=new Scanner(System.in);
		Date test=new Date();
		test.nhap();
		System.out.println("Ngay hom sau la: ");
		test.ngaySau().in();
		System.out.println("Moi ban nhap so ngay muon cong them: ");
		test.congNgay(temp.nextInt()).in();
	}
}
