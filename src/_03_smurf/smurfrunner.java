package _03_smurf;

public class smurfrunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("handy");
	handy.getName();
	handy.eat();
	handy.getHatColor();
	
	Smurf two = new Smurf("Papa Smurf");
	two.getName();
	two.getHatColor();
	
	Smurf three = new Smurf("Smurfette");
	three.getName();
	three.getHatColor();
	three.isGirlOrBoy();
}
}
