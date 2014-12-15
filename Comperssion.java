package lz;
import java.util.ArrayList;
import java.util.Vector;

public class Comperssion {
	private String str;
	
	public void scomp (String s){

		for (int i = 0 ; i < s.length() ; i++){
			int back = 0 , move = 0 ;
			char ch = s.charAt(i);
			int ba = 0;
			for (int j = i-1 ; j >= 0; j--){
				int y = 0;
				ba++;
				char c = '\0';
				if (s.charAt(i) == s.charAt(j)){
					for (int q = i , o = j ; q < s.length() ; q++ , o++){
						if (s.charAt(q) == s.charAt(o)){
							y++;
							if (q+1 == s.length())
								c = '\0';
							else
								c = s.charAt(q+1);
						}
						else 
							break;
						
					}
					if (y > move ){
						move = y ;
						back = ba ;
						ch = c;
					}
					else if (y == move && ba < back){
						back = ba;
						ch = c;
					}
				}
			}
			System.out.print("< " + back + " , ");
			System.out.print(move + " , ");
			if (ch == '\0')
				System.out.println("Null"+ " >");
			else 
				System.out.println(ch + " >");
			i += move ;
		}
	}
}
