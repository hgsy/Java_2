package work_1013.source;

public class ClassDemo {
	public static void main(String[] args) {
		
		Class cl1 = Keyboard.class;
		System.out.println(cl1.getName());
		System.out.println(cl1.getSimpleName());
		System.out.println(cl1.getTypeName());
		System.out.println(cl1.getPackage().getName());
		
		Keyboard k = new Keyboard("Logitech");

		Class c = k.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
	}
}
