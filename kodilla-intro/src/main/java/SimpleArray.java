public class SimpleArray {
    public static void main(String[] args) {


        /* Ćwiczenie 1 z modułu 0.12 */

        String[] creaturesNames = new String [5];
        creaturesNames[0] = "Spider";
        creaturesNames[1] = "Cheetah";
        creaturesNames[2] = "Lion";
        creaturesNames[3] = "Bird";
        creaturesNames[4] = "Frog";


        /* Ćwiczenie 2 z modułu 0.12 */

        String creatureName = creaturesNames[3];
        System.out.println(creatureName);


        /* Ćwiczenie 3 z modułu 0.12 */

        int numberOfElements = creaturesNames.length;
        System.out.println("Moja tablca zawiera " + numberOfElements + " elementów.");

    }
}
