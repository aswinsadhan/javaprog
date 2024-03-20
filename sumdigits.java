import java.io.*;
 class sumdigits {

    public static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        DataInputStream input = new DataInputStream(System.in);
        try {
  System.out.println("ASWIN K S");
System.out.println("WAP to calculate sum of digits of a number (functions with argument and return type.)");
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(input.readLine());
            int sum = calculateSumOfDigits(number);
            System.out.println("Sum of digits: " + sum);

            input.close();
        } catch (Exception e) {
            System.out.println(e);
          
        }
    }
}

