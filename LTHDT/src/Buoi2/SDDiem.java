package Buoi2;

public class SDDiem {
	public static void main(String []args)
	{
		Diem a = new Diem(3,4);
		System.out.printf("Diem a co toa do la (%d,%d)",a.giaTriX(),a.giatTriY());
		Diem b = new Diem();
		System.out.print("\nNhap toa do diem b");
		b.nhapDiem();
		Diem c = new Diem(-b.giaTriX(),-b.giatTriY());
		System.out.printf("\nToa do diem C doi xung voi b la (%d,%d)",c.giaTriX(),c.giatTriY());
		System.out.print("\nKhoang cach tu B den tam O la "+b.khoangCach());
		System.out.print("\nKhoang cach tu A den B la "+b.khoangCach(a));
	}
}
