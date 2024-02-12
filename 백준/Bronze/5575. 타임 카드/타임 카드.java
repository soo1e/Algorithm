import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int Sh = scanner.nextInt();
            int Sm = scanner.nextInt();
            int Ss = scanner.nextInt();

            int Eh = scanner.nextInt();
            int Em = scanner.nextInt();
            int Es = scanner.nextInt();

            if (Ss > Es) {
                Es = Es + 60;
                Em = Em - 1;
            }

            Es = Es - Ss;

            if (Sm > Em) {
                Em = Em + 60;
                Eh = Eh - 1;
            }

            Em = Em - Sm;
            Eh = Eh - Sh;


            System.out.println(Eh + " " + Em + " " + Es + " ");

        }
    }
}
