package hackerAssignmentClass;

class Sports{
	String getName() {
		return "Generic Sports";
	}
	void getNameOfTeamMember() {
		System.out.println("Each team has n players in " +getName());
	}
}
class Soccer extends Sports{
	@Override
	String getName() {
		return "Soccer Class";
	}
	void getNameOfTeamMember() {
		System.out.println("Each team has 11 players in " +getName());
	}
	
}

public class JavaMethodOverriding {

	public static void main(String[] args) {
		Soccer s1 = new Soccer();
		Sports sp = new Sports();
		System.out.println(sp.getName());
		sp.getNameOfTeamMember();
		System.out.println(s1.getName());
		s1.getNameOfTeamMember();
		

	}

}
