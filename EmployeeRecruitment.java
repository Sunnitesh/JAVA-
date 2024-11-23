import java.util.Scanner;
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}
public class EmployeeRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the candidate's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the candidate's age: ");
        int age = scanner.nextInt();

        try {
            checkEligibility(name, age);
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("TooOlder: Candidate is too old for recruitment.");
        } else if (age < 20) {
            throw new TooYounger("TooYounger: Candidate is too young for recruitment.");
        } else {
            System.out.println("Eligible: " + name);
        }
    }
}

