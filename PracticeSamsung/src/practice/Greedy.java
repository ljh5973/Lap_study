package practice;

public class Greedy {

	public static void main(String[] args) {
		
		int n=5;
		int lost[]= {2,4};
		int reserve[]= {1,3,5};
		
		
		int[] all=new int[n];
		int answer =n;
		
		for(int i:lost)
			all[i-1]--;	// all {0,-1,0,-1,0}
		for(int i:reserve)
			all[i-1]++;	// all{1,-1,1,-1,1}
		
		for(int i=0; i< all.length; i++) {
			if(all[i]==-1) {
				if(i-1>=0&&all[i-1]==1) {
					all[i]++;
					// i==1 all{1,0,1,-1,1}
					
					// i==3 all{0,0,1,0,1}
					all[i-1]--;
					// i==1 all{0,0,1,-1,1}
					
					// i==3 all{0,0,0,0,1}
				}else if(i+1< all.length&& all[i+1]==1) {
					all[i]++;
					all[i+1]--;
				}else {
					answer--;
				}
			}
		}
		
		System.out.println(answer);
	}
}
