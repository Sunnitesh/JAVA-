class Distance {
    double miles;

    Distance(double miles) {
        this.miles = miles;
    }

    void travelTime() {
        double time = miles / 60; // 60 miles per hour
        System.out.println("Time to travel " + miles + " miles at 60 mph: " + time + " hours");
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double km) {
        super(km * 0.621371); // Convert km to miles
    }

    @Override
    void travelTime() {
        double time = miles / 100; // 100 km per hour
        System.out.println("Time to travel " + miles * 1.60934 + " km at 100 kph: " + time + " hours");
    }
}

public class DistanceTest {
    public static void main(String[] args) {
        Distance distance = new Distance(120);
        distance.travelTime();

        DistanceMKS distanceMKS = new DistanceMKS(120);
        distanceMKS.travelTime();
    }
}

