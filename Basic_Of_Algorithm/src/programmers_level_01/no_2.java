package programmers_level_01;

public class no_2 {

	public static void main(String[] args) {
		
	String new_id = "...!@BaT#*..y.abcdefghijklm";
	
	new_id = new_id.toLowerCase();
	new_id = new_id.replaceAll("[^a-z1-9-_.]", "");
	new_id = new_id.replaceAll("[.]{2,}", ".");
	new_id = new_id.replaceAll("^[.]|[x]$", "");
	
	if(new_id.isEmpty())new_id ="a";
	
	if(new_id.length()>15) {
		new_id = new_id.substring(0,15);
		new_id = new_id.replaceAll("[.]$", "");
	}
	
	if(new_id.length()<3) {
		while(new_id.length()<3) {
			new_id += new_id.charAt(new_id.length()-1);
		}
	}
	
	System.out.println(new_id);
	
	}
}
