import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		 String[] firstNames = new String[] {"Donald", "Sammy", "Piper", "Lantern"};
		 String[] lastNames = new String[] {"Dicchico", "White", "Whisk", "Ghost"};
		 String[] posts = new String[] {"Just say no!", "I'M SO HUNGRY", "someone cuddle pls :(", "####XXXZZ!!!???#1121"};
		 String[] reply1 = new String[] {"I Tried", "It didn't work"};
		 String[] reply2 = new String[] {"I COULD EAT THE WHOLE WORLD", "NOW IM IN SPACE"};
		 String[] reply3 = new String[] {"im so lonely i need a hug", "oh nvm my gf's here <3 <3 <3"};
		 String[] reply4 = new String[] {"world is a hog's head", "Y0U CANN0T FIGHT ENTR0PY"};
		 List<List<String>> replies = new ArrayList<List<String>>();
		 replies.add(Arrays.asList(reply1));
		 replies.add(Arrays.asList(reply2));
		 replies.add(Arrays.asList(reply3));
		 replies.add(Arrays.asList(reply4));

		List<User> users = new ArrayList<User>();
		 
		for(int i = 0; i <= 3; i++) {
			List<Post> all = new ArrayList<Post>();
			User u = new User();
			u.setFirstName(firstNames[i]);
			u.setLastName(lastNames[i]);
			
			Post p = new Post();
			p.setOwner(u);
			p.setMessage(posts[i]);
			all.add(p);
			for(String r : replies.get(i)) {
				Post rep = new Post();
				rep.setMessage(r);
				rep.setOwner(u);
				rep.setParent(p);
				all.add(rep);
			}
						
			u.setPosts(all);
			users.add(u);
		}
		
		for(User me : users) { me.print(); }
		// dependency chain
		// person <- user <- post <- reply
	}
}
