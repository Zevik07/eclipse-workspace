package Buoi4Bai3;

import java.util.Scanner;

public class SDConVat {
	public static void main(String []args)
	{
		Scanner temp=new Scanner(System.in);
		System.out.print("Nhap so luong con vat: ");
		int n=temp.nextInt();
		ConVat a[]=new ConVat[n];
		int loai;
		for (int i=0;i<n;i++)
		{
			System.out.print("Nhap thong tin cho con vat thu "+(i+1));
			System.out.print("\nLoai con vat: 1.Bo 2.De 3.Heo ");
			loai=temp.nextInt();
			if (loai==1) {
				a[i]=new Bo();
			}
			else if (loai==2)
			{
				a[i]=new De();
			}
			else if (loai==3)
			{
				a[i]=new Heo();
			}
			a[i].nhap();
		}
		System.out.print("Cho cac con vat keu: ");
		for (int i=0;i<n;i++)
		{
			System.out.print(a[i]+" Keu: ");
			a[i].Keu();
		}
	}

}
