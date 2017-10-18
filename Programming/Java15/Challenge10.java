package project;

import java.util.Scanner;

class Square {
	private int length;
	
	public Square() {
		this.length = 1;
	}
	
	public Square(int length) {
		this.length = length;
	}
	
	public int getArea() {
		return this.length * this.length;
	}
}

public class Challenge10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Square a = new Square();
		System.out.println("# ù��° ���簢�� ����: " + a.getArea());
		
		System.out.print("�Ѻ��� ���� �Է�>> ");
		Square b = new Square(sc.nextInt());
		System.out.println("## �ι�° ���簢�� ����: " + b.getArea());
		sc.close();
	}
}