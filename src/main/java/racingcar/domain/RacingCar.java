package racingcar.domain;
import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {

    // RacingCar 속성 정의
    private String name; // 자동차 이름
    private int position = 0; // 초기 위치

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private static final int FORWARD_THRESHOLD = 4;
    private static final int RANDOM_MIN_NUMBER = 0;
    private static final int RANDOM_MAX_NUMBER = 9;

    // 기본 생성자는 사용하지 못하게 private 접근자 선언
    private RacingCar(String name) {
        this.name = name;
    }

    public int moveForward() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);
        if (randomNumber >= FORWARD_THRESHOLD) {
            return position++;
        }
        return position;
    }

    public static RacingCar of(String carName) {
        return new RacingCar(carName);
    }

}
