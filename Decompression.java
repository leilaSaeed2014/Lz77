package lz;

import java.util.Scanner;

public class Decompression {
	private int back ;
	private int move;
	private char ch;

	public String decomp (){
		String str = "" ;
		Scanner tag = new Scanner(System.in);
		int t = tag.nextInt();
		for(int i = 0 ; i < t ; i++){
			Scanner in = new Scanner(System.in);
			int b = in.nextInt();
			int m = in.nextInt();
			char ch = in.nextLine().charAt(1);
			int len = str.length();
			for (int j= len-b ; j < len-b+m ; j++){
				str += str.charAt(j);
			}
			str += ch;
		}
		return str;

	}
}
