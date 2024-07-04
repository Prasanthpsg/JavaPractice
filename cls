[33mcommit a35c94bb62dbb1142e9fc45a8f2f19dfb07a86c3[m[33m ([m[1;36mHEAD[m[33m -> [m[1;32mJavademo[m[33m, [m[1;31morigin/Javademo[m[33m)[m
Author: Prasanth Kandasamy <prasanth.kandasamy@mphasis.com>
Date:   Sun Jun 30 00:07:27 2024 +0530

    important code

[1mdiff --git a/src/test/java/Leetcode/CounttheNumberofConsistentStrings.java b/src/test/java/Leetcode/CounttheNumberofConsistentStrings.java[m
[1mnew file mode 100644[m
[1mindex 0000000..d416601[m
[1m--- /dev/null[m
[1m+++ b/src/test/java/Leetcode/CounttheNumberofConsistentStrings.java[m
[36m@@ -0,0 +1,54 @@[m
[32m+[m[32mpackage Leetcode;[m
[32m+[m
[32m+[m[32mimport java.util.HashMap;[m
[32m+[m[32mimport java.util.LinkedHashMap;[m
[32m+[m[32mimport java.util.Map;[m
[32m+[m[32mimport java.util.Map.Entry;[m
[32m+[m
[32m+[m[32mpublic class CounttheNumberofConsistentStrings {[m
[32m+[m
[32m+[m	[32mpublic static void main(String[] args) {[m
[32m+[m		[32m// TODO Auto-generated method stub[m
[32m+[m[41m		[m
[32m+[m		[32mString allowed = "ab"; String[] words = {"ad","bd","aaab","baa","badab"};[m
[32m+[m		[32mboolean entrycheck = false; int counter=0;[m
[32m+[m[41m		[m
[32m+[m		[32mfor(String strinput: words) {[m
[32m+[m			[32mMap<Character,Integer> map = new LinkedHashMap<>();[m
[32m+[m[41m			[m
[32m+[m			[32mfor(int z=0;z<strinput.length();z++) {[m
[32m+[m				[32mmap.put(strinput.charAt(z), map.getOrDefault(strinput.charAt(z),0)+ 1);[m
[32m+[m[32m//				if(map.containsKey(strinput.charAt(z))) {[m
[32m+[m[32m//					map.put(strinput.charAt(z), map.get(strinput.charAt(z))+1);[m
[32m+[m[32m//				}else {[m
[32m+[m[32m//					map.put(strinput.charAt(z), 1);[m
[32m+[m[32m//				}[m
[32m+[m			[32m}[m
[32m+[m[41m			[m
[32m+[m[41m			[m
[32m+[m			[32mfor(Entry<Character,Integer> entry: map.entrySet()) {[m
[32m+[m				[32mif(!(allowed.indexOf(entry.getKey())==-1)) {[m
[32m+[m					[32mentrycheck = true;[m
[32m+[m				[32m}else {[m
[32m+[m					[32mentrycheck = false;[m
[32m+[m				[32m}[m
[32m+[m			[32m}[m
[32m+[m[41m			[m
[32m+[m[41m			[m
[32m+[m			[32mif(entrycheck) {[m
[32m+[m				[32mSystem.out.println(strinput);[m
[32m+[m				[32mcounter++;[m
[32m+[m			[32m}[m
[32m+[m[41m			[m
[32m+[m[41m			[m
[32m+[m			[32m//output[m
[32m+[m			[32m//aaab[m
[32m+[m			[32m//baa[m
[32m+[m[41m			[m
[32m+[m		[32m}[m
[32m+[m[41m		[m
[32m+[m		[32mSystem.out.println(counter);//2[m
[32m+[m
[32m+[m	[32m}[m
[32m+[m
[32m+[m[32m}[m
[1mdiff --git a/src/test/java/Leetcode/MergeStringsAlternately.java b/src/test/java/Leetcode/MergeStringsAlternately.java[m
[1mnew file mode 100644[m
[1mindex 0000000..436c3be[m
[1m--- /dev/null[m
[1m+++ b/src/test/java/Leetcode/MergeStringsAlternately.java[m
[36m@@ -0,0 +1,21 @@[m
[32m+[m[32mpackage Leetcode;[m
[32m+[m
[32m+[m[32mpublic class MergeStringsAlternately {[m
[32m+[m
[32m+[m	[32mpublic static void main(String[] args) {[m
[32m+[m		[32m// TODO Auto-generated method stub[m
[32m+[m[41m		[m
[32m+[m		[32mString word1 = "abc"; String word2 = "pqr";[m
[32m+[m		[32mStringBuffer b = new StringBuffer();[m
[32m+[m		[32m//Output: "apbqcr"[m
[32m+[m[41m		[m
[32m+[m		[32mfor(int i=0;i<word1.length();i++) {[m
[32m+[m			[32mb.append(word1.charAt(i)).append(word2.charAt(i));[m
[32m+[m		[32m}[m
[32m+[m[41m		[m
[32m+[m		[32mSystem.out.println(b.toString());[m
[32m+[m[41m		[m
[32m+[m
[32m+[m	[32m}[m
[32m+[m
[32m+[m[32m}[m
[1mdiff --git a/src/test/java/Leetcode/ShuffleString.java b/src/test/java/Leetcode/ShuffleString.java[m
[1mnew file mode 100644[m
[1mindex 0000000..c7f4925[m
[1m--- /dev/null[m
[1m+++ b/src/test/java/Leetcode/ShuffleString.java[m
[36m@@ -0,0 +1,27 @@[m
[32m+[m[32mpackage Leetcode;[m
[32m+[m
[32m+[m[32mimport java.util.Arrays;[m
[32m+[m
[32m+[m[32mpublic class ShuffleString {[m
[32m+[m
[32m+[m	[32m@SuppressWarnings("null")[m
[32m+[m	[32mpublic static void main(String[] args) {[m
[32m+[m		[32m// TODO Auto-generated method stub[m
[32m+[m[41m		[m
[32m+[m		[32mString s = "codeleet";[m
[32m+[m		[32mint[] indices = {4,5,6,7,0,2,1,3};[m
[32m+[m		[32mString[] str = new String[s.length()] ;[m
[32m+[m[41m		[m
[32m+[m		[32mfor(int i=0;i<s.length();i++) {[m
[32m+[m			[32mstr[(indices[i])] = String.valueOf(s.charAt(i));[m
[32m+[m		[32m}[m
[32m+[m[41m		[m
[32m+[m		[32mSystem.out.println(Arrays.toString(str));[m
[32m+[m[41m		[m
[32m+[m		[32mfor(String str1: str) {[m
[32m+[m			[32mSystem.out.print(str1); //leetcode[m
[32m+[m		[32m}[m
[32m+[m
[32m+[m	[32m}[m
[32m+[m
[32m+[m[32m}[m
[1mdiff --git a/src/test/java/Leetcode/SortingSentencebasedonposition.java b/src/test/java/Leetcode/SortingSentencebasedonposition.java[m
[1mnew file mode 100644[m
[1mindex 0000000..c78cbed[m
[1m--- /dev/null[m
[1m+++ b/src/test/java/Leetcode/SortingSentencebasedonposition.java[m
[36m@@ -0,0 +1,49 @@[m
[32m+[m[32mpackage Leetcode;[m
[32m+[m
[32m+[m[32mimport java.util.Arrays;[m
[32m+[m[32mimport java.util.*;[m
[32m+[m
[32m+[m[32mpublic class SortingSentencebasedonposition {[m
[32m+[m
[32m+[m	[32mpublic static void main(String[] args) {[m
[32m+[m		[32m// TODO Auto-generated method stub[m
[32m+[m[41m		[m
[32m+[m		[32mString s = "is2 sentence4 This1 a3";[m
[32m+[m		[32m//Output: "This is a sentence"[m
[32m+[m[41m		[m
[32m+[m		[32mString[] strarr = s.split(" ");[m
[32m+[m		[32mString[] output = new String[strarr.length];[m
[32m+[m		[32mStringBuffer sb = new StringBuffer();[m
[32m+[m[41m		[m
[32m+[m		[32mfor(int i =0;i<strarr.length;i++) {[m
[32m+[m			[32mint pos =Character.getNumericValue(strarr[i].charAt(strarr[i].length()-1));[m
[32m+[m			[32moutput[pos-1] = strarr[i].substring(0,strarr[i].length()-1);[m
[32m+[m		[32m}[m
[32m+[m[41m		[m
[32m+[m		[32mSystem.out.println(Arrays.toString(output));[m
[32m+[m[41m		[m
[32m+[m[32m//		for(String o: output) {[m
[32m+[m[32m//			sb.append(o).append(" ");[m
[32m+[m[32m//		}[m
[32m+[m[32m//[m[41m		[m
[32m+[m[32m//		System.out.println(sb.toString().strip());[m
[32m+[m[41m		[m
[32m+[m		[32mSystem.out.println(String.join(" ", output)); //This is a sentence[m
[32m+[m[41m		[m
[32m+[m		[32m//using array list[m
[32m+[m		[32mString s1 = "is2 sentence4 This1 a3";[m
[32m+[m[41m		[m
[32m+[m		[32mString[] strarr1 = s1.split(" ");[m
[32m+[m[41m		[m
[32m+[m		[32mList<String> strlist = new ArrayList<>(List.of(strarr1));[m
[32m+[m		[32mfor(String word: strarr1) {[m
[32m+[m			[32mint pos =Character.getNumericValue(word.charAt(word.length()-1));[m
[32m+[m			[32mstrlist.set(pos-1, word.substring(0,word.length()-1));[m
[32m+[m		[32m}[m
[32m+[m[41m		[m
[32m+[m		[32mSystem.out.println(String.join(" ", strlist)); //This is a sentence[m
[32m+[m[41m		[m
[32m+[m
[32m+[m	[32m}[m
[32m+[m
[32m+[m[32m}[m
[1mdiff --git a/src/test/java/Leetcode/SortthePeople.java b/src/test/java/Leetcode/SortthePeople.java[m
[1mnew file mode 100644[m
[1mindex 0000000..2725bf9[m
[1m--- /dev/null[m
[1m+++ b/src/test/java/Leetcode/SortthePeople.java[m
[36m@@ -0,0 +1,45 @@[m
[32m+[m[32mpackage Leetcode;[m
[32m+[m
[32m+[m[32mimport java.util.ArrayList;[m
[32m+[m[32mimport java.util.Arrays;[m
[32m+[m[32mimport java.util.Collections;[m
[32m+[m[32mimport java.util.List;[m
[32m+[m[32mimport java.util.Map;[m
[32m+[m[32mimport java.util.TreeMap;[m
[32m+[m
[32m+[m[32mpublic class SortthePeople {[m
[32m+[m
[32m+[m	[32mpublic static void main(String[] args) {[m
[32m+[m		[32m// TODO Auto-generated method stub[m
[32m+[m[41m		[m
[32m+[m		[32mString[] names = {"Mary","John","Emma"};[m
[32m+[m		[32mint[] heights = {180,165,170};[m
[32m+[m	[32m//	Mary 180[m
[32m+[m	[32m//	Emma 170[m
[32m+[m	[32m//	John 165[m
[32m+[m[41m		[m
[32m+[m		[32mMap<Integer,String> map = new