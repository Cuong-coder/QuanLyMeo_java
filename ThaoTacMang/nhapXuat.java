package ThaoTacMang;

import java.util.Scanner;

public class nhapXuat {

	static void khoiTao() {
		int [][] a,x,y;
		int c,b,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so hang:");
		b = sc.nextInt();
		System.out.println("nhap so cot");
		
		c = sc.nextInt();
		System.out.println("nhap so hang");
		d = sc.nextInt();
		System.out.println("nhap mang thu nhat");
		a= nhapMang(b, c);
		System.out.println("nhap mang thu 2");
		x= nhapMang(c, d);
		System.out.println("xuat mang thu 1");
		inMang(a);
		System.out.println("------------------");
		System.out.println("xuat mang thu 2");
		inMang(x);
		y = tich(a, x);
		System.out.println("------------------");
		System.out.println("xuat tich 2 mang");
		inMang(y);
	}
	static int[][] tich(int[][] a,int [][]x){
		int [][] tich = new int [a.length][x[0].length];
		for(int i= 0;i<a.length;i++) {
			for(int j =0;j<x[0].length;j++) {
				for(int z = 0;z<a[0].length;z++){
					tich[i][j] += a[i][z]*x[z][j];
				}
			}
		}
		return tich;
	}
	static int[][] nhapMang(int b,int c){
		Scanner sc = new Scanner(System.in);
		int [][] mang = new int[b][c];
		for(int i= 0;i<b;i++) {
			for(int j= 0;j<c;j++) {
				System.out.println("nhap phan tu vi tri["+i+"]["+j+"]");
				mang[i][j]= sc.nextInt();
			}
		}
		return mang;
	}
		static void inMang(int [][] a) {
			 for (int i = 0 ;i<a.length;i++) {
				for (int j = 0 ; j< a.length;j++) {
					System.out.print( a[i][j]);
					System.out.print(" ");
				}
				System.out.println("");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		khoiTao();
	
		
		
	}

}
