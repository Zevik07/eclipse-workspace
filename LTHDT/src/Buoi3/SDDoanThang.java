package Buoi3;

import Buoi2.Diem;

public class SDDoanThang {
	public static void main (String []args)
	{
		// Tao hai diem A,B
		Diem A=new Diem(2,5);
		Diem B=new Diem(20,35);
		DoanThang AB= new DoanThang(A,B);
		AB.tinhTien(5,3);
		//Hien thi doan AB
		System.out.print("\nDoan thang AB co toa do: ");
		AB.xuat();
		//Tao va nhap doan CD
		System.out.print("\n Nhap doan thang CD: ");
		DoanThang CD= new DoanThang();
		CD.nhap();
		System.out.print("\nDoan thang CD co toa do: ");
		CD.xuat();
		System.out.print("\n"+CD.soDoGoc());
	}
}
