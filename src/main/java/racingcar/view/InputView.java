package racingcar.view;
import java.util.Arrays;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validate.InputValidate;

public class InputView {

    InputValidate inputValidate = new InputValidate();
    
    public String[] separateCarNames(String carNames) {
        String[] parts = carNames.split(",");
        for (int i = 0; i < parts.length; i++) {
            if (i != parts.length - 1) {
                parts[i] = parts[i].replaceFirst("^\\s+", "");
            }
        }
        return parts;
    }

    public String inputCarNames() {
        String carNames = Console.readLine();
        carNames = carNames.trim();
        // 입력값을 쉼표 기준으로 구분한 뒤 배열을 스트림 형태로 바꾸어 반환
        // 스트림? 데이터 -> 변환 -> 필터링 -> 결과를 하나의 흐름으로 붙일 수 있다. 
        // 또한, map, filter, reduce 등의 메서드를 사용하여 데이터를 처리할 수 있다.
        return carNames;
    }
    
    public int inputTimes() {
        String input = Console.readLine(); // 사용자에게 횟수를 입력받음
        // 1. 입력값이 비어있는지 유효성 검증
        inputValidate.validateLength(input);

        // 2. 입력값이 int 타입이 맞는지 확인후 반복값 할당
        return inputValidate.validatePositiveNumber(input);
    }
}
