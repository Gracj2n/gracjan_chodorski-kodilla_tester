import java.sql.SQLOutput;

public class NotebookCwiczenia {
    int weight;
    int price;
    public NotebookCwiczenia(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public void checkPrice() {
        if(this.price < 900){
            System.out.println("This notebook is cheap.");
        } else {
            System.out.println("This notebook is quite expensive.");
         }
    }
     public void checkWeight() {
        if(this.weight > 1000) {
            System.out.println("This notebook is light.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }
}
