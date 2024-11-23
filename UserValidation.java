class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}
public class UserValidation {
    public static void main(String[] args) {
        String correctPassword = "password123";  // Predefined correct password
        String username = "user";  // User input for username
        String password = "password123";  // User input for password

        try {
            validateCredentials(username, password, correctPassword);
            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateCredentials(String username, String password, String correctPassword) throws InvalidCredentialsException {
        if (username.length() < 6) {
            throw new InvalidCredentialsException("Username must be at least 6 characters long.");
        }

        if (!password.equals(correctPassword)) {
            throw new InvalidCredentialsException("Incorrect password.");
        }
    }
}
