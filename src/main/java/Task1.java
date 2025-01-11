import java.util.Scanner;

public class Task1 {
    public static void sayHello(int num) {
        System.out.println(num > 7 ? "Hello" : "");
    }

    public static void sayHelloToJohn(String name) {
        System.out.println(name == "John" ? "Hello, John" : "There is no such name");
    }

    public static void printMultiplesOfThree(int[] array) {
        for (int num : array) {
            System.out.println(num % 3 == 0 ? num : "");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        sayHello(number);

        scanner.nextLine();
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        sayHelloToJohn(name);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        printMultiplesOfThree(array);
    }

}
