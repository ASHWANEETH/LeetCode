public class Main
{
	public static void main(String[] args) {
		String a = "a2b3a2c3"; //output-> a4b3c3
		int arr[] = new int[26];
		for(int i = 0;i<a.length();i+=2){
		    arr[a.charAt(i)-'a'] += (a.charAt(i+1)-'0');
		}
		for(int i = 0;i<arr.length;i++){
		    if(arr[i]==0)continue;
		    char x = (char)(i + 'a');
		    System.out.print(x + "" + arr[i]);
		}
	}
}
