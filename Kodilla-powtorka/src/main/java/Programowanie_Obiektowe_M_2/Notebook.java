package Programowanie_Obiektowe_M_2;

public class Notebook {
    private int weight;
    private int price;

    public Notebook(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int checkPrice() {
        if(this.getPrice() > 1600) {
            System.out.println("Cena jest wyższa.");
        } else {
            System.out.println("Cena jest niższa.");
        }
        return price;
    }
}
