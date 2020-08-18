package _06_minion;

public class Minion {
	
		private String name; 
		private int eyes; 
		private String color; 
		private String master;
	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String n) {
		this.name = n;
	}
	
	public int getEyes() {
		return eyes;
		
	}
	public void setEyes(int a) {
		this.eyes = a;
	}
	public String getColor() {
		return color;
		
	}
	public void setColor(String b) {
		this.color = b;
	}
	public String getMaster() {
		return master;
		
	}
	public void setMaster(String c) {
		this.master = c;
	}


}
