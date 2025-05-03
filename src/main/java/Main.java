import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String ERROR_MESSAGE = "Ваше значения неверны! Нельзя вводить пустые значение и скорость меньше 0 и выше 250.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();

        int i = 1;
        while (carList.size() != 3) {
            try {
                System.out.printf("Название машины №%d:\n", i);
                String carName = scanner.nextLine();
                System.out.printf("Скорость машины №%d:\n", i);
                int carSpeed = Integer.parseInt(scanner.nextLine());

                if (carSpeed > 0 && carSpeed <= 250 && carName != null && !carName.isEmpty()) {
                    carList.add(new Car(carName, carSpeed));
                    i++;
                } else {
                    System.out.println(ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(ERROR_MESSAGE);
            }
        }
        scanner.close();

        Race race = new Race();

        race.saveFastestCarName(carList);

        System.out.printf("Самая быстрая машина: %s\n", race.getLeaderOfRace());
    }
}