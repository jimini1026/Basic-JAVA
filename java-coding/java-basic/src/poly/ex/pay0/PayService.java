package poly.ex.pay0;

public class PayService {
    public void processPay(String payOption, int amount) {
        System.out.println("결제를 시작합니다: option=" + payOption + ", amount=" + amount);
        if (payOption.equals("kakao")) {
            PayInterface payInterface = new KakaoPay();
            payInterface.pay(amount);
        } else if (payOption.equals("naver")) {
            PayInterface payInterface = new NaverPay();
            payInterface.pay(amount);
        } else {
            PayInterface payInterface = new PayInterface();
            payInterface.pay(amount);
        }
    }
}
