import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0, st = n-1;
        
        for(int i = n; i>=1;i--){
            for(int j = 0; j<sp; j++){
                System.out.print("\t");
            }
            for(int j = 0; j<=st; j++){
                System.out.print("*\t");
            }
            sp++;st--;
            System.out.println();
        }
    }
}
