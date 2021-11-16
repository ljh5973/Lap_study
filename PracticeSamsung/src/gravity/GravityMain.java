package gravity;

import java.util.Scanner;

public class GravityMain {

	
	public static Scanner scan=new Scanner(System.in);
	public static final int BOX=1;
	public static final int EMPTY=0;
	public static void main(String[] args) {
		
		int testCase, T;
		int roomWidth, roomHeight;
		int maxFallen;
		
		int room[][]= new int[100][100];
		
		int boxTop[]=new int[100];
		
		int countEmptySpace;
		testCase=scan.nextInt();
		
		for(T=0; T<testCase; T++) {
			roomWidth=scan.nextInt();
			roomHeight=scan.nextInt();
			maxFallen=0;
			
			for(int i=0; i<roomWidth; i++) {
				boxTop[i]=scan.nextInt();
				for(int j=0; j<boxTop[i]; j++) {
					room[i][j]=BOX;
				}
			}
			for(int i=0; i<roomWidth; i++) {
				if(boxTop[i]>0) {
					countEmptySpace=0;
					for(int j=i+1; j<roomWidth; j++) {
						if(room[j][boxTop[i]-1]==EMPTY) {
							countEmptySpace++;
						}
					}
					if(countEmptySpace>maxFallen) {
						maxFallen=countEmptySpace;
					}
				}
			}
			System.out.println(maxFallen);
		}
	}
}
