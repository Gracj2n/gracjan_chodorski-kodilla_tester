public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The Price is good.");
        } else
            System.out.println("This notebook is expensive.");
    }

    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is very light.");
        } else if (this.weight >= 1200 && this.weight <= 1800) {
            System.out.println("This notebook is not too heavy.");
        } else
            System.out.println("This notebook is very heavy.");
    }

    public void checkYearAndPrice() {
        if (this.year > 2020 && this.price > 3000) {
            System.out.println("This notebook is new and expensive");
    } else if (this.year <= 2020 && this.price < 3000) {
            System.out.println("This notebook is not new and cheap");
        } else {
            System.out.println("This notebook is not new but expensive");
        }
    }
}
