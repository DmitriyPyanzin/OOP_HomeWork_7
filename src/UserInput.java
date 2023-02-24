import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private final Scanner sc = new Scanner(System.in);

    public double nextDouble() throws ScannerException {
        try {
            return sc.nextDouble();
        } catch (InputMismatchException e) {
            throw new ScannerException("Ошибка ввода параметра");
        }
    }

    public String nextLine() {
        return sc.nextLine();
    }
}
