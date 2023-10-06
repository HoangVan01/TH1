package Bai2324;

import java.util.Scanner;

public class Student {
private int id;
private String name;
private double mark;
public Student(int id, String name, double mark) {
	super();
	this.id = id;
	this.name = name;
	this.mark = mark;
}
public Student() {
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMark() {
	return mark;
}
public void setMark(double mark) {
	this.mark = mark;
}
public void nhapThongTin(Scanner sc) {
	System.out.println("Nhap id : ");
	id = sc.nextInt();
	sc.nextLine();
	System.out.println("Nhap ten");
	name =sc.nextLine();
	System.out.println("Nhap diem");
	mark = sc.nextDouble();
}
public void showTT() {
	System.out.println("ID SV : "+id);
	System.out.println("ten SV : "+name);
	System.out.println("diem SV : "+mark);
}

}
