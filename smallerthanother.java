import java.util.Scanner;

public class smallerthanother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest, secondlargest;
        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondlargest = arr[1];
        } else {
            largest = arr[1];
            secondlargest = arr[0];
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("Second largest number is: " + secondlargest);
        sc.close();
    }
}
