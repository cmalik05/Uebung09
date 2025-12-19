package h1;

import java.util.ArrayList;

public class PrioListe {

    ArrayList<Patient> myList;

    public PrioListe() {
        myList = new ArrayList<>();
    }

   
    public void addPatient(Patient p) {
        if (myList.isEmpty()) {
            myList.add(p);
            return;
        }

        int index = 0;
        while (index < myList.size() && myList.get(index).prio < p.prio) {
            index++;
        }
        myList.add(index, p);
    }

    
    public Patient getNextPatient() {
        if (myList.isEmpty()) {
            return null;
        }
        return myList.remove(0);
    }

    
    public int getPosition(Patient p) {
        return myList.indexOf(p);
    }
}

