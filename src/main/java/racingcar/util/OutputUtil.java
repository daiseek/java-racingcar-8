package racingcar.util;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.RacingCar;

public class OutputUtil {

    public static List<RacingCar> findWinnerRacingCars(List<RacingCar> racingCars) {
        // 1. 모든 자동차 객체의 position 중에서 최대값 찾기
        int maxPosition = racingCars.stream()
                .mapToInt(RacingCar::getPosition) // racingCar 객체들의 position을 순차적으로 int 타입으로 가져옴
                .max() // 불러온 position 값에서 가장 큰 값 찾기
                .orElse(0); // max() 결과가 null 일때 0을 반환

        // 2. 우승자 필터링하기
        return racingCars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList();
    }


    public static String joinWinnerNames(List<RacingCar> winnerRacingCars) {
        return winnerRacingCars.stream()
                .map(RacingCar::getName)
                .collect(Collectors.joining(", "));
    }
    
}
