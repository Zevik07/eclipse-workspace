package Buoi3;
import java.util.Scanner;

import Buoi2.Date_old;

public class SinhVien {
	private final int MAX = 20;
	private String mssv, hten;
	private Date_old ngSinh;
	private int sluong;
	private String [] tenHP, diem;
	
	public SinhVien(){
		mssv = new String();
		hten = new String();
		ngSinh = new Date_old();
		sluong = 0;
		tenHP=new String[MAX];
		diem = new String[MAX];
		for(int i=0;i<MAX;i++){
			tenHP[i]=new String();
			diem[i]=new String();
		}
	}
	
	public SinhVien(SinhVien s){
		mssv = new String(s.mssv);
		hten = new String(s.hten);
		ngSinh = new Date_old(s.ngSinh);
		sluong = s.sluong;
		tenHP=new String[MAX];
		diem = new String[MAX];
		for(int i=0;i<MAX;i++){
			tenHP[i]=new String(s.tenHP[i]);
			diem[i]=new String(s.diem[i]);
		}
	}
	public SinhVien(String mssv,String hten,Date_old ngSinh,int sluong, String []tenHP,String []diem)
	{
		this.mssv=new String(mssv);
		this.sluong=sluong;
		this.hten=new String(hten);
		this.ngSinh=new Date_old(ngSinh);
		for (int i=0;i<MAX;i++)
		{
			this.tenHP[i]=new String(tenHP[i]);
			this.diem[i]=new String(diem[i]);
		}
	}
	public String tensv()
	{
		return hten;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mssv:");
		mssv = sc.nextLine();
		System.out.print("Nhap hoten:");
		hten = sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngSinh.inPut();
	}
	
	public void nhapDiem(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Nhap so luong mon hoc:");
			sluong = sc.nextInt();
		}while (sluong > MAX);
		
		System.out.print("--Nhap cac Mon hoc--\n");
		
		sc.nextLine();
		
		for(int i=0;i<sluong;i++){
			System.out.printf("Nhap ten Mon hoc thu %d:", i+1);
			tenHP[i]=sc.nextLine();
			System.out.printf("Nhap diem Mon hoc thu %d:", i+1);
			diem[i]=sc.nextLine();;
		}
			
	}
	
	public String toString(){
		String s = mssv +","+ hten + "," + ngSinh.toString() + "[";
		for(int i=0;i<sluong;i++){
			s+= tenHP[i] + ":" + diem[i]+";";
		}
		s+="] ";
		return s;
	}
	
	public void dKy(String ten, String d){
		if(sluong < MAX ){
			tenHP[sluong]=new String(ten); 
			diem[sluong]=new String(d); 
			sluong++;
		}
		else System.out.println("Khong the them mon moi");
	}
	
	public void xoa(String ten){
		for(int i=0;i<sluong;i++){
			if(tenHP[i].compareTo(ten)==0) {
				for(int j=i; j < sluong -1 ; j++){
					tenHP[j] = tenHP[j+1];					
				}
				sluong--;
				break;
			}
		}
	}
	
	public float diemTB(){
		float d=0F;
		for(int i=0;i<sluong;i++){
			if(diem[i].equals("A")) d +=4;
			else if(diem[i].equals("B")) d+=3;
				else if(diem[i].equals("C")) d+=2;
				     else if(diem[i].equals("D")) d+=1;		
		}
		
		return d/sluong;
	}
	
	
	
}
