package work_1103_Project;

public class GenericMethodTest {
    public static void main(String args[]) {
        Integer[] iArray = { 10, 20, 30, 40, 50 };
        Double[] dArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
        Character[] cArray = { 'K', 'O', 'R', 'E', 'A' };
        printArray(iArray);
        printArray(dArray);
        printArray(cArray);
    }
    public static void printArray(Integer[] array) {
        for (Integer element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void printArray(Double[] array){
        for(Double element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void printArray(Character[] array){
        for(Character element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
