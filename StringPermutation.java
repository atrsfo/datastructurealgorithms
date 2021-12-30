package com.test.company;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc";
		
		findStringPermutations(str);
		
	}

	private static void findStringPermutations(String str) {
		// TODO Auto-generated method stub
		int length = str.length();
		char[] charArr = str.toCharArray();
		
		//start with first 2 positions swap, then keep incrementing the positions
		//in a cyclic manner. break once the resulting string is same as original string
		for(int i=0,j=1;   ; i=(i+1)%length,j=(j+1)%length) {
			
			char temp = charArr[i];
			charArr[i]=charArr[j];
			charArr[j]=temp;
			
			String tempStr = String.valueOf(charArr);
			System.out.println(tempStr);
			if(tempStr.equals(str)) {
				break;
			}
		}
	}

}
