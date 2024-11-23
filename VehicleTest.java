class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;

    Vehicle(String regnNumber, String color, int speed, String ownerName) {
        this.regnNumber = regnNumber;
        this.color = color;
        this.speed = speed;
        this.ownerName = ownerName;
    }

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    Bus(String regnNumber, String color, int speed, String ownerName, int routeNumber) {
        super(regnNumber, color, speed, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Bus [routeNumber=" + routeNumber + ", regnNumber=" + regnNumber +
                ", color=" + color + ", speed=" + speed + ", ownerName=" + ownerName + "]");
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    Car(String regnNumber, String color, int speed, String ownerName, String manufacturerName) {
        super(regnNumber, color, speed, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Car [manufacturerName=" + manufacturerName + ", regnNumber=" + regnNumber +
                ", color=" + color + ", speed=" + speed + ", ownerName=" + ownerName + "]");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus("ABC123", "Red", 60, "John", 12);
        Car car = new Car("XYZ456", "Blue", 80, "Jane", "Toyota");

        bus.showData();
        car.showData();
    }
}
