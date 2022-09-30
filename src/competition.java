

import java.util.ArrayList;

public class competition {
	private String name;
	ArrayList<ship> ships = new ArrayList<ship>();

	public competition(String name) {
		this.name = name;
	}

	public void start() {

		for (ship s : this.ships) {
			if (s != null) {
				s.race();
			}
		}

	}

	public void addShip(ship ship) {
		ships.add(ship);
	}

	public void printResult() {
		System.out.println("Wettkampf: " + this.name);
		
		for (ship s : this.ships ) {
			if (s != null) {
		System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime() + " Besitzer: " + s.getOwner().getFirstname() + " " + s.getOwner().getLastname() + " " + s.getOwner().getResidence());
			}
		}
	}
}
