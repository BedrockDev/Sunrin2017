package ex01;

public class Thing {
	// private�� ��ӽ� �ڽ�Ŭ�������� ���� ������ �� ����.
	private String brand;
	
	// �����ڰ� �־�� ��ü�� ������.(�����ڴ� ��ü������ �ʱ�ȭ ������ �����)
	// �Ʒ��� ����  ��õ� �����ڰ� ������, �����ϰ������� �⺻�����ڰ� ���Ե��� ����.
	// �Ʒ� �����ڴ� private�� brand�� �ʱ�ȭ�ϴµ� Ȱ���.
	public Thing(String brand){
		this.brand = brand;
	}
	
	// brand�� ������ ������ִ� �޼ҵ�
	public void printInfo(){
		// Ŭ���� �������� private�� brand�� ������ �� ����.
		System.out.println("�귣���: "+this.brand);
	}
}
