package work_1103;

class Cup<T> {
    private T beverage;
    public T getBeverage() { return beverage;  }
    public void setBeverage( T beverage ) {
        this.beverage = beverage;
    }

}

class Beer {
    @Override
    public String toString() {
        return "Beer";
    }
}

class Boricha {
    @Override
    public String toString() {
        return "Boricha";
    }
}

class Water {
    @Override
    public String toString() {
        return "Water";
    }
}

class Juice {
    @Override
    public String toString() {
        return "Juice";
    }
}

public class GenericClass {

    public static void main(String[] args) {

        Cup<Beer> c = new Cup<Beer>();
        Cup<Juice> d = new Cup<Juice>();

        c.setBeverage( new Beer() );
        d.setBeverage( new Juice() );

        mixBeverage( c.getBeverage() , d.getBeverage() );

    }
    public static <T, K> void mixBeverage( T beverage1, K beverage2) {
        System.out.println(beverage1 + ", " + beverage2 + "의 칵테일");
    }

}
