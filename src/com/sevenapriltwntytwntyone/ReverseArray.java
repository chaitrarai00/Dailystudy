package com.sevenapriltwntytwntyone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] array= {3,4,5,6,7};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" "); //Time Complexity O(n) 
			list.add(array[i]);
		}
		
		Collections.reverse(list);
		System.out.print(list);
		
		int first=0;
		int last=array.length-1;
		while(last>=first) {
			int temp=array[first];
			array[first]=array[last];
			array[last]=temp;
			first++;
			last--;
		}
		for(int i=0;i<=array.length-1;i++) {
			System.out.print(array[i]+" "); //Time Complexity O(n) 
		}
	}
	
}
