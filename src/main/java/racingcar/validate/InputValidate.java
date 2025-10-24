package racingcar.validate;

public class InputValidate {

    // 입력값이 비어있는지 판단하는 메서드 정의
    public void validateLength(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("입력값이 존재해야 합니다.");
        }
    }

    // 입력값이 int 타입이 아닌지 판단하는 메서드
    public int validatePositiveNumber(String input) {
        try {return Integer.parseInt(input); }
        catch (NumberFormatException e) {throw new IllegalArgumentException("양의 정수를 입력해주세요.");}
    }

    // 입력값이 5글자 이하힌지 판단하는 메서드
    public void validateUnderFive(String input) {
        if (input.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이내여야 합니다.");
        }
    }

    // 각 이름별로 trim() 메서드 호출 후 5글자 이하인지 판단하는 메서드
    public void validateTrimNames(String[] racingNames) {
        for (String name : racingNames) {
            validateUnderFive(name.trim());
        }
    }

    // 자동차 이름이 5글자 이하인지 판단하는 메서드
    public void validateCarName(String carName) {
        // 1. 입력값이 비어있는지 유효성 검증
        validateLength(carName);
        // 2. 입력값이 5글자 이하인지 판단
        validateUnderFive(carName);
    }

}
