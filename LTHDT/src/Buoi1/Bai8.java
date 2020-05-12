/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

/**
 *
 * @author Zevik
 */
import java.util.Scanner;
//import java.util.Arrays;
public class Bai8 {
    public static void nhap(int a[],int n)
    {
        Scanner temp=new Scanner(System.in);
        for (int i=1;i<=n;++i)
        {
            System.out.println("Nhap vao gia tri thu "+i);
            a[i-1]=temp.nextInt();
        }
    }
    public static int demx(int a[], int x,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if (x==a[i]) ++count;
        }
        return count;
    }
    public static void sapXep(int a[],int n)
    {
        for (int i=0;i<n;++i)
        {
            for (int j=i;j<n;++j)
            {
                if (a[j]<a[i])
                {
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
    public static void hienThi(int a[],int n)
    {
        System.out.println("---------Hien thi phan tu--------");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String []args)
    {
        int n=0;
        System.out.println("Nhap vao so luong cua mang: ");
        Scanner temp=new Scanner(System.in);
        n=temp.nextInt();
        int a[]=new int[n];
        nhap(a,n);
        System.out.println("Nhap phan tu can dem so luong: ");
        System.out.println("So luong phan tu vua nhap la: "+demx(a,temp.nextInt(),n));
        sapXep(a,n);
        hienThi(a,n);
    }
}
