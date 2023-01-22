package sem_1;

public class sem1task1 {
    public static void main(String[] args) {

        int[] table = {2, 6, 4, -2, 20, 46, -8, 3, 12, 5, 6, 3, 50, 9, 10, 2, -9};

        int min = table[0];
        int max = table[0];

        for (int i = 1; i < table.length; i++){
            if (table[i] < min) {
                min = table[i];
            }
            if (table[i] > max) {
                max = table[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}