package practice;


class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        return answer;
    }
}
public class Practice2 {

	public static void main(String[] args) {
		
		int absolutes[]= {4,7,12};
		boolean signs[]= {true,false,true};

		int answer=0;
		for(int i=0; i<absolutes.length;i++) {

			answer+=absolutes[i]*(signs[i]?1:-1);
			
		}
		System.out.println(answer);
	}
}
