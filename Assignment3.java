import java.util.*;

class Sports{
	
	String getName(){
		return "Generic Sports";
	}
	void getNumberOfTeamMembers(){
		System.out.println("Each team has n plyers in " + getName());
	}
}

class Soccer extends Sports{
	@Override
	String getName(){
		return "Soccer Class";
	}
	void NumberOfTeamMembers(){
		System.out.println("Each team has 11 players in "+getName());
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		
		Sports x1 = new Sports();
		Soccer x2 = new Soccer();
		System.out.println(x1.getName());
		x1.getNumberOfTeamMembers();
		System.out.println(x2.getName());
		x2.NumberOfTeamMembers();

	}

}
