package Bai14;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Khai bao
		float soDien, tongTien;
		//Nhap so dien
		System.out.println("Xin moi nhap so dien da su dung");
		soDien = sc.nextFloat();
		//Tinh so dien
		if(soDien<0) {
			System.out.println("So dien khong hop le");
		}
		else if(soDien<=50) {
			tongTien = soDien*1484;
			System.out.println("So tien can tra la : "+tongTien);
		}
		else if(soDien<=100) {
			tongTien = (50*1484) + ((soDien-50)*1533);
			System.out.println("So tien can tra la : "+tongTien);
		}
		else if(soDien<=200) {
			tongTien = (50*1484) + (100*1533) + ((soDien-100)*1786);
			System.out.println("So tien can tra la : "+tongTien);
		}
		else {
			tongTien = (50*1484) + (100*1533) + (200*1786) + ((soDien-200)*2242);
			System.out.println("So tien can tra la : "+tongTien);
		}
	}
}
