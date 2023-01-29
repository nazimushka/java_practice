package sem_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class sem3task3_removeDuplicateElements {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Юпитер");
        list.add("Земля");
        list.add("Плутон");
        list.add("Меркурий");
        list.add("Юпитер");
        list.add("Земля");
        list.add("Земля");
        list.add("Марс");
        list.add("Марс");
        list.add("Земля");
        list.add("Юпитер");

        int count = 0;
        list.sort(new Comparator<String>() {
            @Override
            /*
            Переопределение метода (англ. Method overriding) — это возможность реализовать метод так,
            чтобы он имел идентичную сигнатуру с методом класса-предка, но предоставлял иное поведение,
            не вызывая коллизий при его использовании.
             */
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);  // отсортированный список

        for (int i = 0; i < list.size(); i++) {
            count += 1;
            if ((i + 1) == list.size() || !list.get(i).equals(list.get(i + 1))) {
                System.out.println(list.get(i) + " - повторов " + count + "раз(а)");
                count = 0;
            }
        }
        /*
        Задание №2.2
        Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        */

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    }
}


            }
        }
        System.out.println(list);

    }
}

