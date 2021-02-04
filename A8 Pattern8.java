import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1;
        int sp = n;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < sp; j++) {
                System.out.print("\t");
            }
            System.out.print("*");
            sp--;
            System.out.println();
        }
    }
}
