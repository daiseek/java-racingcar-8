package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.RacingCar;

public class OutputView {
    // TODO : RacingCar를 이용해 할당한 객체가 전진 메서드를 이용해 각 라운드별로 자동차의 전진 횟수를 출력하는 메서드 정의
    public void printCarPositionPerRound(RacingCar racingCar) {
        System.out.println(racingCar.getName() + " : " + "-".repeat(racingCar.getPosition()));
    }
    
    // TODO : 최종 라운드에서 전진 횟수가 제일 많은 레이싱카를 최종 우승자로 출력하는 메서드 정의
    // TODO : 동점자가 있을 경우 쉼표로 구분하여 출력
    // TODO : car들을 여러개 받아서 어떻게 최다 position을 가진 car 객체를 찾을 수 있는지 고민
    public void printWinnerCarName(List<RacingCar> racingCar) {
        // 1. 모든 자동차 객체의 position 중에서 최대값 찾기
        int maxPosition = racingCar.stream()
                .mapToInt(RacingCar::getPosition) // racingCar 객체들의 position을 순차적으로 int 타입으로 가져옴
                .max() // 불러온 position 값에서 가장 큰 값 찾기
                .orElse(0); // max() 결과가 null 일때 0을 반환

        // 2. 우승자 필터링하기
        List<RacingCar> winners = racingCar.stream()
                // position 값이 maxPosition과 일치하는 racingCar 객체만 남도록 필터링
                .filter(car -> car.getPosition() == maxPosition)
                .toList(); // List 형태로 반환

        String winnerNames = winners.stream()
                .map(RacingCar::getName)
                .collect(Collectors.joining(", "));
        System.out.println("최종 우승자: " + winnerNames);


        

    }

}
