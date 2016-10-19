package exercises.exercise7;

public class Task6_1 {
    public static void main(String[] args) {
        int n = 9;
        int sym = n * 2 - 1;

        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < sym / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            sym--;
        }
    }
}
