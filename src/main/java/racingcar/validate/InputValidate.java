package racingcar.validate;

public class InputValidate {

    // 입력값이 비어있는지 판단하는 메서드 정의
    public void validateLength(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("입력값이 존재해야 합니다.");
        }
    }

}
