
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b); // �ڵ����� double�� ĳ���õǾ� ����. 

	//	int c = 1.1; // Error: cannot convert from double to int
		int d = (int)1.1; //casting
		
		//int to String
		String str = Integer.toString(123);
		System.out.println(str);
		System.out.println(str.getClass()); // ���: class java.lang.String

	}

}
