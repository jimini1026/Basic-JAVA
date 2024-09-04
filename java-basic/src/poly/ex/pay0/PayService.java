package poly.ex.pay0;

public class PayService {

    String[] options = {"kakao", "naver"};
    Pay[] payOptions = {new KakaoPay(), new NaverPay()};

    public void processPay(String payOption, int amount) {
        System.out.println("결제를 시작합니다: option=" + payOption + ", amount=" + amount);

        for (int i = 0; i < options.length; i++) {
            if (options[i].equals(payOption)) {
                payOptions[i].pay(amount);
                System.out.println("결제를 성공했습니다.");
                return;
            }
        }

        System.out.println("결제 수단이 없습니다.");
        System.out.println("결제가 실패했습니다.");
    }
}
