package Buoi3;
import Buoi2.Diem;
public class DoanThang {
	private Diem d1;
	private Diem d2;
	public DoanThang()
	{
		d1= new Diem();
		d2= new Diem();
	}
	public DoanThang(Diem a, Diem b)
	{
		d1=new Diem(a);
		d2=new Diem(b);
	}
	public DoanThang(DoanThang a)
	{
		d1=new Diem(a.d1);
		d2=new Diem(a.d2);
	}
	public DoanThang(int ax, int ay, int bx, int by)
	{
		d1=new Diem(ax,ay);
		d2=new Diem(bx,by);
	}
	public void nhap()
	{
		System.out.print("\nNhap diem dau: ");
		d1.nhapDiem();
		System.out.print("\nNhap diem cuoi: ");
		d2.nhapDiem();
	}
	public void xuat()
	{
		System.out.print("\n["+d1.toString()+","+d2.toString()+"]");
	}
	public void tinhTien(int dx,int dy)
	{
		d1.doiDiem(dx,dy);
		d2.doiDiem(dx, dy);
	}
	public float doDai()
	{
		return (float) d1.khoangCach(d2);
	}
	public double soDoGoc()
	{
		double tmp = Math.abs(d1.giaTriX()-d2.giaTriX());
		return Math.toDegrees(Math.acos(tmp/d1.khoangCach(d2)));
	}
}
