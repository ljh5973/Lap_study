package practice;

public class EmptyNumSum {

	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,6,7,8,0};
		
		int temp[]=new int[10];
		
		for(int x: num) {
			temp[x]=1;
		}
		
		int sum=0;
		
		for(int i=0; i<temp.length; i++) {
			sum+=(temp[i] ==0 )? i:0;
		}
		System.out.println(sum);
	}
}
