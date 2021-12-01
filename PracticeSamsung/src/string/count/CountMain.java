package string.count;


public class CountMain {

	public static void main(String[] args) {
		
//		char arr[][]= { 
//				{'c','b','b','c','b','a','a','b'},
//				{'c','c','c','b','a','b','c','b'},
//				{'c','a','a','a','a','c','a','b'},
//				{'b','a','c','c','c','c','a','c'},
//				{'a','a','b','c','b','b','a','c'},
//				{'a','c','a','a','c','a','b','c'},
//				{'b','c','c','b','a','a','b','c'},
//				{'a','b','b','b','c','c','a','a'}
//					};
//		
//		int count=0;
//		int length=0;
		boolean flag=false;
		
		int index=0;
		String str="";
				
		char temp[]={'c','b','b','c','b','a','a','b'};
		int len=temp.length;
		for(int i=0; i<len/2; i++) {
			while(true) {
				if(temp[index]==temp[len-1-i]) {
					flag=true;
					index++;
				}
				else {
					flag=false;
					i++;
				}
				
				if(index==(len/2)-1) {
					break;
				}
			}
			
		
			len--;
		}
		
		if(flag) {
			System.out.println("회문이 있습니다.");
			System.out.println(str);
		}else {
			System.out.println("회문이 없습니다.");
		}
	}
}
