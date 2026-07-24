import java.util.Scanner;

public class secondlargestofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("enter  elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int largest, secondlargest;
        if (a[0] > a[1]) {
            largest = a[0];
            secondlargest = a[1];
        } else {

            largest = a[1];
            secondlargest = a[0];
        }
        for (int i = 2; i < n; i++) {
            if (a[i] > largest) {
                secondlargest = largest;
                largest = a[i];
            } else if (a[i] > secondlargest && a[i] != largest) {
                secondlargest = a[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second largest element = " + secondlargest);
        sc.close();
    }
}
