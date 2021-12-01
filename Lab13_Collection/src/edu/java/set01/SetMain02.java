package edu.java.set01;

import java.util.HashSet;
import java.util.Set;

import edu.java.list04.Score;

public class SetMain02 {

	public static void main(String[] args) {
		
		// edu.java.list04.Score를 저장하는 HashSet을 생성
		Set<Score> set = new HashSet<>();
		
		System.out.println(set);
		set.add(new Score());
		
		System.out.println(set);
		// equals()의 결과가 true이면, hashCode()의 리턴 값이 같다.
		// hashCode()의 리턴 값이 다르면, equals()의 결과가 false이다.
		// HashSet<E>은 원소를 추가(add)할 때, hashCode() 값이 다르면 equals 검사를 하지 않고 add
		
		set.add(new Score(0,0));
		System.out.println(set);
		
		set.add(new Score(100,100));
		System.out.println(set);
		System.out.println(set.size());
		set.remove(new Score(100,100));
		System.out.println(set);
	}
}
