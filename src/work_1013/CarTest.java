package work_1013;
class Car {

    private String model;

    public Car(String model) {
        // model 을 초기화
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car) obj;
            if (c.model==this.model)
                return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "model: "+model;
    }
}

public class CarTest {

    public static void main(String[] args) {
        // Car 객체 myCar 생성: model 그랜저
        Car myCar = new Car("그랜저");
        // Car 객체 yourCar 생성: model 그랜저
        Car yourCar = new Car("그랜저");

        // equals() 사용 두 객체 비교
        boolean result = myCar.equals(yourCar);

        System.out.println(result);
    }

}