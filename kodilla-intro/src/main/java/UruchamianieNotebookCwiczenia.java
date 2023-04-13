public class UruchamianieNotebookCwiczenia {
    public static void main(String[] args) {
        NotebookCwiczenia notebook = new NotebookCwiczenia(600,100);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

        NotebookCwiczenia heavyNotebook = new NotebookCwiczenia(2000,1500);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        NotebookCwiczenia oldNotebook = new NotebookCwiczenia(1200,500);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

    }
}
