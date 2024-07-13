package stringconcepts;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*; 
import java.util.*;


public class Sapient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strinput ="Automatioooooon";  
		// Output=  2u27m22i777777n Automatioooooon
		
		String stroutput ="";
		String strlowercase= strinput.toLowerCase();

		HashMap<Character, Integer> map = new LinkedHashMap<>();

		for(int k=0;k<strlowercase.length();k++){

		    if(map.containsKey(strlowercase.charAt(k))){
		        map.put(strlowercase.charAt(k), map.get(strlowercase.charAt(k))+1);
		    }else{
		        map.put(strlowercase.charAt(k),1);
		    }
		}

		System.out.println(map); //{a=2, u=1, t=2, o=7, m=1, i=1, n=1}

		for(Map.Entry<Character, Integer> entries: map.entrySet()){

		        if(entries.getValue()>1){
		        stroutput =  strlowercase.replace((String.valueOf(entries.getKey())),(String.valueOf(entries.getValue())));
		        strlowercase = stroutput; 
		      }
		       

		}
		System.out.println(stroutput);

		}

}
