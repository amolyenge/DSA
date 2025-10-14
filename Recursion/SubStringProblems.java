
public class subSequence {

	public static void main(String[] args) {
          subSeq("" , "abc");
	}

	public static void subSeq(String p , String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		subSeq(p + ch , up.substring(1));
		subSeq(p , up.substring(1));
	}
}

==============================================================================================================================================================================================


public class skipLetter {

	public static void main(String[] args) {
         print("" , "baccadas");
	}
	
	public static void print(String p , String str) {
		if(str.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = str.charAt(0);
		
		if(ch == 'a') {
			print(p ,str.substring(1));
		}else {
			print(p + ch , str.substring(1));
		}
	}

}

========================================================================================================================================================================================================


public class skipLetter2 {
	public static void main(String[] args) {
       System.out.println(print("baccbaabdaxab"));
	}
	
	public static String print(String str) {
		if(str.isEmpty()) {
			return "";
		}
		
		char ch = str.charAt(0);
		
		if(ch == 'a') {
			return print(str.substring(1));
		}else {
			 return ch + print(str.substring(1));
		}
	}
}
