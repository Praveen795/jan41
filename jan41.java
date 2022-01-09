package jan41;
import java.util.Stack;
public class jan41 {
	
	public static void main(String[] args) {
//___________________[reverse string using stack]__________________________________***
		
		Stack<Character> str=new Stack<>();
		
		String a="praveen";
		
		
		
		int start=0;
		int end=a.length();
		
		
		for(int i=0;i<end;i++) {
			
			str.push(a.charAt(i));
			
		}
		
		for(int i=0;i<end;i++) {
			char b=str.pop();
			System.out.print(b);
			
		}
		
		
		
		
		
	}

}
