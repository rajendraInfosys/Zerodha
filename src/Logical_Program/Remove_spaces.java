package Logical_Program;

public class Remove_spaces {
public static void main(String[] args) {
	String str="R@ A 12 JEN ^&% D R A";
	String name=str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(name);
	}
}

