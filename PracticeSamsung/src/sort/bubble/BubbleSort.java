package sort.bubble;


public class BubbleSort {

	public void sort(int []a) {
		
		
		
		for(int i=a.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
			
		}
		
//		for(int i=0; i<a.length-1; i++) {
//			for(int j=0; j<a.length-1-i; j++) {
//				if(a[i]>a[i+1]) {
//					int temp=a[i];
//					a[i]=a[i+1];
//					a[i+1]=temp;
//				}
//			}
//		}

		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			
			if(i>=a.length-1) {
				System.out.print(a[i]);
			}else {
				
				System.out.print(a[i]+",");
			}
		}
		System.out.print("]");
		
	}
}
