import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class boj_3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            
            String binary = Integer.toBinaryString(n);
            List<Integer> list = new ArrayList<Integer>();
             
            for (int j = 0; j < binary.length(); j++) {
                list.add(Integer.parseInt(binary.substring(j, j+1)));
            }
            
            Collections.reverse(list);
            
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}