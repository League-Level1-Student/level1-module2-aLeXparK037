package _04_tea_maker;

public class teamakerrunner {
public static void main(String[] args) {
	TeaBag bag = new TeaBag("mint");
	bag.getFlavor();
	
	Kettle one = new Kettle();
	one.getClass();
	one.boil();
	
	Cup two = new Cup();
	two.makeTea(bag, one.getWater());

}
}
