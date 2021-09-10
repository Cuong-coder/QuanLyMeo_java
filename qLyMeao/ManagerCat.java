package qLyMeao;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Cat.exam.CatDetail;

public class ManagerCat {
	ArrayList<CatDetail> catList = new ArrayList<CatDetail>();

	public ManagerCat() {

	}

	public void inPut() {
		Scanner nhap = new Scanner(System.in);

		System.out.println("nhap so meo can them");
		int n = Integer.parseInt(nhap.nextLine());
		for (int i = 0; i < n; i++) {
			CatDetail cat = new CatDetail();
			cat.nhap();

			catList.add(cat);
		}
	}

	public void show() {
		for (int i = 0; i < catList.size(); i++) {
			catList.get(i).hienthi();
		}
	}

	public void xapXep() {
		Collections.sort(catList, new Comparator<CatDetail>() {
			@Override
			public int compare(CatDetail o1, CatDetail o2) {
				return o1.getMau().compareToIgnoreCase(o2.getMau());
			}

		});
		show();
	}

	public void seachr() {
		Scanner nhap = new Scanner(System.in);
		int cout = 0;
		System.out.println("nhap loai muon tim:");
		String loai1 = nhap.nextLine();
		for (CatDetail catDetail : catList) {
			if(catDetail.getLoai().equalsIgnoreCase(loai1)) {
				catDetail.hienthi();
				cout++;
			}
		}
		if (cout == 0) {
			System.out.println("khong tim thay meao");
		}
	}

}
