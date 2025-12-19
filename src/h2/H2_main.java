package h2;

public class H2_main {

    public static void main(String[] args) {

        Bus busA = new Bus();
        Bus busB = new Bus();

        Passenger anna = new Passenger("Anna", 2, true);
        Passenger ben = new Passenger("Ben", 1, true);
        Passenger clara = new Passenger("Clara", 3, true);

        busA.enterBus(anna);
        busA.enterBus(ben);
        busA.enterBus(clara);
        busA.transferPassengers(busB, new String[]{"Anna", "Clara"});

        System.out.println("Bus A:");
        for (Passenger p : busA.passengers) {
            System.out.println(p.name);
        }

        System.out.println("Bus B:");
        for (Passenger p : busB.passengers) {
            System.out.println(p.name);
        }
    }
}

