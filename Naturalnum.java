package program;
import java.util.Scanner;
public class Naturalnum {
public static void main(String[] args) {
		int n,sum=0;
		 Scanner s = new Scanner(System.in);
	     System.out.print("Enter no of elements:");
	     n = s.nextInt();
	     if(n>0){
	    	 for(int i=0;i<=n;i++){
	    		 sum=sum+i;
	    	 }
	    	 System.out.println(sum);
	     }
	     else{
	    	 System.out.println("invalid no");
	     }

	}

}
