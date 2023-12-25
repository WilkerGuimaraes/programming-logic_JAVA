package question_4;

public class OrderTest {
    public static void main(String[] args) {
        Order request1 = new Order("2023-03-01", "Client A", 100);
        Order request2 = new Order("2023-03-02", "Client B", 160);
        Order request3 = new Order("2023-03-03", "Client C", 230);

        request1.showDetails();
        request2.showDetails();
        request3.showDetails();
    }
}
