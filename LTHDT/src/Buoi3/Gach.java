package Buoi3;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int soluong;
	private int chieudai;
	private int chieungang;
	private long gia;
	public Gach()
	{
		maso=mau="0";
		soluong=chieudai=chieungang=0;
		gia=0;
	}
	public Gach(String maso, String mau, int soluong, int chieudai,int chieungang,long gia)
	{
		this.maso=maso;
		this.mau=mau;
		this.soluong=soluong;
		this.chieudai=chieudai;
		this.chieungang=chieungang;
		this.gia=gia;
	}
	public Gach(Gach a)
	{
		maso=a.maso;
		mau=a.mau;
		soluong=a.soluong;
		chieudai=a.chieudai;
		chieungang=a.chieungang;
		gia=a.gia;
	}
	public void nhapHopGach()
	{
		System.out.print("\nNhap ma so, mau, so luong, chieu dai, chieu ngang va gia cua vien gach");
		Scanner temp=new Scanner(System.in);
		maso=temp.next();
		mau=temp.next();
		soluong=temp.nextInt();
		chieudai=temp.nextInt();
		chieungang=temp.nextInt();
		gia=temp.nextLong();
	}
	public void xuatHopGach()
	{
		System.out.print("\nMaso: "+maso+" Mau: "+mau+" Soluong: "+soluong+" Chieudai: "+chieudai+" Chieungang: "+chieungang+" Gia: "+gia);
	}
	public float giaBanLe() //?
	{
		return (float)((gia+gia*0.2)/soluong);
	}
	public long gia1Hop()
	{
		return gia;
	}
	public int dientichNenToiDa()
	{
		return (soluong*chieudai*chieungang);
	}
	public int soluongHopGachLot1Nen(int D, int N)
	{
		int dai=D%chieudai==0?(D/chieudai):(D/chieudai+1);
		int ngang=D%chieungang==0?(N/chieungang):(N/chieungang+1);
		return (dai*ngang)%soluong==0?((dai*ngang)/soluong):(((dai*ngang)/soluong)+1);
	}
	
}
