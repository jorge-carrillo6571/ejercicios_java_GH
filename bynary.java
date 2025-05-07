

import java.util.ArrayList;
import java.util.Scanner; 
public class bynary{

	public static int look (ArrayList<Integer> nums, int target){

		int l=0;

		int r=nums.size()-1; 
		while(l<= r){
			int m =l +(r-l)/2; 
			if(nums.get(m)==target){
				return m; 
			}
			if(nums.get(m)< target){
				l=m+1; 
			}else{
				r=m-1; 
			}
		}
		return -1; 
	}
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in); 
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		for (int i =0; i < 10; i++){

			nums.add(i); 
		
		}
		System.out.println("What number are you looking for?");
		int number = Integer.valueOf(scanner.nextLine()); 

		int index =look(nums, number); 
		System.out.println(index); 
	}
}
