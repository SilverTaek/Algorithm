import java.util.Scanner;

public class Swea_1289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int t = 1; t <= tc; t++) {
			char[] c = sc.next().toCharArray();
    		char temp = '0';
    		int count = 0;
    		for(int i = 0 ; i < c.length ; i++){
        		if(c[i] != temp){
               	 temp =c[i];
                  	 count ++;
        		}
    		}
			
			System.out.println("#" + t + " " + count);
		}
	}
	}

