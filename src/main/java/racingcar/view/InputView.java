package racingcar.view;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    // 자동차 이름이 5글자 이하인지 판단하는 메서드
    // TODO : Validate 클래스 정의를 고려하기
    public void validateCarName(String carName) {
        if (carName.length() >5 ) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이내여야 합니다.");
        }
    }
    
    // TODO : 한 줄로 입력받은 자동차 이름 목록들을 쉼표를 기준으로 구분하는 메서드 정의
    // TODO : 입력받은 값에 대한 유효성 검증 필요 - 유효한 값이 무엇인지 경계 정하기
    public String[] separateCarNames(String carNames) {
        return carNames.split(",");
    }
    
    // TODO : 시도 횟수를 양의 정수로 받아내는 메서드
    // TODO : 유효성 검증 로직은 InputValidate 클래스로 분리
    public int inputTimes() {
        String input = Console.readLine(); // 사용자에게 횟수를 입력받음
        // 1. 입력값이 비어있는지 유효성 검증
        if (input.isEmpty()) {
            throw new  IllegalArgumentException("입력값이 존재해야 합니다.");
        }
        // 2. 입력값이 int 타입이 아닐때
        try {
            return Integer.parseInt(input); }
            catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자만 입력해주세요.");
            }
        

    }
}
