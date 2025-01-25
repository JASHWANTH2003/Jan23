
public class SecondType {
 static void pattern(char ch1,int num1,char ch2,int num2) {
	 for(int i=1;i<=num1;i++) {
		 System.out.print(ch1);
	 }
     System.out.println("\n");
     for (int i=1;i<=num2;i++) {
    	 System.out.print(ch2); 
     }
     System.out.println();
 }
 public static void main (String []abc) {
	 pattern('*',5,'-',6);
	 System.out.println("welcome");
	 pattern('*',6,'-',7);
	 System.out.println("hyd");



	}

}
