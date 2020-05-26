package Buoi3;

import java.util.Scanner;
import java.util.Arrays;
public class SDSinhVien {
	public static void main(String []args)
	{
//		SinhVien a= new SinhVien();s
//		a.nhap();
//		a.nhapDiem();
//		a.dKy("LTHDT", "A+");
//		System.out.print(a.toString());
		
		//Tao mang danh sach sinh vien
		System.out.print("\nNhap so luong sinh vien: ");
		Scanner temp=new Scanner(System.in);
		int n= temp.nextInt();
		SinhVien ds[]=new SinhVien[n];
		for(int i=0;i<n;i++) {
			System.out.print("Nhap thong tin sinh vien thu "+(i+1)+"\n");
			ds[i]=new SinhVien();
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		//Hien thi danh sach vua nhap
		System.out.print("Danh sach sinh vien vua nhap la: \n");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+"."+ds[i].toString()+"\n");
		}
		System.out.print("Cac sinh vien bi canh bao hoc vu: \n");
		for(int i=0;i<n;i++)
		{
			if (ds[i].diemTB()<1) System.out.print((i+1)+"."+ds[i].toString()+"\n");
		}
		for (int i=0;i<n;i++)
		{
			for (int j=i;j<n;j++)
			{
				if (ds[i].tensv().charAt(ds[i].tensv().lastIndexOf(' ')+1)>ds[j].tensv().charAt(ds[j].tensv().lastIndexOf(' ')+1))
				{
//					SinhVien tmp=ds[i];
//					ds[i]=ds[j];
//					ds[j]=tmp;
					SinhVien tmp=new SinhVien(ds[i]);
					ds[i]=new SinhVien(ds[j]);
					ds[j]=new SinhVien(tmp);
				}
			}
		}
		
		System.out.print("DSSV sau khi da sap xep theo ten: \n");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+"."+ds[i].toString()+"\n");
		}
	}

}
