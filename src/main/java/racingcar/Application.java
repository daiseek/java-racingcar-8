package racingcar;

import java.util.List;
import racingcar.domain.RacingCar;
import racingcar.util.InputUtil;
import racingcar.validate.InputValidate;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        InputValidate inputValidate = new InputValidate();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String input = inputView.inputCarNames();
        String[] racingCarNames = inputView.separateCarNames(input);

        for (String name : racingCarNames) {
            inputValidate.validateCarName(name.trim());
        }

        // 이름으로 RacingCar 객체 생성
        List<RacingCar> racingCars = InputUtil.makeRacingCars(racingCarNames);

        System.out.println("시도할 횟수는 몇 회인가요?");

        int racingTimes = inputView.inputTimes();

        for (int round = 0 ; round < racingTimes; round++) {

            for (RacingCar racingCar : racingCars) {
                racingCar.moveForward();
            }

            for (RacingCar racingCar : racingCars) {
                outputView.printCarPositionPerRound(racingCar);
            }
            System.out.println(); // 라운드 구분
        }

        outputView.printWinnerCarName(racingCars);
    }
}
