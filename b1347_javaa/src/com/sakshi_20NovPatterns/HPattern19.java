//	1234567
//	7123456
//	6712345
//	5671234
//	4567123
//	3456712
//	2345671
package com.sakshi_20NovPatterns;

public class HPattern19 {
	public static void main(String[] args) {
		int n=7;
		for(int r=1;r<=7;r++) {
			for(int c=1;c<=7;c++) {
				int num =((c-r+n)%n) +1;
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
