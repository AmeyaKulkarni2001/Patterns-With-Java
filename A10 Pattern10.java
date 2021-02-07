import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int outsp = n/2;
        int insp = -1;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= outsp; j++){
                System.out.print("\t");
            }
            
            Sytem.out.print("*\t");
            
            for(int j = 1; j <= insp; j++){
                System.ot.print("\t");
            }
            
            if(i > 1 && i < n){
                System.out.print("*\t");
            }
            
            if(i <=n/2){
                outsp--;
                insp += 2;
            }else{
                outsp++;
                insp -= 2;
            }
            
            System.out.println();
        }

    }
}
