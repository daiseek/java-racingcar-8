package racingcar;

import java.util.List;
import racingcar.domain.RacingCar;
import racingcar.util.InputUtil;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        InputView inputView = new InputView();

        // TODO: 여러 입력값을 넣어보며 유효성 검증해보기
        // TODO: 경주할 자동차를 입력 받기
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String input = inputView.inputCarNames();
        String validatedInput = inputView.validateCarName(input);
        String[] racingCarNames = inputView.separateCarNames(validatedInput);

        // 이름으로 RacingCar 객체 생성
        List<RacingCar> racingCars = InputUtil.makeRacingCars(racingCarNames);


        // TODO: 사용자 반복할 횟수 입력값 받아내기
//        System.out.println("시도할 횟수는 몇 회인가요?");
//        int times = inputView.inputTimes();


        // TODO: 라운드 횟수 입력 받기


        // TODO: 경주할 자동차 객체 할당하기


        //
    }
}
