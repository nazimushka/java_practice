package sem_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class sem4task1 {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>(); // Deque - двусторонняя очередь
        Scanner scanner = new Scanner(System.in);

        while (true) { // бесконечный цикл
            System.out.println("Введите строку -> ");
            String input = scanner.nextLine(); // ввод данных от пользователя

            if (input.equals("quit")) { // условие прекращения бесконечного цикла
                break;
            } else if (input.equals("print")) { // если print, выводит строки в обратном порядке
                System.out.println(stack);
            } else if (input.equals("revert")) { // если revert, удаляет предыдущую введенную строку
                System.out.println(stack.removeLast());
                // System.out.println(stack.pollFirst());
            } else {
                stack.addFirst(input);
            }

            System.out.println(stack);

        }
        scanner.close();
    }
}
