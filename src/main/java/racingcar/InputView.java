package racingcar;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    // 자동차 이름이 5글자 이하인지 판단하는 메서드
    public void validateCarNames(String carName) {
        if (carName.length() >5 ) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이내여야 합니다.");
        }
    }
    
    
    // TODO : 한 줄로 입력받은 자동차 이름 목록들을 쉼표를 기준으로 구분하는 메서드 정의
    
    // TODO : 시도 횟수를 양의 정수로 받아내는 메서드
}
