package question_3;

public class SalesTest {
    public static void main(String[] args) {
        Sales sale = new Sales();

        double purchaseValue = 100;

        int discountType = 1;

        double discountedPrice = sale.calculateDiscountValue(purchaseValue, discountType);
        System.out.println("Product value: R$" + purchaseValue);
        System.out.println("Discounted price: R$" + discountedPrice);
    }
}
