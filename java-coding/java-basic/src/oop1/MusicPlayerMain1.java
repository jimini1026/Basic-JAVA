package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);

        System.out.println("음악 플레이어 상태 확인");
        System.out.println("음악 플레이어 " + (isOn ? "ON, " : "FALSE, ") + "볼륨: " + volume);

        System.out.println("음악 플레이어를 종료합니다.");
    }
}
