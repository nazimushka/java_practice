package sem_2;

import java.io.*;

public class sem2task2 {
    public static void main(String[] args) {
        System.out.println(hw2(null));
    }
    static boolean hw2(String input) {
        try(FileWriter wrt = new FileWriter("test.txt", true))
        {
            int i = 1;
            do {
                wrt.append("TEST");
                i++;
            }
            while (i <= 100);
            wrt.flush();
        }
        catch(IOException expt){
            return false;
        }
        return true;
    }
}