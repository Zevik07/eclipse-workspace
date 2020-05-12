package Buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main (String []args)
	{
		//danh sach n loai gach
		Scanner temp=new Scanner(System.in);
		int n=temp.nextInt();
		Gach ds[]=new Gach[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("\nNhap thong tin loai gach thu "+(i+1));
			ds[i]=new Gach();
			ds[i].nhapHopGach();
		}
		//Hien thi thong tin cac loai gach vua nhap
		Gach cpthap=new Gach(ds[0]);
		for (int i=0;i<n;i++)
		{
			ds[i].xuatHopGach();
			if (ds[i].gia1Hop()/ds[i].dientichNenToiDa()<cpthap.gia1Hop()/cpthap.dientichNenToiDa()) cpthap=new Gach(ds[i]);
		}
		//Loai gach co chi phi lot thap nhat la
		System.out.print("\nLoai gach co chi phi thap nhap la: ");cpthap.xuatHopGach();
		//Khi lot nen co chieu ngang 5m va chieu dai 20m
		for (int i=0;i<n;i++)
		{
			System.out.print("\nChi phi khi lot loai gach thu "+(i+1)+"la: "+ds[i].soluongHopGachLot1Nen(10,5));
		}
		
	}
}
