package project;

import java.util.Scanner;

class Dog {
	private String name;
	public Dog() {
		this.name = "�۸���";
		printName();
	}
	
	public Dog(String name) {
		this.name = "�۸��� " + name;
		printName();
	}
	
	public Dog(String color, String name) {
		this.name = color + " " + name + " �۸���";
		printName();
	}
	
	public void printName() {
		System.out.println(name);
	}
}

public class Challenge08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();

		Dog a = new Dog();
		Dog b = new Dog("�鱸");
		Dog c = new Dog("�Ͼ�", "�鱸");
		
		System.out.print("�۸��� �̸� �Է� : ");
		Dog d = new Dog(sc.next());
		sc.close();
	}
}
