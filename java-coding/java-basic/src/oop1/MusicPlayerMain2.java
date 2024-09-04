package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        System.out.println("음악 플레이어 상태 확인");
        System.out.println("음악 플레이어 " + (data.isOn ? "ON, " : "FALSE, ") + "볼륨: " + data.volume);

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
