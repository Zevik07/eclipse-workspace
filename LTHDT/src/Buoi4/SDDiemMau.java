package Buoi4;

public class SDDiemMau {
	public static void main(String []args)
	{
		//Tao diem A
		DiemMau A= new DiemMau(5,10,"Trang");
		System.out.print("Diem A co toa do la: ");
		A.xuat();
		//Tao diem B
		DiemMau B=new DiemMau();
		System.out.print("\nNhap thong tin diem mau B: ");
		B.nhapDiem();
		System.out.print("Diem B co toa do la: ");
		B.xuat();
		System.out.print("\nSau khi gan cho Diem B mau vang: ");
		B.ganMau("Vang");
		B.xuat();
	}

}
