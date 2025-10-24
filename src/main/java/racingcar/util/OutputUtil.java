package racingcar.util;

import java.util.List;
import racingcar.domain.RacingCar;

public class OutputUtil {

    // TODO : 우승자 선별 메서드 정의
    public static void findWinnerRacingCars(List<RacingCar> racingCars) {
        // 1. 모든 자동차 객체의 position 중에서 최대값 찾기
        int maxPosition = racingCars.stream()
                .mapToInt(RacingCar::getPosition) // racingCar 객체들의 position을 순차적으로 int 타입으로 가져옴
                .max() // 불러온 position 값에서 가장 큰 값 찾기
                .orElse(0); // max() 결과가 null 일때 0을 반환

        // 2. 우승자 필터링하기
        List<RacingCar> winners = racingCars.stream()
                // position 값이 maxPosition과 일치하는 racingCar 객체만 남도록 필터링
                .filter(car -> car.getPosition() == maxPosition)
                .toList(); // List 형태로 반환
    }


    // TODO : 우승자 이름을 쉼표와 함께 연결하는 메서드 정의
    
}
