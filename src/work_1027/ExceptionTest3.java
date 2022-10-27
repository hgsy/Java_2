package work_1027;

class Shape {

}


class Ractangle extends Shape {

}

class Circle extends Shape {

}

public class ExceptionTest3 {

    public static void main(String[] args) {
        Ractangle r = new Ractangle();
        try{
            casting(r);
        }catch (ClassCastException e){
            System.out.println("ClassCastException");
        }

    }

    static void casting(Shape s) {
        Circle c = (Circle) s;
    }

}

