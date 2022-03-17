
import java.util.Scanner;
import java.util.Stack;

class StackData{
	Stack <Integer> st= new Stack<>();
	Scanner sc=new Scanner(System.in);
	
	public void displayData() {
		if(st.empty()) {
			System.out.println("OOPs Stack is Empty \nPush some Data into Stack to Display\n");
		}
		else {
			System.out.println("The Elements inside Stack are");
			System.out.println(st+"\n");
		}
	}
	
	public void pushinto() {
		System.out.println("Enter any Number to Push into Stack");
		int p=sc.nextInt();
		st.push(p);
		System.out.println("After Push");
		System.out.println(st+"\n");
	}
	 
	public void popinout() {
		st.pop();
		System.out.println("After PoP");
		System.out.println(st+"\n");
	}
		
}

public class StackLearn {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StackData sd =new StackData();
		while(true) {
			System.out.println("1.Display Datas in Stack\n2.Push data into Stack\n3.Pop Data Out of Stack \n4.Exit");
			int n= sc.nextInt();
			switch(n){
			case 1:sd.displayData();
				break;
			case 2:sd.pushinto();
				break;
			case 3:sd.popinout();
				break;
			case 4:System.exit(0);
				break;
			
			}
		}
		
				
	}

}		
		//System.out.println(st);
		//st.push(5);
		//st.push(7);
		//st.push(45);
		//st.push(77);
		//Integer x = (Integer) st.pop(); 
		//System.out.println(st);
		//st.pop();
		//System.out.println(st);


