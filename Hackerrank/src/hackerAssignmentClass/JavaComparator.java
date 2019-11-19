package hackerAssignmentClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
class Checker implements Comparator{
	public  int compare(Object o1 ,Object o2) {
		Player p1 = (Player) o1;
		Player p2 = (Player) o2;
		if(p1.score == p2.score) {
			return p1.name.compareTo(p2.name);
		}else if(p1.score < p2.score) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
}
class Player{
	String name;
	int score;
	Player(String name,int score){
		this.name = name;
		this.score = score;
		
	}
}


public class JavaComparator {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Player[] player = new Player[n];
		Checker check = new Checker();
		for(int i = 0 ; i < n ; i++) {
			player[i] = new Player(scan.next(),scan.nextInt());
		}
		Arrays.sort(player,check);
		for(int i = 0 ; i< player.length ;i++) {
			System.out.printf("%s\n" +player[i].name,player[i].score);

		}
		 

	}

}
