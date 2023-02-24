import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Есть машина, которая умеет делать круглые отверстия для круглых колышков (RoundPeg).
        // Также у нас есть квадратные колышки (SquareSide).
        // Задача: научить машину делать отверстия для квадратных колышков (реализовать паттерн адаптер).
        // Нужно "адаптировать" интерфейс SquarePeg под интерфейс RoundPeg

        Machine machine = new Machine();
        Program program = new Program();
        UserInput userInput = new UserInput();
        RoundHole hole;

        program.Greeting();
        double parametr = -1;

        while (true) {
            int randomNumber = new Random().nextInt(0, 3);
            if (randomNumber == 0) {
                System.out.println("Круглое отверстие:");
                try {
                    parametr = userInput.nextDouble();
                    if (parametr == 0) {
                        System.out.println("Выключение машины");
                        break;
                    }
                    hole = machine.create(new DefaultRoundPeg(parametr));
                    System.out.println("Радиус отверстия " + hole.radius());
                } catch (ScannerException e) {
                    System.err.println(e.getMessage());
                    userInput.nextLine();
                } catch (ParametrException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                }
            } else {
                System.out.println("Квадратное отверстие:");
                try {
                    parametr = userInput.nextDouble();
                    if (parametr == 0) {
                        System.out.println("Выключение машины");
                        break;
                    }
                    RoundHoleAdapter roundHoleAdapter = new RoundHoleAdapter(new DefaultSquarePeg(parametr));
                    RoundHole squareHole = machine.create(roundHoleAdapter.converter());
                    System.out.print("Для квадрата со стороной " + roundHoleAdapter.side() + " необходим радиус " +
                            "отверстия ");
                    System.out.printf("%.3f" , squareHole.radius());
                    System.out.println();
                } catch (ScannerException e) {
                    System.err.println(e.getMessage());
                    userInput.nextLine();
                } catch (ParametrException e) {
                    System.err.println("Ошибка: " + e.getMessage());
                }
            }
        }
    }
}
