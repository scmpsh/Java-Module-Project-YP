import java.util.Comparator;
import java.util.List;

public class Race {

    private static final int RACE_DURATION = 24;
    private String leaderOfRace;

    public String saveFastestCarName(List<Car> carList) {
        return carList.stream()
                .max(Comparator.comparing((v1) -> v1.getSpeed() * RACE_DURATION))
                .map(car -> this.leaderOfRace = car.getName()).orElse(null);
    }

    public String getLeaderOfRace() {
        return this.leaderOfRace;
    }
}
