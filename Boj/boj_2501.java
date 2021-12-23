import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class boj_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        sc.close();
        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                list.add(i);
        }
        
        if (list.size() >= k) {
            System.out.println(list.get(k-1));
        } else {
            System.out.println(0);
        }
    }
}