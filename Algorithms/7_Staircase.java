import java.util.*;

public class Staircase{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++){
            while(count != n -1){
                System.out.print(" ");
                count++;
            }
            System.out.print("#");
            System.out.print("\n");
        }
        
    }
}
