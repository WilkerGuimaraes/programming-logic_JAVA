package question_4;

public class Order {
    private static int actualNumber = 1;

    private int num;
    private String date;
    private String client;
    private double value;

    public Order(String date, String client, double value) {
        this.num = actualNumber++;
        this.date = date;
        this.client = client;
        this.value = value;
    }

    public int getNumber() {
        return this.num;
    }

    public void showDetails() {
        System.out.println(
            "Request number: " + this.num +
            " | Date: " + this.date +
            " | Client: " + this.client +
            " | Value: R$" + this.value
        );
    }
}
