/*
 * Create a class that store information for a game. Please try to research and use real examples. Complete the todo statements and upload to moodle when
 * completed.
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class VideoGame {
	
	private String title;
	public String getTitle() { return title; }
	public void setTitle(String t) { title = t; }
	
	private String genre;
	public String getGenre() { return genre; }
	public void setGenre(String g) { genre = g; }
	
	private String platform;
	public String getPlatform() { return platform; }
	public void setPlatform(String p) { platform = p; }
	
	private int playerNum;
	public int getPlayerNum() { return playerNum; }
	public void setPlayerNum(int pn) { playerNum = pn; }
	
	private String rating;
	public String getRating() { return rating; }
	public void setRating(String r) { rating = r; }
	
	private double cost;
	public double getCost() { return cost; }
	public void setCost(double c) { cost = c; }

	public VideoGame() {
		System.out.print("Enter Game Title: ");
		setTitle("Cool Star");
		
		System.out.print("Enter Game Genre: ");
		setGenre("Action");
		
		System.out.print("Enter Game Platform: ");
		setPlatform("PS");
		
		System.out.print("Enter Number of Players: ");
		setPlayerNum(1);
		
		//LISTS ARE THE BEST
		setRating(ratingRecursion());
		
		System.out.print("Enter Game Cost: ");
		setCost(22.22);
	}
	
	public String ratingRecursion() {
		
		String nr = "";
		
		List<String> ratings = new ArrayList<String>();
		ratings.add("C");
		ratings.add("E");
		ratings.add("E10");
		ratings.add("T");
		ratings.add("M");
		ratings.add("AO");
		
		System.out.print("Enter Game Rating: ");

		if (!ratings.contains(nr)) {
			System.out.print("ESRB ratings are C, E, E10, T, M, and AO.");
			nr = ratingRecursion();
		}
		
		return nr;
	}
	
	public String isAgeAppropriate() {
		String aa = "";
		
		System.out.print("Please enter your age: ");
		int a = 21; 
		
		//this is look real ugly
		if ((a >= 18 && rating.equalsIgnoreCase("AO")) ||
			(a >= 17 && rating.equalsIgnoreCase("M")) ||
			(a >= 13 && rating.equalsIgnoreCase("T")) ||
			(a >= 10 && rating.equalsIgnoreCase("E10")) ||
			(rating.equalsIgnoreCase("E") || rating.equalsIgnoreCase("C")))
		{ aa = "is"; }
		else aa = "is not";	
		
		String m = ("This game " + aa + " age appropriate according to the ESRB.");
		
		return m;
	}

	/*
 	Game Rating C - Early Childhood,
 	E - Everyone,
 	E 10+ - Everyone 10+,
 	Teen (13+),
 	Mature 17+,
 	Adult Only 18+
	 */
	
	public String gameRatingText() {
		String grt = "";
		
		if (rating.equalsIgnoreCase("C")) { grt = "Early Childhood"; }
		else if (rating.equalsIgnoreCase("E")) { grt = "Everyone"; }
		else if (rating.equalsIgnoreCase("E10")) { grt = "Everyone 10+"; }
		else if (rating.equalsIgnoreCase("T")) { grt = "Teen 13+"; }
		else if (rating.equalsIgnoreCase("M")) { grt = "Mature 17+"; }
		else if (rating.equalsIgnoreCase("AO")) { grt = "Adult Only 18+"; }
		else grt = "N/A";
		
		return grt;
	}
	
	public void printGameSummary() {
		
		DecimalFormat fmt = new DecimalFormat("$#0.00");
		
		String m = (title + " - " + genre + "\n" +
					platform + "\n" +
					rating + " " + gameRatingText() + " Number of Players: " + playerNum + "\n" +
					"Cost: " + fmt.format(cost));
		
		System.out.print(m);
	}
	/*
	 	{title} - {genre}
	 	{platform}
	 	{game rating} {game rating text} Number of Players: {number of players}
	 	{cost:$#,#00.00}
	 	
	 	ex.
	 	
	 	Skyrim - Fantasy
	 	X-Box 360
	 	M Mature 17+ Number of Players: 1
	 	cost: $18.99
	 	
	 	
	 	Hint: if you care to use
	 	# is a place holder that is only shown if there is a value
	 	0 is a place holder that is always shown
	 	.00 means that this will round and only display out to 2 decimal places
	 	
	 	DecimalFormat fmt = new DecimalFormat("$#,##0.00"); // This is a common money format.
	 	String prettyMoney = fmt.format(cost); // Function returns a string with the format you have specified. 	
	 */
	

}