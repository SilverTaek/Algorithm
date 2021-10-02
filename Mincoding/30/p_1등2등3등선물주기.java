package pro_30;

import java.util.Scanner;

public class p_1등2등3등선물주기 {

	static String str;
	static char[] charArr;
	static char[] ans;
	static int isUsed[];
	
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in); 
		    str = sc.next();
		    charArr = str.toCharArray();
		    ans = new char[3];
		    isUsed = new int[str.length()];
		    rec_func(0);
		    
		  }
		  
		  public static void rec_func(int level) {
		    
		    if(level == 3) {
		    	for (int i = 0; i < 3; i++) {
					System.out.print(ans[i]);
				}
		    	System.out.println();
		    	return;
		    }
		    
		    for (int branch = 0; branch < 4; branch++) {
				if(isUsed[branch] != 1) {
		    	ans[level] = charArr[branch];
				isUsed[branch] = 1;
				rec_func(level + 1);
				ans[level] = ' ';
				isUsed[branch] = 0;
				}
			}
		  }

	}

