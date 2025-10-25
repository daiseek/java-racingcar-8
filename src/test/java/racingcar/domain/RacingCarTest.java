package racingcar.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;

class RacingCarTest {

    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 전진_랜덤값_4_이상일_때_포지션_증가() {
        assertRandomNumberInRangeTest(
            () -> {
                // given
                RacingCar car = RacingCar.of("pobi");

                // when
                car.moveForward();

                // then
                assertThat(car.getPosition()).isEqualTo(1);
            },
            MOVING_FORWARD, STOP
        );
    }

    @Test
    void 정지_랜덤값_4_미만일_때_포지션_유지() {
        assertRandomNumberInRangeTest(
            () -> {
                // given
                RacingCar car = RacingCar.of("pobi");

                // when
                car.moveForward();

                // then
                assertThat(car.getPosition()).isEqualTo(0);
            },
            STOP, MOVING_FORWARD
        );
    }

    @Test
    void 이름_조회() {
        // given
        RacingCar car = RacingCar.of("pobi");

        // when
        String name = car.getName();

        // then
        assertThat(name).isEqualTo("pobi");
    }

    @Test
    void 포지션_조회() {
        // given
        RacingCar car = RacingCar.of("pobi");

        // when
        int position = car.getPosition();

        // then
        assertThat(position).isEqualTo(0);
    }

    @Test
    void 여러_번_전진_시_포지션_누적() {
        assertRandomNumberInRangeTest(
            () -> {
                // given
                RacingCar car = RacingCar.of("pobi");

                // when
                car.moveForward();
                car.moveForward();

                // then
                assertThat(car.getPosition()).isEqualTo(2);
            },
            MOVING_FORWARD, MOVING_FORWARD
        );
    }
}
