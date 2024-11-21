import java.util.Scanner;
public class Commission {
    private double sales;
    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        return sales * 0.10; /
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {

            Commission commission = new Commission(sales);
            double commissionAmount = commission.commission();
            System.out.println("The commission is: " + commissionAmount);
        }
        scanner.close();
    }
}
