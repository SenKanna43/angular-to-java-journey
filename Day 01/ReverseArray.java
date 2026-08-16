public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        // Print the reversed array
        for(int i = 0; i < reversed.length; i++){
            System.out.println(reversed[i] + " ");
        }
    }
}
