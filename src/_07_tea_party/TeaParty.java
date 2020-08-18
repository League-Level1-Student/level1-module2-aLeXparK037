package _07_tea_party;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	 public String welcome(String name, boolean isWoman, boolean isKnighted) {
		 if (isKnighted == true && isWoman == false) {
		return "Hello Sir " + name;
		 }
		 if (isKnighted == true && isWoman == true) {
			 return "Hello Lady " + name;
		 }
		 if (isKnighted == false && isWoman == false) {
			 return "Hello Mr. " + name;
		 }
		 if (isKnighted == false && isWoman == true ) {
			 return "Hello Ms. " + name;
		 }
		 return name;
	    }
	

}
