package Buoi2;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Date_old {
	private int Ngay;
	private int Thang;
	private int Nam;
	Scanner temp=new Scanner(System.in);
	public Date_old()
	{
		Ngay=Thang=Nam=0;
	}
	public Date_old(int Ngay,int Thang,int Nam)
	{
		this.Ngay=Ngay;
		this.Thang=Thang;
		this.Nam=Nam;
	}
	public Date_old(Date_old a)
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
	public Date_old ngayHomsau()
	{
		Date_old temp= new Date_old(Ngay,Thang,Nam);
		if (namNhuan(Nam)&&Thang==2&&Ngay==29) temp=new Date_old(1,++temp.Thang,temp.Nam);
		else {
			int maxDay[]= {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			++temp.Ngay;
			if (temp.Ngay>maxDay[Thang]&&Thang==12) temp=new Date_old(1,1,Nam);
			if (temp.Ngay>maxDay[Thang]) temp=new Date_old (1,++Thang,Nam);
		}
		return temp;
	}
	public Date_old congNgay(int n)
	{ 
		Date_old temp2=new Date_old(Ngay,Thang,Nam);
		for (int i=0;i<n;++i)
		{
			temp2=temp2.ngayHomsau();
		}
		return temp2;
	}
}
