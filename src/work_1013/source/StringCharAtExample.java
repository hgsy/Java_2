package work_1013.source;

public class StringCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "012345-123456";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("Male");
			break;
		case '2':
		case '4':
			System.out.println("Female");
			break;
		}
	}
}

