import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1, sp = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
        System.out.print("*");
        sp++;
        System.out.println();
        }
    }
}
