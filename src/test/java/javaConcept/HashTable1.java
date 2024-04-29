package javaConcept;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String,String>();
		ht.put("Prasanth", "22");
		ht.put("Prasanth1", "122");
		ht.put("Prasanth2", "222");
		ht.put("Prasanth3", "322");
	//	ht.put(null, "00"); // hash table does not allow null key - throwing null pointer exception
		//ht.put(null, "01"); // if we get duplicate key in the entries, the old value will be overridden. new one will take precedence
		ht.put("TEST", "null"); // hash table does not allow null value - throwing null pointer exception
		//ht.put("TEST2", null);
		ht.put("TEST3", "66");
		
		System.out.println(ht);

		//ht.keySet();
	}

}
