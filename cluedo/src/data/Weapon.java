package data;

public class Weapon {
	private String name;
	private boolean isClue;
	
	public Weapon(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setClue() {
		isClue = true;
	}
	
	public boolean isClue() {
		return isClue;
	}
	
	public static final String CANDLESTICK = "candlestick";
	public static final String KNIFE = "knife";
	public static final String LEADPIPE = "lead pipe";
	public static final String REVOLVER = "revolver";
	public static final String ROPE = "rope";
	public static final String POISON = "poison";
}
