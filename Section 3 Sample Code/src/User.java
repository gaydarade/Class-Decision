import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User extends Person {
	private String username;
	public String getUsername() { return username; }
	public void setUsername(String u) { username = u; }
	
	private String email;
	public String getEmail() { return email; }
	public void setEmail(String em) { email = em; }
	
	private String password;
	public String getPassword() { return password; }
	public void setPassword(String p) { password = p; }
	
	private String mobile;
	public String getMobile() { return mobile; }
	public void setMobile(String m) { mobile = m; }
	
	private List<Post> posts;
	public List<Post> getPosts() { return posts; }
	public void setPosts(List<Post> p) { posts = p; }
	
	public int getPostCount() {
		return (int)posts.stream().filter(x -> x.getParent() == null).count();
	}
	
	public int getReplyCount() {
		return (int)posts.stream().filter(x -> x.getParent() != null).count();
	}
	
	public void print() {
		String postWord = getPostCount() == 1 ? "post" : "posts";
		String replyWord = getReplyCount() == 1 ? "reply" : "replies";
		
		System.out.println(getFirstName() + " " + getLastName());
		System.out.println("Has " + getPostCount() + " " + postWord + ".");
		System.out.println("Has " + getReplyCount() + " " + replyWord + ".");
		
		
		System.out.println("Posts:");
		printPosts(true);
		System.out.println("Replies:");
		printPosts(false);
	}
	
	
	private void printPosts(boolean posts) {
		List<Post> messages = new ArrayList<Post>();
		
		if (posts) {
			messages = this.posts.stream().filter(x -> x.getParent() == null).collect(Collectors.toList());
		}
		else {
			messages = this.posts.stream().filter(x -> x.getParent() != null).collect(Collectors.toList());
		}
		
		for(Post p : messages) {
			System.out.println(p.getMessage());
		}
	}
}
