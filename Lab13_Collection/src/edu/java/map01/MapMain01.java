package edu.java.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Collection<E>
 * |__List<E>, Set<E>
 * List<E>,Set<E> 공통점 : 한 가지 타입의 객체 여러개를 저장하는 자료 구조. 
 * List<E> : 저장 순서가 중요, 인덱스가 있음. 같은 값을 저장할 수 있음.
 * Set<E>: 저장 순서가 중요하지 않음. 인덱스 없음. 같은 값을 저장할 수 없음.
 * 
 * List<E> 
 * |_ArrayList<E>, LinkedList<E>
 * ArrayList<E>, add/remove 속도 느림.  get 속도 빠름
 * LinkedList<E> : add/remove 속도 빠름. get 속도 느림.
 * 
 * 
 * Set<E>
 * |__HashSet<E>, TreeSet<E>
 * HashSet<E> : 검색을 빨리 하기 위한 알고리즘(Hash 알고리즘)이 적용된 집합(set)
 * TreeSet<E> : (오름차순/내림차순) 정렬을 빨리 하기 위한 알고리즘(tree 알고리즘)이 적용된 집합(set)
 * 
 * Map<K, V> Key(키)와 Value(값)의 쌍으로 구성된 데이터를 저장하는 구조.
 * 1) Key는 중복된 값을 가질 수 없음.
 * 2) Key의 목적은 데이터를 저장, 검색, 수정, 삭제
 * 3) Value(값)은 중복된 값을 가질 수 있음.
 * |__ HashMap<K, V> , TreeMap<K,V>
 * HashMap<K, V> 검색을 빨리 하기 위한 hash알고리즘이 적용된 Map.
 * TreeMap<K, V> 검색을 빨리 하기 위한 Tree알고리즘이 적용된 Map.
 */
public class MapMain01 {

	public static void main(String[] args) {
		
		// key(정수) - Value(문자열) 타입의 HashSet을 생성
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "바보");
		
		// map에 저장된 원소의 개수 : size()
		System.out.println(map.size());
		
		// map에 새로운 데이터 추가(저장) : put(key, value)
		
		
		System.out.println(map);
		
		// map 에 저장된 데이터 삭제: remove(key) - 해당 key의 데이터를 삭제
		// map은 value를 찾아서 삭제하는 기능은 없음. (비교) 리스트
		map.remove(1);
		System.out.println(map);
		
		// map에 저장된 데이터 검색: get(key) - 해당 키의 value를 리턴
		System.out.println(map.get(1));
		
		// map에서 특정 key의 값(value)을 수정하는 기능: put(key:value)
		map.put(1,"aaa");
		map.put(5,"bbb");
		
	
		
		// keySet() : Map이 가지고 있는 key들의 집합(set)을 리턴하는 메서드
		
		Set<Integer> set=map.keySet();
		System.out.println(set);
		
		// Map 객체는 향상된 for 구문을 사용할 수 없지만,
		//keySet을 이용하면 향상된 for 구문을 사용할 수 있음.
		for(Integer k : set) {
			System.out.print(k+" ");
		}
		
		System.out.println();
		//HashMap 과 TreeMap 비교
		
		TreeMap<Integer, String> tMap = new TreeMap<>();
		tMap.put(10,"abc");
		tMap.put(1,"def");
		tMap.put(5,"adsf");
		
		Set<Integer> kset2=tMap.keySet();
		
		System.out.println(kset2);
		
		// TreeMap에는 HashMap이 가지고 있지 않은 descendingKeySet() 메서드가 있음
		// 내림차순 정렬된 key들의 집합을 리턴해줌.
		Set<Integer> kset3=tMap.descendingKeySet();
		System.out.println(kset3);
		
		
	}
}
