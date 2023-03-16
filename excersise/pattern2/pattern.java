import java.util.*;
class pattern{
	public static void main(String [] args){
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Value :");
		n=sc.nextInt();
		for(i=n;i>=0;i--){
			for(j=0;j<=n;j++){
				System.out.print("*");
			}
		System.out.println("");
		}
}
}