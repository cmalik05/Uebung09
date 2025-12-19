package h2;

import java.util.ArrayList;

public class Bus {

	ArrayList<Passenger> passengers;

	public Bus() {
		passengers = new ArrayList<>();
	}

	public void enterBus(Passenger p) {
		passengers.add(p);
	}

	private void exitBus() {
		for (int i = passengers.size() - 1; i >= 0; i--) {
			Passenger p = passengers.get(i);
			if (p.visited == p.planned) {
				passengers.remove(i);
			}
		}
	}

	public void nextStop(Passenger[] boarding) {

		for (Passenger p : passengers) {
			p.visited++;
		}

		exitBus();

		for (Passenger p : boarding) {
			passengers.add(p);
		}
	}

	public void nextStop() {

		for (Passenger p : passengers) {
			p.visited++;
		}

		exitBus();
	}

	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList<Passenger> result = new ArrayList<>();

		for (int i = passengers.size() - 1; i >= 0; i--) {
			Passenger p = passengers.get(i);
			if (!p.ticket) {
				result.add(0, p);
				passengers.remove(i);
			}
		}
		return result;
	}

	public void transferPassengers(Bus otherBus, String[] passengerNames) {

		for (String name : passengerNames) {
			for (int i = 0; i < passengers.size(); i++) {
				Passenger p = passengers.get(i);
				if (p.name.equals(name)) {
					passengers.remove(i);
					otherBus.passengers.add(p);
					break;
				}
			}
		}
	}
}
