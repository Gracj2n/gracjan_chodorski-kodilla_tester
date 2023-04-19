import java.util.Random;
public class RandomNumbers2 {
    int max = 0;
    int mini = 30;
    public void getRandom2() {
        Random randomNumber = new Random();
        int sum = 0;
        while (sum < 100) {
            int wylosowanaLiczba = randomNumber.nextInt(31);
            sum = sum + wylosowanaLiczba;
            System.out.println(wylosowanaLiczba);
            if (wylosowanaLiczba > max) {
                max = wylosowanaLiczba;
            }
            if (wylosowanaLiczba < mini) {
                mini = wylosowanaLiczba;
            }
        }
    }
    public int getMax() {
        return max;
    }
    public int getMini() {
        return mini;
    }
}
