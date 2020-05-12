package Buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String []args)
	{
		//Tao hai phan so a va b
		PhanSo a=new PhanSo(3,7);
		PhanSo b=new PhanSo(4,9);
		System.out.print("Phan so a va b la: \n");
		a.toiGian();a.hienthiPhanso();
		System.out.print(" va ");
		b.toiGian();b.hienthiPhanso();
		//Tao, nhap va hien thi nghich dao hai phan so x va y
		PhanSo x=new PhanSo();
		PhanSo y=new PhanSo();
		System.out.print("\nNhap phan so x\n");
		x.nhapPhanso();
		System.out.print("Nhap phan so y\n");
		y.nhapPhanso();
		System.out.print("Gia tri nghich dao cua hai phan so x va y lan luot la"+x.giaTriNghichDao()+" va "+y.giaTriNghichDao());
		//Tinh tong x va y
		PhanSo tongxy=new PhanSo(x.cong(y));tongxy.toiGian();
		System.out.print("\nTong cua x va y la: ");tongxy.hienthiPhanso();
		//Nhap danh sach n phan so
		System.out.print("\nNhap so luong phan so: ");
		Scanner temp=new Scanner(System.in);
		int n=temp.nextInt();
		PhanSo ds[]=new PhanSo[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("Nhap phan so thu "+i+"\n");
			ds[i]=new PhanSo();
			ds[i].nhapPhanso();
		}
		//Tinh tong n phan so
		PhanSo tong=new PhanSo(ds[0]);
		PhanSo max=new PhanSo(ds[0]);
		for(int i=1;i<n;i++)
		{
			if (ds[i].gtThuc()>max.gtThuc()) {
				max=new PhanSo(ds[i]);
			}
			tong=tong.cong(ds[i]);
		}
		System.out.print("Tong ds la: ");tong.toiGian();tong.hienthiPhanso();
		System.out.print("\nPhan tu lon nhat la: ");max.hienthiPhanso();
		
	}
}
