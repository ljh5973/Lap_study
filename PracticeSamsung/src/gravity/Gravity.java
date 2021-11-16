package gravity;

import java.util.Scanner;

public class Gravity {

	public static int EMPTY= 0;
	public static int BOX=1;
	public static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		
		int testCase;
		int T;
		int[][] room= new int[100][100];
		int roomWidth = 0, roomHeight=0;
		int boxHeight;
		int maxFallen = 0;
		int countEmptySpace;
		
		testCase=scan.nextInt();
		
		for(T=0; T<testCase; T++) {
			
			roomWidth=scan.nextInt();
			roomHeight=scan.nextInt();
		}
		for(int i=0; i<roomWidth; i++) {
			for(int j=0; j<roomHeight; j++) {
				room[i][j]=EMPTY;
			}
			maxFallen=0;
		}
		for(int i=0; i<roomWidth; i++) {
			boxHeight=scan.nextInt();
			for(int j=0; j<boxHeight; j++) {
				room[i][j]=BOX;
			}
		}
		
		for(int i=0; i<roomWidth; i++) {
			for(int j=0; j<roomHeight; j++) {
				
				if(room[i][j]==BOX) {
					countEmptySpace=0;
					for(int k=i+1; k<roomWidth; k++) {
						if(room[k][j]==EMPTY) {
							countEmptySpace+=1;
						}
						if(countEmptySpace>maxFallen) {
							maxFallen=countEmptySpace;
						}
					}
				}
			}
		}
		System.out.println(maxFallen);
		
		
	}
}
