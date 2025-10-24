package racingcar.util;

import java.util.Arrays;
import java.util.List;
import racingcar.domain.RacingCar;

public class InputUtil {

    // 입력받은 이름을 stream을 이용해 순차적으로 RacingCar 객체로 만드는 메서드
    public static List<RacingCar> makeRacingCars(String[] racingCarNames) {
        return Arrays.stream(racingCarNames)
                .map(String::trim)
                .filter(name -> !name.isEmpty())
                .map(RacingCar::of)
                .toList();
    }
}
