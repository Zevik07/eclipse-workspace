package Buoi1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Date {
	private int Ngay;
	private int Thang;
	private int Nam;
	Scanner temp=new Scanner(System.in);
	public Date()
	{
		Ngay=Thang=Nam=0;
	}
	public Date(int Ngay,int Thang,int Nam)
	{
		this.Ngay=Ngay;
		this.Thang=Thang;
		this.Nam=Nam;
	}
	public Date(Date a)
	{
		Ngay=a.Ngay;
		Thang=a.Thang;
		Nam=a.Nam;
	}
	public void outPut()
	{
		System.out.println(Ngay+"/"+Thang+"/"+Nam);
	}
	public String toString(){
		return  (Ngay + "/" + Thang + "/" + Nam);
	}
	public void inPut()
	{
		boolean check=true;
		do {
			
			try {

				System.out.println("Moi ban nhap ngay, thang va nam");
				Ngay=temp.nextInt();
				Thang=temp.nextInt();
				Nam=temp.nextInt();
				check=true;
				if (!hopLe())
				{
					check=false;
					System.out.print("Ban nhap sai ngay !!!");
				}
			}
			catch (InputMismatchException e)
			{
				System.out.println("Loi, Ban nhap sai dinh dang !!!");
				temp.nextLine();
				check=false;
			}
		} while(check!=true);
	}
	public boolean namNhuan(int a)
	{
		if (a%4==0&&a%100!=0||a%400==0) return true;
		else return false;
	}
	public boolean hopLe(){
		boolean h=false;
		int max[] = {0, 31,28,31,30,31,30,31, 31,30,31,30,31};
		if(namNhuan(Nam)) max[2] = 29;
		if(Nam>0 && Thang > 0 && Thang <13 && Ngay > 0 && Ngay<=max[Thang])
			h=true;
		return h;
	}
	public Date ngayHomsau()
	{
		Date temp= new Date(Ngay,Thang,Nam);
		if (namNhuan(Nam)&&Thang==2&&Ngay==29) temp=new Date(1,++temp.Thang,temp.Nam);
		else {
			int maxDay[]= {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			++temp.Ngay;
			if (temp.Ngay>maxDay[Thang]&&Thang==12) temp=new Date(1,1,Nam);
			if (temp.Ngay>maxDay[Thang]) temp=new Date (1,++Thang,Nam);
		}
		return temp;
	}
	public Date congNgay(int n)
	{ 
		Date temp2=new Date(Ngay,Thang,Nam);
		for (int i=0;i<n;++i)
		{
			temp2=temp2.ngayHomsau();
		}
		return temp2;
	}
	public void ShortDate()
	{
		int namTam=Nam%100;
		if (namTam<10) System.out.println(Ngay+"/"+Thang+"/0"+namTam);
		else System.out.println(Ngay+"/"+Thang+"/"+namTam);
	}
	private static final String T = "Thang ";
	public void LongDate()
	{
		String a[]={" ","Mot","Hai","Ba","Bon","Nam","Sau","Bay","Tam","Chin","Muoi","Muoi Mot","Muoi Hai"};
		System.out.print(Ngay+", "+T+a[Thang]+", "+Nam);
	}
	public static void main(String args[])
	{
		Date a=new Date();
		a.inPut();
		a.ShortDate();
		a.LongDate();
	}
}
