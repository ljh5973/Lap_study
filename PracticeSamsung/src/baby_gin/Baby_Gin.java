package baby_gin;

import java.util.Arrays;

public class Baby_Gin {

	
	public void result(int[] arr) {
		
		int temp[]= new int[10];
		

		int tripletes=0;
		int run=0;
		for(int i=0; i<arr.length; i++) {
			
			temp[arr[i]]++;
		}
		
		System.out.println(Arrays.toString(temp));

		for(int i=0; i<temp.length; i++) {
			if(temp[i]>=3) {
				tripletes++;
				temp[i]-=3;
				i--;
			}
		}
		System.out.println(Arrays.toString(temp));
		System.out.println("??");
		
		for(int i=0; i<temp.length-2; i++) {
			if(temp[i]-->0) {
				if(temp[i+1]-->0&&temp[i+2]-->0) {
					run++;
					i--;
					
				}
			}
		}
		System.out.println(">>>");
		int result=tripletes+run;
		System.out.println(Arrays.toString(arr));
		
		if(result==2) {
			System.out.println("Baby Gin");
		}else {
			System.out.println("Lose");
		}
	}

}
