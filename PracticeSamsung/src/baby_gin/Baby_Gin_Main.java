package baby_gin;

public class Baby_Gin_Main {

	public static void main(String[] args) {
		
		
		
//		int arr[]= {6,6,7,7,6,7};
//		int arr[]= {0,5,4,0,6,0};
		
		int arr[]=new int[6];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int) ((Math.random()*9)+1);
			
		}
		
		Baby_Gin baby= new Baby_Gin();
		
		baby.result(arr);
		
	}
}
