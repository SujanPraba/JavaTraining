import java.util.*;
public class check{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		for(int i=0;i<s.length();i++){
			if (s.charAt(i)>='a'&& s.charAt(i)<='z'){
				int r = Character.getNumericValue(s.charAt(i+1));
				for(int j=0;j<r;j++){
					System.out.print(s.charAt(i));
				}
			}
		}
	}
}