package Bai15;
import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Khai bao
	int soNgay;
	float donGia, tongTien;
	//Nhap so ngay luu tru va don gia
	System.out.println("Xin moi nhap vao so ngay da o");
	soNgay = sc.nextInt();
	System.out.println("Xin moi nhap don gia ");
	donGia = sc.nextFloat();
	//Tinh toan
	if(soNgay==1) {
		tongTien = donGia;
		System.out.println("Tong so tien can thanh toan la " +tongTien);
	}
	else if(soNgay<=4) {
		tongTien = donGia + ((donGia - (donGia/100*20))*(soNgay-1));
		System.out.println("Tong so tien can thanh toan la " +tongTien);
	}
	else if (soNgay<=10) {
		tongTien = donGia + ((donGia - (donGia/100*20))*3) + ((donGia - (donGia/100*40))*(soNgay-4));
		System.out.println("Tong so tien can thanh toan la " +tongTien);
	}
	else{
		tongTien = donGia + ((donGia - (donGia/100*20))*3) + ((donGia - (donGia/100*40))*6) + ((donGia - (donGia/100*60))*(soNgay-10));
		System.out.println("Tong so tien can thanh toan la " +tongTien);
	}
}
}
