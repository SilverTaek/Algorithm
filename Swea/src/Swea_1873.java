import java.util.Scanner;

public class Swea_1873 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//�׽�Ʈ���̽� �Է�
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int H = sc.nextInt(); //���� ����
			int W = sc.nextInt(); //���� �ʺ�
			char[][] map = new char[H][W];
			
			int x=0;
			int y=0;
			int dir=0; //���� 1:��, 2:�Ʒ�, 3:��, 4:��
			
			//�� �Է�
			for(int i=0;i<H;i++) {
				String Line = sc.next();
				for(int j=0;j<W;j++) {
					map[i][j] = Line.charAt(j);
					//�Ʒ� ��ȣ�� ã���� x,y�� �ޱ�
					if(map[i][j]=='<' || map[i][j]=='>' ||map[i][j]=='^'||map[i][j]=='v') {
						x = i;
						y = j;
					}
					
					switch(map[i][j]) {
					//��
					case '^' :
						dir = 1;
						break;
					//��
					case 'v' :
						dir = 2;
						break;
					//��
					case '<' :
						dir = 3;
						break;
					//��
					case '>' :
						dir = 4;
						break;
					}
				}
			}
			
			int N = sc.nextInt(); // ����ڰ� ���� �Է� ����
			
			//����ڰ� ���� �Է� �ޱ�
			String action = sc.next();
			
			//����ڰ� ���� �Է� ����ŭ substring�Ͽ� �ɰ� �� ����
			for(int i=0;i<N;i++) {
				String a = action.substring(i,i+1);
				int idx=0;
				switch(a) {
				//��
				case "U" :
					dir = 1;
					map[x][y]='^';
					if(x>0 && map[x-1][y]=='.') {
						map[x-1][y]= map[x][y];
						map[x][y]='.';
						x -= 1;
					}
					break;
				//��
				case "D" :
					dir = 2;
					map[x][y]='v';
					if(x<H-1 && map[x+1][y]=='.') {
						map[x+1][y]= map[x][y];
						map[x][y]='.';
						x += 1;
					}
					break;
				//��
				case "L" :
					dir = 3;
					map[x][y]='<';
					if(y>0 && map[x][y-1]=='.') {
						map[x][y-1]= map[x][y];
						map[x][y]='.';
						y -= 1;
					}
					break;
				//��
				case "R" :
					dir = 4;
					map[x][y]='>';
					if(y<W-1 && map[x][y+1]=='.') {
						map[x][y+1]= map[x][y];
						map[x][y]='.';
						y += 1;
					}
					break;
				//�߻�
				case "S" :
					switch(dir){
					//��
					case 1 :
						idx = x;
						while(true) {
							if(idx-1<0 || map[idx-1][y]=='#') break;
							if(map[idx-1][y]=='*') {
								map[idx-1][y] = '.';
								break;
							}
							idx--;
						}
						break;
					
					//�Ʒ�
					case 2 :
						idx = x;
						while(true) {
							if(idx+1>=H || map[idx+1][y]=='#') break;
							if(map[idx+1][y]=='*') {
								map[idx+1][y] = '.';
								break;
							}
							idx++;
						}
						break;
					
					//��
					case 3 :
						idx = y;
						while(true) {
							if(idx-1<0 || map[x][idx-1]=='#') break;
							if(map[x][idx-1]=='*') {
								map[x][idx-1] = '.';
								break;
							}
							idx--;
						}
						break;
					
					//��
					case 4 :
						idx = y;
						while(true) {
							if(idx+1>=W || map[x][idx+1]=='#') break;
							if(map[x][idx+1]=='*') {
								map[x][idx+1] = '.';
								break;
							}
							idx++;
						}
						break;
					}
					break;
				}
			}
			System.out.printf("#%d ",tc);
			for(int z=0;z<H;z++) {
				for(int c=0;c<W;c++) {
					System.out.print(map[z][c]);
				}
				System.out.println();
			}
		}
	}
}