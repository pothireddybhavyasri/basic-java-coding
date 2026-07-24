import java.util.Scanner;

public class secondsmallestofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.of elements");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("enter  elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int smallest, secondsmallest;
        if (a[0] > a[1]) {
            smallest = a[0];
            secondsmallest = a[1];
        } else {
            smallest = a[1];
            secondsmallest = a[0];
        }
        for (int i = 2; i < n; i++) {
            if (a[i] < smallest) {
                secondsmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondsmallest && a[i] != smallest) {
                secondsmallest = a[i];
            }
        }
        System.out.println("smallest element = " + smallest);
        System.out.println("Second smallest element = " + secondsmallest);
        sc.close();
    }
}
