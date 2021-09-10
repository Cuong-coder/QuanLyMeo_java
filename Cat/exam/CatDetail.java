package Cat.exam;

import java.util.Scanner;

public class CatDetail implements ICat {
	String loai;
	String mau;
	String address;
	
	public CatDetail() {
		// TODO Auto-generated constructor stub
	}
	public CatDetail(String loai, String mau, String address) {
		this.loai = loai;
		this.mau = mau;
		this.address = address;
	}
	
	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getMau() {
		return mau;
	}
	public void setMau(String mau) {
		this.mau = mau;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap loai:");
		loai = scan.nextLine();
		
		System.out.println("nhap mau");
		mau = scan.nextLine();
		
		System.out.println("nhap noi song");
		address = scan.nextLine();
		
	}
	
	@Override
	public String toString() {
		return "CatDetail [Ten"+NAME + "loai=" + loai + ", mau=" + mau + ", address=" + address + "]";
	}
	@Override
	public void hienthi() {
		System.out.println(toString());
		
	}

}
