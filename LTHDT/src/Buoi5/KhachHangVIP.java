package Buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang {
	private float discount;
	public double Tile()
	{
		return discount;
	}
	public void nhap()
	{
		Scanner temp= new Scanner(System.in);
		super.nhap();
		System.out.print("\nNhap ti le: ");
		discount=temp.nextFloat();
	}
	public void xuat()
	{
		super.xuat();
		System.out.print("Discount: "+discount);
	}
}
