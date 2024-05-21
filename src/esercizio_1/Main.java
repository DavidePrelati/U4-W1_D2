package esercizio_1;

public class Main {
    public static void main(String[] args) {

        boolean word = stringaPariDispari("Ciaon");
        System.out.println(word);
    }

    public static boolean stringaPariDispari(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}