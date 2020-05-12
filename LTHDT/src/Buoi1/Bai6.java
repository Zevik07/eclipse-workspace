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

public class Bai6 {
    public static void main(String []args)
    {
        Scanner temp=new Scanner(System.in);
        int n=0;
        System.out.println("Nhap vao so n");
        n=temp.nextInt();
        if (n<1) System.out.println("Khong phai la so nguyen to");
        else for (int i=2;i<n/2;++i)
        {
            if ((n%i)==0)
            {
                System.out.println("Khong phai la so nguyen to");
                break;
            }
            if (i==n/2-1) System.out.println("La so ngto");
        }
        String b=Integer.toBinaryString(n);
        System.out.println("Day nhi phan la: "+b);
    }
    
}
