public class Track {
	private int trackNum;
	public int getTrackNum() { return trackNum; }
	public void setTracknum(int tn) { trackNum = tn; }
	
	private String title;
	public String getTitle() { return title; }
	public void setTitle(String t) { title = t; }
	
	private String artist;
	public String getArtist() { return artist; }
	public void setArtist(String a) { artist = a; }
	
	private int duration;
	public int getDuration() { return duration; }
	public void setDuration(int d) { duration = d; }
	
	private int bitRate;
	public int getBitRate() { return bitRate; }
	public void setBitRate(int br) {
		if (br < 160) bitRate = 128;
		else if (br < 192) bitRate = 160;
		else if (br < 256) bitRate = 192;
		else if (br < 320) bitRate = 256;
		else bitRate = 320;
	}
	
	public Track() {
		System.out.print("Enter Track Number: ");
		trackNum = Integer.parseInt(Program.in.nextLine());
		
		System.out.print("Enter Title: ");
		title = Program.in.nextLine();
		
		System.out.print("Enter Artist: ");
		artist = Program.in.nextLine();
		
		System.out.print("Enter Duration (in seconds): ");
		duration = Integer.parseInt(Program.in.nextLine());
		
		System.out.print("Enter bit-rate: ");
		setBitRate(Integer.parseInt(Program.in.nextLine()));
		
	}
	
	
	public String rankBitRate(int br) {
		String rank = "";
		if (br == 128 || br == 160) rank = "Good";
		else if (br == 192 || br == 256) rank = "Better";
		else rank = "Best";
		return rank;
	}
	
	public String getDuration(int d) {
		int min = d / 60;
		int sec = d % 60;
		String duration = "";
		if (sec < 10) { duration = (min + ":0" + sec); }
		else duration = (min + ":" + sec);
		return duration;
	}
	
	public void printTrackSummary() {
		String mes = (trackNum + " - " + title + "\n"
					+ artist + "\n"
					+ getDuration(duration) + "\n"
					+ bitRate + "kbps - " + rankBitRate(bitRate));
		System.out.print(mes);
	}

	// TODO create a function that prints out the track's information as follows:
	/*
	   {track number} - {title}
	   {artist}
	   {human readable duration }
	   {bit rate} {bit rate rating}
	   
	   ex.
	   
	   2 - Nutshell
	   Alice in Chains
	   4 minutes and 19 seconds
	   256 Kbps Better Quality	   
	   
	 */
}