package _02_sea_creature;

public class SeaCreaturerunner {
public static void main(String[] args) {
	SeaCreature sponge = new SeaCreature("spongebob");
	sponge.getName();
	sponge.eat();
	sponge.laugh();
	
	SeaCreature patrick = new SeaCreature("patrick");
	patrick.getName();
	patrick.eat();
	patrick.laugh();
	
	SeaCreature squidward = new SeaCreature("squidward");
	squidward.getName();
	squidward.eat();
	squidward.laugh();
			}
}
