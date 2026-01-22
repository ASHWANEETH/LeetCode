public class Main
{
	public static void main(String[] args) {
	  //decimal to binary
		int db=100;
		StringBuilder dba = new StringBuilder();
		
		while(db>0){
		    dba.append(db%2); //--->6 if hexa, 8 if octa...
		    db/=2;
		}
		System.out.println(dba.reverse().toString());
		
		//binary to decimal
		int bd = 1100100;//100
		int bda = 0;
		int mul = 1;
		
		while(bd>0){
		    int l = bd%10;
		    bda+=l*mul;
		    mul*=2; //--->6 if hexa, 8 if octa...
		    bd/=10;
		}
		System.out.print(bda);
	}
	
}
