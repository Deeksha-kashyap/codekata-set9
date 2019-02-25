import java.util.*;
public class NumberDigits {

    public static void main(String[] args) {

        int count = 0, num;
        System.out.print("Enter the number");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();

        while(num != 0)
        {
           
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}
