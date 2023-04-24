public class TabliceCwiczenia {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 5;
        numbers[1] = 3;
        numbers[2] = 2;
        numbers[3] = 4;

        int number = numbers[1];
        System.out.println(number);

        System.out.println("");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int numbersLength = numbers.length;
        System.out.println("Długość tablicy wynosi: " + numbersLength);

    }
}
