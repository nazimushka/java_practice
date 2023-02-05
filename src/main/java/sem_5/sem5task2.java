package sem_5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class sem5task2 {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();
        LinkedList<String> firstName = new LinkedList<>();
        HashMap<String, Integer> count_name = new HashMap<>();
        name.add("Светлана Петрова");
        name.add("Кристина Белова");
        name.add("Анна Мусина");
        name.add("Анна Крутова");
        name.add("Иван Юрин");
        name.add("Петр Лыков");
        name.add("Павел Чернов");
        name.add("Петр Чернышов");
        name.add("Мария Федорова");
        name.add("Марина Светлова");
        name.add("Мария Савина");
        name.add("Мария Рыкова");
        name.add("Марина Лугова");
        name.add("Анна Владимирова");
        name.add("Иван Мечников");
        name.add("Петр Петин");
        name.add("Иван Ежов");



        for (int i = 0; i < name.size(); i++) {
            String[] slp = name.get(i).split(" ");
            for (int j = 0; j < slp.length; j += 2) {

                firstName.add(slp[j]);
            }
        }

        for (int i = 0; i < firstName.size(); i++) {
            int nums;
            if (count_name.containsKey(firstName.get(i))) {
                nums = count_name.get(firstName.get(i));
                count_name.put(firstName.get(i), nums + 1);
            } else {
                count_name.put(firstName.get(i), 1);
            }

        }
        System.out.println(count_name);

        Map<String, Integer> sortedMap = count_name.entrySet().stream().sorted(Comparator.comparingInt(e -> -e.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
            throw new AssertionError();
        }, LinkedHashMap::new));

        sortedMap.entrySet().forEach(System.out::println);

    }
}