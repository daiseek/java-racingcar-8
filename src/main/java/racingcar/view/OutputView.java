package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.RacingCar;
import racingcar.util.OutputUtil;

public class OutputView {
    // TODO : RacingCar를 이용해 할당한 객체가 전진 메서드를 이용해 각 라운드별로 자동차의 전진 횟수를 출력하는 메서드 정의
    public void printCarPositionPerRound(RacingCar racingCar) {
        System.out.println(racingCar.getName() + " : " + "-".repeat(racingCar.getPosition()));
    }
    
    // TODO : 최종 라운드에서 전진 횟수가 제일 많은 레이싱카를 최종 우승자로 출력하는 메서드 정의
    // TODO : 동점자가 있을 경우 쉼표로 구분하여 출력
    // TODO : car들을 여러개 받아서 어떻게 최다 position을 가진 car 객체를 찾을 수 있는지 고민
    public void printWinnerCarName(List<RacingCar> racingCar) {
        List<RacingCar> winners = OutputUtil.findWinnerRacingCars(racingCar);

        String winnerNames = winners.stream()
                .map(RacingCar::getName)
                .collect(Collectors.joining(", "));
        System.out.println("최종 우승자: " + winnerNames);


        

    }

}
