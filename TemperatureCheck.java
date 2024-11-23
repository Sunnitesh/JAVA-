class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}
public class TemperatureCheck {
    public static void main(String[] args) {
        try {
            double temp = Double.parseDouble(args[0]);

            if (temp > 35) {
                throw new TooHot("Too Hot! Temperature exceeds 35°C.");
            } else if (temp < 5) {
                throw new TooCold("Too Cold! Temperature is below 5°C.");
            } else {
                System.out.println("Normal temperature: " + temp + "°C");
                System.out.println("Converted to Fahrenheit: " + (temp * 9/5 + 32) + "°F");
            }
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Please provide a valid temperature.");
        }
    }
}

