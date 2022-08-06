import java.util.Objects;

public class Validator {

    private Validator() {

    }

    public static boolean validate (String login,
                                 String password,
                                 String confirmPassword) {
        try {
            check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void check(String login,
                              String password,
                              String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (login == null || login.isEmpty() || login.length() > 20) {
            throw new WrongLoginException("Login length should be 20 characters or less.");
        }

        if (password == null || password.isEmpty() || password.length() >= 20) {
            throw new WrongPasswordException("Password length should be less than 20 characters.");
        }

        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("Password and password confirmation should be identical.");
        }

    }
}
