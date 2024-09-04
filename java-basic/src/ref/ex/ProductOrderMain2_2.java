package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2_2 {
    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[count];

        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String name = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(name, price, quantity);
        }
        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("ProductName : " + order.productName + ", Price : " + order.price + ", Quantity : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += (order.price * order.quantity);
        }

        return totalAmount;
    }
}
