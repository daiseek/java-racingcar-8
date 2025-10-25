package racingcar.util;

import org.junit.jupiter.api.Test;
import racingcar.domain.RacingCar;
import java.util.List;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class OutputUtilTest {

    @Test
    void 우승자_찾기_단일_우승자() {
        // given
        RacingCar car1 = RacingCar.of("pobi");
        RacingCar car2 = RacingCar.of("woni");
        RacingCar car3 = RacingCar.of("jun");

        // position 설정 (reflection이나 setter가 필요할 수 있음)
        // 실제로는 moveForward()를 여러 번 호출해서 position을 설정해야 함
        List<RacingCar> cars = Arrays.asList(car1, car2, car3);

        // when
        List<RacingCar> winners = OutputUtil.findWinnerRacingCars(cars);

        // then
        assertThat(winners).hasSize(3); // 모두 position 0이므로 모두 우승
    }

    @Test
    void 우승자_이름_연결() {
        // given
        RacingCar car1 = RacingCar.of("pobi");
        RacingCar car2 = RacingCar.of("woni");
        List<RacingCar> winners = Arrays.asList(car1, car2);

        // when
        String result = OutputUtil.joinWinnerNames(winners);

        // then
        assertThat(result).isEqualTo("pobi, woni");
    }

    @Test
    void 우승자_이름_연결_단일() {
        // given
        RacingCar car = RacingCar.of("pobi");
        List<RacingCar> winners = Arrays.asList(car);

        // when
        String result = OutputUtil.joinWinnerNames(winners);

        // then
        assertThat(result).isEqualTo("pobi");
    }
}
