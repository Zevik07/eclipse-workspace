package Buoi4Bai3;

public class SDConVat {
	public static void main(String []args)
	{
		ConVat a[]=new ConVat[3];
		a[0]=new Heo();
		a[1]=new Bo();
		a[2]=new De();
		System.out.print("Nhap thong tinh cac con vat: ");
		for (int i=0;i<3;i++)
		{
			System.out.print("Nhap thong tin cho con vat thu "+(i+1));
			a[i].nhap();
		}
		System.out.print("Cho cac con vat keu: ");
		for (int i=0;i<3;i++)
		{
			a[i].Keu();
		}
	}

}
