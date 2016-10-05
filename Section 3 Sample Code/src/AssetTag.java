import java.util.ArrayList;
import java.util.List;

public class AssetTag {
	public static void main(String[] args) {
		// TODO validate and use the following tags:
		String[] tags = {"0000022CMPMNM121 00021720160113A3F",
						 "0000158CMPMNM121 00021720160113D66",
						 "0000311PHNMNM102 00046820140416EEF",
						 "0000444PRJSAS102 00092020150722FFF",
						 "0002589PRNJEJ004 000A2220150801982",
						 "0000011CMPMNM108J00031120140509460",
						 "0001635LPTMNM115 00031120150807ABE",
						 "0000387CMPDCDC10300142220130807CAB",
						 "0002020OTHDCDC10500091820120202DEF",
						 "0008511TBTMNM104 00022920150101BAD",
						 "8675309OTHMNM113 00063620140611DAD"};
		List<AssetTag> tagBag = new ArrayList<AssetTag>();
		
		for (String s: tags) {
			AssetTag at = new AssetTag(s);
			if (at.Validate(s) == true) { tagBag.add(at); }
		}
		
		for (AssetTag at: tagBag) { at.Print(); }
	}
	
	private int dbID;
	public int getDBID() { return dbID; }
	public void setDBID(int db) { dbID = db; }
	
	private String deviceType;
	public String getDeviceType() { return deviceType; }
	public void setDeviceType(String dt) { deviceType = dt; }
	
	private String building;
	public String getBuilding() { return building; }
	public void setBuilding(String b) { building = b; }
	
	private String roomNum;
	public String getRoomNum() { return roomNum; }
	public void setRoomNum(String rn) { roomNum = rn; }
	
	private int poNum;
	public int getPONum() { return poNum; }
	public void setPONum(int po) { poNum = po; }
	
	private int tagDate;
	public int getTagDate() { return tagDate; }
	public void setTagDate(int td) { tagDate = td; }
	
	private String checksum;
	public String getChecksum() { return checksum; }
	public void setChecksum(String c) { checksum = c; }
	
	public boolean Validate(String at) {
		String ptn = "^\\d{7}(CMP|LPT|PRN|PRJ|TBT|PHN|OTH)(MN|SA|DC|WD|TC|JE)[\\s\\S]{5}\\d{14}[a-fA-F0-9]{3}$";
		boolean result = (at.matches(ptn)) ? true : false;
		return result;
	}
	
	public AssetTag() {
		
	}
	
	public AssetTag(String at) {
		if (Validate(at) == true) {
			String d = at.substring(0,7);
			while (d.substring(0,1).equals("0")) { d = d.substring(1); }
			setDBID(Integer.parseInt(d));
			setDeviceType(at.substring(7,10));
			setBuilding(at.substring(10,12));
			setRoomNum(at.substring(12,17).trim());
			setPONum(Integer.parseInt(at.substring(17,23)));
			setTagDate(Integer.parseInt(at.substring(23,31)));
			setChecksum(at.substring(31));
		}
		else
		{
			System.out.println("The Asset Tag " + at + " is an invalid tag.");
		}
	}
	
	public void Print() {
		// I got super sidetracked doing this to save on typing later. Also, there should be an easy way to initialize Lists on one line, so I don't have to do all this junk.
		List<List<String>> parallelDevs = new ArrayList<List<String>>();
		String [] devIDs  = {"CMP", "LPT", "PRN", "PRJ", "TBT", "PHN", "OTH"};
		String [] devices = {"Computer", "Laptop", "Printer", "Projector", "Tablet", "Phone", "Other"};
		String[][] devBag = {devIDs, devices};
		for (String[] s : devBag) {
			List<String> dummy = new ArrayList<String>();
			for (String ss : s) { dummy.add(ss); }
			parallelDevs.add(dummy);
		}
		
		List<List<String>> parallelBuilds = new ArrayList<List<String>>();
		String[] buildIDs = {"MN","SA","DC","WD","TC","JE"};
		String[] buildings = {"Main Campus", "Sauder Extension Building", "Downtown Campus", "Welding Building", "Technology Building", "Jones Education Center"};
		String[][] buildBag = {buildIDs, buildings};
		
		for (String[] s : buildBag) {
			List<String> dummy = new ArrayList<String>();
			for (String ss : s) { dummy.add(ss); }
			parallelBuilds.add(dummy);
		}

		String dLabel = parallelDevs.get(1).get(parallelDevs.get(0).indexOf(getDeviceType()));
		String bLabel = parallelBuilds.get(1).get(parallelBuilds.get(0).indexOf(getBuilding()));
		String date = Integer.toString(getTagDate());
		String y = date.substring(0,4);
		String m = date.substring(4,6);
		String d = date.substring(6);
		date = m + "/" + d + "/" + y;
		
		System.out.println("ID: " + getDBID() +
						 "\n" + dLabel + " - " + bLabel + " - " + getRoomNum() +
						 "\nPO: " + getPONum() +
						 "\nTagged: " + date +
						 "\nChecksum: " + getChecksum() +
						 "\n");

	}
}