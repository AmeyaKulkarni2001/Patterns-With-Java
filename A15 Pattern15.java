import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = n / 2, nu = 1, val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int cval = val;
            for (int j = 1; j <= nu; j++) {
                System.out.print(cval + "\t");
                if (j <= nu / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }

            if (i <= n / 2) {
                sp--;
                nu += 2;
                val++;
            } else {
                sp++;
                nu -= 2;
                val--;
            }
            System.out.println();
        }

    }
}
