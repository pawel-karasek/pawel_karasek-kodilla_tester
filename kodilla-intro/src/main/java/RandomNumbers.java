import java.util.Random;

public class RandomNumbers {
    int min = 30;
    int max = 0;

    public void generate(int bound) {
        Random random = new Random();
        int sum = 0;
        while (sum < bound) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            if (temp > max) {
                max = temp;
            } else if (temp < min) {
                min = temp;
            }

            // System.out.println(temp + " " + sum);
        }
    }

    public int maxValue() {
        return max;
    }

    public int minValue() {
        return min;
    }
}
