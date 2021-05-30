import java.util.*;
class HashTable {
	String[] keys;
	int[] values;
	int M; //hashTable size
	//Hash table constructor
	HashTable(int m){
		keys = new String[m];
		values = new int[m];
		M = m;
	}	
	//Hash값을 얻기 위한 함수
	int hash(String key) {
		return (key.hashCode()&0xfffffff)% M;		
	}
	// Store <key, value> pair at specified key space
	//key값을 가진 value값을 저장하기 위한 함수
	void put(String key, int value) {
		int h = hash(key);
		while( keys[h] != null ) h = (h+1)%M;	//해쉬의 값이 비어있지 않다면 빈 공간을 찾아 내려가는 방식
		keys[h] = key;
		values[h] = value;
	}
	//key값을 가진 것이 존재하는 경우 값 반환, 그렇지 않으면 null반환
	//if key exist, return the value otherwise return null
	Integer get (String key) {
		int h = hash(key);
		while(keys[h] != null) {
			if(keys[h].equals(key)) break;
			h = (h+1)%M;
		}
		if(keys[h] == null) return null;
		return values[h];
	}
	//remove key
	void remove(String key) {	}
	//check if specified key exist at hash table
	boolean contaions (String key) {
		int h = hash(key);
		while(keys[h] != null) {
			if(keys[h].equals(key)) return true;
			h = (h+1)%M;
		}
		return false;
	}
}	
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 HashTable map = new HashTable(499);
		 map.put("one", 1);
		 map.put("two", 2);
		 map.put("three", 3);
		 map.put("four", 4);
		 map.put("five", 5);
		 map.put("six", 6);
		 map.put("seven", 7);
		 map.put("eight", 8);
		 map.put("nine", 9);
		 map.put("ten", 10);
//		 while(true) {
//			 System.out.print("Input a key for find (exit : quit) : ");
//			 String key = sc.next();
//			 if(key.equals("quit"))break;
//			 if(!map.contaions(key)) {
//				 System.out.println(key + " is not found.");
//				 continue;
//			 }
//			 System.out.println(key + " is "+map.get(key));
//		 }
		 while(true) {
			 String cmd = sc.next();
			 if(cmd.equals("quit"))break;
			 if(cmd.equals("add")) {
				 String key = sc.next();
				 int value = sc.nextInt();
				 map.put(key, value);
			 }
			 else if(cmd.equals("remove")) {
				 String key =sc.next();
				 map.remove(key);
			 }
			 else if (cmd.equals("find")){
				 String key = sc.next();
				 if(!map.contaions(key)) {
					 System.out.println(key + " is not found. ");
				 }
				 else {
					 System.out.println(key + "is" + map.get(key)+".");
				 }
			 }
		 }
//		 System.out.println("one is "+map.get("one"));
//		 System.out.println("five is "+ (map.contaions("five")?"":"not")+"in map");
	}

}
