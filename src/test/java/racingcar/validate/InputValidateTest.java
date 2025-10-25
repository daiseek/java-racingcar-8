package racingcar.validate;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValidateTest {

    @Test
    void 입력값_길이_검증_성공() {
        // given
        InputValidate validator = new InputValidate();
        String validInput = "test";

        // when & then
        validator.validateLength(validInput); // 예외 발생하지 않음
        assertThat(validInput).isEqualTo("test");
    }

    @Test
    void 입력값_길이_검증_실패() {
        // given
        InputValidate validator = new InputValidate();
        String invalidInput = "";

        // when & then
        assertThatThrownBy(() -> validator.validateLength(invalidInput))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("입력값이 존재해야 합니다.");
    }

    @Test
    void 이름_길이_검증_성공() {
        // given
        InputValidate validator = new InputValidate();
        String validName = "pobi";

        // when & then
        validator.validateUnderFive(validName); // 예외 발생하지 않음
        assertThat(validName).isEqualTo("pobi");
    }

    @Test
    void 이름_길이_검증_실패() {
        // given
        InputValidate validator = new InputValidate();
        String invalidName = "pobiiiiiiii"; // 11글자

        // when & then
        assertThatThrownBy(() -> validator.validateUnderFive(invalidName))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("자동차 이름은 5글자 이내여야 합니다.");
    }

    @Test
    void 양수_검증_성공() {
        // given
        InputValidate validator = new InputValidate();
        String validNumber = "5";

        // when
        int result = validator.validatePositiveNumber(validNumber);

        // then
        assertThat(result).isEqualTo(5);
    }

    @Test
    void 양수_검증_실패() {
        // given
        InputValidate validator = new InputValidate();
        String invalidNumber = "abc";

        // when & then
        assertThatThrownBy(() -> validator.validatePositiveNumber(invalidNumber))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("양의 정수를 입력해주세요.");
    }

    @Test
    void 이름_배열_검증_성공() {
        // given
        InputValidate validator = new InputValidate();
        String[] validNames = {"pobi", "woni", "jun"};

        // when & then
        validator.validateTrimNames(validNames); // 예외 발생하지 않음
        assertThat(validNames).containsExactly("pobi", "woni", "jun");
    }

    @Test
    void 이름_배열_검증_실패() {
        // given
        InputValidate validator = new InputValidate();
        String[] invalidNames = {"pobi", "woni", "verylongname"}; // 12글자

        // when & then
        assertThatThrownBy(() -> validator.validateTrimNames(invalidNames))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("자동차 이름은 5글자 이내여야 합니다.");
    }
}
