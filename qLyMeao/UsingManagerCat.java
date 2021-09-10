package qLyMeao;

import java.sql.SQLOutput;
import java.util.Scanner;

import Cat.exam.CatDetail;

public class UsingManagerCat {
	public static void main(String[] args) {
		ManagerCat catManager = new ManagerCat();
		Scanner inPut =  new Scanner(System.in);
		int choose;
		do {
			showMenu();
			System.out.println("hay chon tu 1 - 5");
			choose = Integer.parseInt(inPut.nextLine());
			
		    switch (choose) {
			case 1:
				
			 catManager.inPut();
				
				break;
			case 2:
				catManager.show();
				break;
			case 3:
//				xap xep meo theo mau(thu tu tu a- z)
				catManager.xapXep();
				break;
			case 4:
//				tim kiem theo loai
				catManager.seachr();
				break;
			case 5:
				System.out.println("Bye!!!!!");
				break;
			default:
				System.err.println("chon lai  tu 1 den 5");
				break;
			}
		} while (choose != 5);
		
	}
	static void showMenu() {
		System.out.println("-----MENU-----");
		System.out.println("1.nhap thong tin meo");
		System.out.println("2.hien thi thong tin");
		System.out.println("3.xap xep theo mau");
		System.out.println("4.tim kiem thong tin theo loai");
		System.out.println("5.thoat truong trinh");
	}
}
