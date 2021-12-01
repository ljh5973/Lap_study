package ladder;

public class Ladder {

	boolean iswall(int x, int y ) {
		if(x<0|| x>=5) return true;
		if(y<0|| y>=5) return true;
		return false;
	}
	
	int calAbs(int a1, int a2) {
		return (a1-a2>0)? (a1-a2): -(a1-a2);
	}
	
	
}
