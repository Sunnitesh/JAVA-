import java.util.HashMap;
import java.util.Map;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington DC");
        capitals.put("France", "Paris");
        try {
            if (args.length == 0) {
                System.out.println("Please enter a country.");
                return;
            }
            String country = args[0];
            String capital = capitals.get(country);
            if (capital == null) {
                throw new NoMatchFoundException("No capital found for the country: " + country);
            }
            System.out.println("Capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
