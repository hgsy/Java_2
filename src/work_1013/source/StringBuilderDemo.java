package work_1013.source;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String s = new String("hi");
		System.out.println(s.hashCode());
		s = s + "!";
		System.out.println(s.hashCode());

		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode());
		sb = sb.append("!");
		System.out.println(sb.hashCode());

		System.out.println(sb.replace(0, 2, "Good bye").insert(0, "Java, "));
		
		StringBuilder sc = new StringBuilder();
		
		sc.append("Java ");
		sc.append("Program Study");
		System.out.println(sc.toString());
		
		sc.insert(4,  "2");
		System.out.println(sc.toString());
		
		sc.setCharAt(4, '6');
		System.out.println(sc.toString());
		
		sc.replace(6,  13, "Book");
		System.out.println(sc.toString());
		
		sc.delete(4,5);
		System.out.println(sc.toString());
		
		int length = sc.length();
		System.out.println("�� ���ڼ�: " +length);
		
		String result = sc.toString();
		System.out.println(result);
	}
}