public class SumAndLargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        int largest = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
           sum += numbers[i];
           if(numbers[i] > largest) {
               largest = numbers[i];
           }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Largest: " + largest);
    }
}
