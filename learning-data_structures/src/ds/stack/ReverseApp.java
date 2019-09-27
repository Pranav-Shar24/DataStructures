package ds.stack;

import java.util.Scanner;

public class ReverseApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String name = sc.nextLine();
		sc.close();
		char[] myName =name.toCharArray();
		ReverseAString rs = new ReverseAString(myName);
		for (int i = 0; i < myName.length; i++) {
			rs.push(myName[i]);
		}
		
		String result = "";
		while(!rs.isEmpty()) {
			char value = rs.pop();
			System.out.print(result + value);
		}
		}
	}

