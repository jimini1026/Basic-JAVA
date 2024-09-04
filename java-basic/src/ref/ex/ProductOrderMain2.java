package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 1500, 2);
        orders[1] = createOrder("파", 2000, 5);
        orders[2] = createOrder("계란", 1800, 3);

        printOrders(orders);
        System.out.println("TotalAmount : " + getTotalAmount(orders));
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
