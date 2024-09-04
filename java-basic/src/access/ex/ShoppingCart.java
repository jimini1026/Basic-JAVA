package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;

    public void addItem(Item item) {
        if (count < 10) {
            items[count++] = item;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < count; i++) {
            total += items[i].totalPrice();
            System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + items[i].totalPrice());
        }
        System.out.println("전체 가격 합 : " + total);
    }
}
