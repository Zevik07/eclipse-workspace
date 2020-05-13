package Buoi4;

import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String []args)
	{
		//Tao ds sinh vien CNTT
		System.out.print("Nhap so luong sinh vien: ");
		Scanner temp=new Scanner(System.in);
		int n=temp.nextInt();
		SinhVienCNTT ds[]=new SinhVienCNTT[n];
		for (int i=0;i<n;i++)
		{
			ds[i]=new SinhVienCNTT();
			ds[i].nhap();
		}
		//Danh sach sinh vien vua nhap la
		System.out.print("-----------Danh sach sinh vien vua nhap la: -----------\n");
		for (int i=0;i<n;i++)
		{
			System.out.print((i+1)+". "+ds[i].toString()+"\n");
		}
		System.out.print("------------------------Xong---------------------------\n");
		//Tim thong tin dua vao email
		System.out.print("Nhap email sinh vien can tim: ");
		Scanner temp1=new Scanner(System.in);
		String emailtmp=temp1.nextLine();
		for (int i=0;i<n;i++)
		{
			if (ds[i].getEmail().equals(emailtmp))
				System.out.print("Ket qua: " + ds[i].toString());
		}

	}
}
