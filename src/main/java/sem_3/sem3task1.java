package sem_3;

import java.util.ArrayList;
import java.util.Random;

public class sem3task1 {
    public static void main(String[] args) {
        List arr = new List();
        arr.list();
    }
}

class List {
    public void list() {

        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(random.nextInt(100));
        }
        System.out.print(arr);
        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);

    }
}

