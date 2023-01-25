package sem_2;

public class sem2task1 {
        public static void main(String[] args) {
            System.out.println(IfPoly("tenet"));
        }
        public static boolean IfPoly(String str) {
            StringBuilder reverse = new StringBuilder();
            String clear = str.replaceAll("\\s", "").toLowerCase();
            char[] strToChar = clear.toCharArray();
            for (int i = strToChar.length - 1; i >= 0; i--) {
                reverse.append(strToChar[i]);
            }
            return (reverse.toString().equals(clear));
        }
}