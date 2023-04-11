public class FirstClass {
    public static void main(String[] args) {
        /*
        RandomNumbers randomNumbers = new RandomNumbers();
        int wynik = randomNumbers.getCountOfRandomNumber(10);
        System.out.println(wynik);
        */

        Notebook notebook = new Notebook(550, 4500, 2023);
        Notebook heavyNotebook = new Notebook(2000,800, 2020);
        Notebook oldNotebook = new Notebook(1200,3500, 1990);


        System.out.println("NOTEBOOK: " + notebook.weight + "g" + " " + notebook.price + "pln" + " " + notebook.year);
        notebook.checkPrice();  /* !!! Wywołanie metody z obiektu checkPrice z klasy Notebook !!!*/
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        System.out.println("");

        System.out.println("HEAVY NOTEBOOK: " + heavyNotebook.weight + "g" + " " + heavyNotebook.price + "pln" + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        System.out.println("");

        System.out.println("OLD NOTEBOOK: " + oldNotebook.weight + "g" + " " + oldNotebook.price + "pln" + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();



        /*
        if(heavyNotebook.price < 3000) {
            System.out.println("This notebook is cheap");
        } else {
            System.out.println("This notebook is quite expensive");
        }
        */

    }
}
