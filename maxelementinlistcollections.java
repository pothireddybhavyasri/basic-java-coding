public class maxelementinlistcollections {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(34, 67, 23, 89, 12);
        int maxElement = java.util.Collections.max(numbers);
        System.out.println("Maximum element in the list: " + maxElement);
    }
}
