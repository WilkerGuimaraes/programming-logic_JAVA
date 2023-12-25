package question_3;

public class Sales {
    private static double standardDiscount = 0.3;

    private double discount;

    public Sales() {
        this.discount = standardDiscount;
    }

    public double getDiscountRate(int discountType) {
        return discountType == 1 ? 0.1 : this.discount;
    }

    public double calculateDiscountValue(double purchaseValue, int discountType) {
        double discountRate = getDiscountRate(discountType);
        double discountedPrice = purchaseValue * (1 - discountRate);
        return discountedPrice;
    }
}
