public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    int lastAdded() {
        return this.grades[this.size - 1];
    }

    public double average() {
        int sum = 0;
        double avg;
        for (int i = 0; i < size; i++) {
            sum = sum + grades[i];
        }
        avg = sum / size;
        return avg;

    }
}
