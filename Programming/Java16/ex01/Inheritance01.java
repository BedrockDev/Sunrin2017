package ex01;

public class Inheritance01 {

	public static void main(String[] args) {
		System.out.print("�ð� �귣�� �̸� �Է� : ");
		
		// Scanner�� java.util.��Ű���� �ִ� Ŭ������.
		// ��Ű���� Ŭ������ ���� ���̹�������.
		
		// java.lang.��Ű���� ���� ��� ���� Ŭ������ ȣ���� �� �� �����Ƿ�
		// ù��°, java.util.��Ű���� ���� Ŭ������ import�� �̸� �������ְ�,
		// �ι�°,  �Ʒ��� ���� ���� ���� java.util.Scanner�� ���·� ��� ǥ���������.
		
		// ScannerŬ������ next()�޼ҵ�� ���ڿ� �� �ܾ �Է¹���.
		String brand = new java.util.Scanner(System.in).next();
		
		// ��ü�� �����ؼ� �ٷ� �޼ҵ带 ȣ���� �� �� ����.
		// ��, ��ü ���� �� ���������� �������� ������, �ٽ� ������ ����� ����
		// (���α׷��� ��� ����Ǵ� ����� �ð��� ������) GC(������ �ݷ���)�� ���� ���Ŵ���� ��.
		new Watch(brand).printInfo();
	}
}
