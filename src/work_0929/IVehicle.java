package work_0929;

public interface IVehicle {
    // 기본 tuneUp 비용값 반환
    public double tuneUpCost();

    // 차량이 주어진 수의 승객이 탑승 가능한지에 대한 논리값 반환
    public boolean canCarry(int numPassengers);

}

class Car implements IVehicle {
    int mileage;
    int year;
    int numDoors;

    // constructor goes here

    // 차량이 주어진 년도 이전에 만들어진 것인지 반환
    boolean builtBefore(int otherYear) {
        return this.year < otherYear;
    }

    @Override
    public double tuneUpCost() {
        return 0;
    }

    @Override
    public boolean canCarry(int numPassengers) {
        return false;
    }
}

class Bicycle implements IVehicle {
    int mileage;
    int numGears;

    @Override
    public double tuneUpCost() {
        return 0;
    }

    @Override
    public boolean canCarry(int numPassengers) {
        return false;
    }

    // constructor goes here

}
