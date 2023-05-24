package Programowanie_Obiektowe_M_2;

public class NotebookApplication {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(600, 1500);
        Notebook notebook2 = new Notebook(700, 2500);
        Notebook notebook3 = new Notebook(800, 7000);
        System.out.println(notebook1.getWeight() + " " + notebook1.getPrice());
        System.out.println(notebook2.getWeight() + " " + notebook1.getPrice());
        System.out.println(notebook3.getWeight() + " " + notebook1.getPrice());

        notebook1.checkPrice();
        notebook2.checkPrice();
        notebook3.checkPrice();
    }
}
