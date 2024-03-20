import java.io.*;

class sumeven {
 static void calculateSumOfEvenNumbers() throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        System.out.print("Enter the value of n: ");
        int n = Integer.parseInt(input.readLine());
        int sum = 0;
        int count = 0; // Counter for even numbers
        int number = 2; // Starting from the first even number
        while (count < n) {
            sum += number;
            number += 2; // Move to the next even number
            count++;
        }
        System.out.println("Sum of the first " + n + " even numbers is: " + sum);
    }

    public static void main(String[] args) {
       try {
  System.out.println("ASWIN K S");
System.out.println("WAP to calculate sum of n even numbers (functions with no argument and return type.)");
            calculateSumOfEvenNumbers();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }
}

