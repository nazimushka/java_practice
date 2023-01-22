package sem_1;
public class sem1task2 {
    public static boolean is_leap_year(int a) {
        if (a % 400 == 0)
            return true;
        else if (a % 100 == 0)
            return false;
        else if (a % 4 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        System.out.println(is_leap_year(2023));
    }
}
