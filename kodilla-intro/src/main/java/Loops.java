public class Loops {


    /*public static void main (String[] args) {


        String[] names = new String[5];
                names[0] = "Agata";
                names[1] = "Dawid";
                names[2] = "Bartek";
                names[3] = "Jan";
                names[4] = "Ola";

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
           }
    */

     public static void main (String[] args) {
         int[] numbers = new int[4];

         numbers[0] = 5;
         numbers[1] = 1;
         numbers[2] = 4;
         numbers[3] = 10;

         int sum = 0;                                /* do czego służy znienna sum i czemu wartość 0 */

         for (int i = 0; i < numbers.length; i++) {
             sum = sum + numbers[i];
         }
         System.out.println(sum);
     }
}

