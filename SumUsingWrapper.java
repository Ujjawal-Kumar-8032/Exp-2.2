import java.util.ArrayList;
import java.util.Scanner;

public class SumUsingWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers (comma separated): ");
        String input = sc.nextLine();

        String[] numbers = input.split(",");

        ArrayList<Integer> list = new ArrayList<>();

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr.trim());
            list.add(num);
        }

        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }

        System.out.println("Sum of numbers = " + sum);

        sc.close();
    }
}
