package project;

import java.util.Scanner;

class Shape {
	private String kind;
	private String color;
	private int edge;
	
	public Shape(String kind, String color, int edge) {
		this.kind = kind;
		this.color = color;
		this.edge = edge;
	}
	
	public void printInfo() {
		System.out.println("����\t����\t�𼭸���");
		System.out.println(kind + "\t" + color + "\t" + edge);
	}
}

public class Challenge12 {
	public static void main(String[] args) {
		Shape triangle = new Shape("�ﰢ��", "red", 3);
		triangle.printInfo();
		System.out.println();
		Shape rectangle = new Shape("�簢��", "blue", 4);
		rectangle.printInfo();
	}
}