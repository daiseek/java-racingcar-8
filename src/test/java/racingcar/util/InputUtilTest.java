package racingcar.util;

import org.junit.jupiter.api.Test;
import racingcar.domain.RacingCar;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InputUtilTest {

    @Test
    void 자동차_객체_생성() {
        // given
        String[] names = {"pobi", "woni", "jun"};

        // when
        List<RacingCar> cars = InputUtil.makeRacingCars(names);

        // then
        assertThat(cars).hasSize(3);
        assertThat(cars.get(0).getName()).isEqualTo("pobi");
        assertThat(cars.get(1).getName()).isEqualTo("woni");
        assertThat(cars.get(2).getName()).isEqualTo("jun");
    }

    @Test
    void 빈_이름_필터링() {
        // given
        String[] namesWithEmpty = {"pobi", "", "jun"};

        // when
        List<RacingCar> cars = InputUtil.makeRacingCars(namesWithEmpty);

        // then
        assertThat(cars).hasSize(2); // 빈 이름은 필터링됨
        assertThat(cars.get(0).getName()).isEqualTo("pobi");
        assertThat(cars.get(1).getName()).isEqualTo("jun");
    }

    @Test
    void 공백_제거() {
        // given
        String[] namesWithSpaces = {" pobi ", "woni", " jun "};

        // when
        List<RacingCar> cars = InputUtil.makeRacingCars(namesWithSpaces);

        // then
        assertThat(cars).hasSize(3);
        assertThat(cars.get(0).getName()).isEqualTo("pobi"); // 공백 제거됨
        assertThat(cars.get(2).getName()).isEqualTo("jun");  // 공백 제거됨
    }
}
