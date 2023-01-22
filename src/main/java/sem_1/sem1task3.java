package sem_1;
import java.util.Arrays;
public class sem1task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3};
        int num = 3;
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==num) {
                for (int j = arr.length-1; j>i;j--) {
                    if (arr[j]!=num) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

