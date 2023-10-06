package Bai2324;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerStudent {
	
private ArrayList dssv;
public  ManagerStudent() {
	dssv = new ArrayList(10);
}
public void addSV(Student sv) {
	dssv.add(sv);d
}
public void nhapDSSV(Scanner sc) {
	Student sv;
	System.out.println("Nhap so luong sv ");
	int n = sc.nextInt();
	System.out.println("Moi nhap ds sinh vien: ");
	for(int i=0;i<n;i++) {
		System.out.println("Sinh vien thu : " + (i+1) + "La :");
		sv=new Student();
		sv.nhapThongTin(sc);
		addSV(sv);
	}
}
public void show() {
	int i = 1 ;
	for(Student sv : dssv) {
		System.out.println("Sinh vien thu : " + i + "la : ");
		sv.showTT();
		i++;
	}
}
}
