package racingcar.view;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputViewTest {

    @Test
    void 이름_분리() {
        // given
        InputView inputView = new InputView();
        String input = "pobi,woni,jun";

        // when
        String[] result = inputView.separateCarNames(input);

        // then
        assertThat(result).containsExactly("pobi", "woni", "jun");
    }

    @Test
    void 이름_분리_공백_포함() {
        // given
        InputView inputView = new InputView();
        String input = "pobi, woni , jun";

        // when
        String[] result = inputView.separateCarNames(input);

        // then
        assertThat(result).containsExactly("pobi", "woni ", " jun");
    }

    @Test
    void 이름_분리_빈_이름_포함() {
        // given
        InputView inputView = new InputView();
        String input = "pobi,,jun";

        // when
        String[] result = inputView.separateCarNames(input);

        // then
        assertThat(result).containsExactly("pobi", "", "jun");
    }

}