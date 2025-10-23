package racingcar.view;
import java.util.Arrays;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validate.InputValidate;

public class InputView {

    InputValidate inputValidate = new InputValidate();

    // 자동차 이름이 5글자 이하인지 판단하는 메서드
    // TODO : Validate 클래스 정의를 고려하기
    public void validateCarName(String carName) {
        if (carName.length() >5 ) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이내여야 합니다.");
        }
    }
    
    // TODO : 한 줄로 입력받은 자동차 이름 목록들을 쉼표를 기준으로 구분하는 메서드 정의
    // TODO : 입력받은 값에 대한 유효성 검증 필요 - 유효한 값이 무엇인지 경계 정하기
    // TODO : 해당 메서드는 util 클래스로 분리할 수 있도록 고려
    public String[] separateCarNames(String carNames) {
        return carNames.split(",");
    }

    // TODO: 자동차 이름들을 입력받는 메서드 정의
    public void inputCarNames() {
        String carNames = Console.readLine();
        carNames = carNames.trim();
        // 입력값을 쉼표 기준으로 구분한 뒤 배열을 스트림 형태로 바꾸어 반환
        // 스트림? 데이터 -> 변환 -> 필터링 -> 결과를 하나의 흐름으로 붙일 수 있다. 
        // 또한, map, filter, reduce 등의 메서드를 사용하여 데이터를 처리할 수 있다.
        Arrays.stream(carNames.split(",")); 

    }
    
    // TODO : 시도 횟수를 양의 정수로 받아내는 메서드
    // TODO : 유효성 검증 로직은 InputValidate 클래스로 분리
    public int inputTimes() {
        String input = Console.readLine(); // 사용자에게 횟수를 입력받음
        // 1. 입력값이 비어있는지 유효성 검증
        inputValidate.validateLength(input);

        // 2. 입력값이 int 타입이 맞는지 확인후 반복값 할당
        return inputValidate.validatePositiveNumber(input);
    }
}
