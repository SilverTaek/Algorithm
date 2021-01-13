	class Solution {
  public int solution(long num) {
	int index = 1;
      
	if(num == 1) {
		return 0;
	}
      
	while(index < 500) {
		if(num % 2 == 0) {
			num /= 2;
			if(num == 1) {
				break;
			}
		} else {
			num *= 3;
			num++;
		}
        
		index++;
	}
      
		if(index == 500)
		index = -1;
		return index;
  }
}