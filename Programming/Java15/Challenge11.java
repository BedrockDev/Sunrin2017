package project;

import java.util.Scanner;

class Overload {
	public void add() {
		System.out.println("�Ű����� ����");
	}
	
	public int add(int a) {
		return a * 2;
	}
	
	public int add(int a, int b) {
		return a + b;
	}
}

public class Challenge11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Overload a = new Overload();
		a.add();
		System.out.print("���� �Ѱ��� �Է�>> ");
		System.out.println(a.add(sc.nextInt()));
		System.out.print("���� �ΰ��� �Է�>> ");
		System.out.println(a.add(sc.nextInt(), sc.nextInt()));
		sc.close();
	}
}