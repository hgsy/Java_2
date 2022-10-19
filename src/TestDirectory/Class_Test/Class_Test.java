package TestDirectory.Class_Test;

public class Class_Test {
    public static void main(String[] args) {
        staticClass.staticClass2 a = new staticClass.staticClass2();
        instanceClass i = new instanceClass();
        instanceClass.instanceClass2 i2 = i.new instanceClass2();

        int b = a.Plus(1,2);
        System.out.println(b);
    }
}

class staticClass{
    static class staticClass2{
        public static int Plus (int a, int b)
        {
            return a + b;
        }

        public static int Minus (int a, int b)
        {
            return a - b;
        }
    }
}

class instanceClass{
    class instanceClass2{
        public int Plus2 (int a, int b)
        {
            return a + b;
        }

        public int Minus2 (int a, int b)
        {
            return a - b;
        }
    }
}

