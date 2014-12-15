package lz;
import java.util.Scanner;

import javax.print.attribute.standard.Compression;


public class main {

	public static void main(String[] args) {
		//Compression obj = new Compression();
		//Scanner in = new Scanner(System.in);
		//String x = in.nextLine();
		//obj.scomp(x);
		Decompression obj1 = new Decompression();
		System.out.println (obj1.decomp());
	}

}
