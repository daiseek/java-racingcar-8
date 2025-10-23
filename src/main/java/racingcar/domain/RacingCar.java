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
    private RacingCar(String name) { }
    
    // TODO: 객체마다 0과 9 사이 랜덤한 값을 메서드 내 지역 변수로 가짐

    // TODO: 랜덤값이 4 이상일 때 전진하는 메서드 필요? - 전진 횟수를 정수, 하이픈을 상수로 관리하기, 해당 메서드를 RacingCar가 정의해야 할까?
    public int moveForward() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);
        if (randomNumber >= FORWARD_THRESHOLD) {
            return 1;
        }
    return 0;}

    // TODO: 명확한 객체 생성자 사용하기
    public static RacingCar of(String carName) {
        return new RacingCar(carName);
    }


}
