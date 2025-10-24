package racingcar.view;

import java.util.List;
import racingcar.domain.RacingCar;
import racingcar.util.OutputUtil;

public class OutputView {

    public void printCarPositionPerRound(RacingCar racingCar) {
        System.out.println(racingCar.getName() + " : " + "-".repeat(racingCar.getPosition()));
    }
    
    public void printWinnerCarName(List<RacingCar> racingCar) {
        List<RacingCar> winners = OutputUtil.findWinnerRacingCars(racingCar);
        String winnerNames = OutputUtil.joinWinnerNames(winners);
        System.out.println("최종 우승자 : " + winnerNames);
    }

}
