package racingcar.domain;
import camp.nextstep.edu.missionutils.Randoms;

public class RacingCar {
    // TODO: 객체마다 0과 9 사이 랜덤한 값을 메서드 내 지역 변수로 가짐

    // TODO: 랜덤값이 4 이상일 때 전진하는 메서드 필요? - 전진 횟수를 정수, 하이픈을 상수로 관리하기, 해당 메서드를 RacingCar가 정의해야 할까?
    public int moveForward() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= 4) {
            return 1;
        }
    return 0;}

        


    // TODO: 명확한 객체 생성자 사용하기


}
