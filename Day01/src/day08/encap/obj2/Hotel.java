package day08.encap.obj2;

public class Hotel {
	
	private Chef chef;
	
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}
}
