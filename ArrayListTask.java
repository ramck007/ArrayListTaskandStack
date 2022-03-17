package arraylisttask;

import java.util.Scanner;

public class ArrayListTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		Datas dt= new Datas();
		
		while(true) {
			System.out.println("1.Insert Data \n2.Print specific Data\n3.Print all Datas\n4.Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1: dt.dataInput();
				break;
			case 2://dt.showSpecificData();
				try {
					dt.showSpecificData();
				}
				finally {
					System.out.println("OOPs not Found\n");
				}			
				break;
			case 3:dt.showAllData();
				break;
			case 4:System.out.println("BYE BYE"); 
				System.exit(0);
			default:
				break;
				
				
			}
		}
		

	}

}
