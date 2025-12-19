package h1;

public class H1_Main {

    public static void main(String[] args) {

        PrioListe liste = new PrioListe();

        Patient A = new Patient("A", 1);
        Patient B = new Patient("B", 10);
        Patient C = new Patient("C", 5);
        Patient D = new Patient("D", 7);

        liste.addPatient(A);
        liste.addPatient(B);
        liste.addPatient(C);
        liste.addPatient(D);

       
        System.out.println(liste.getNextPatient().name); 
        System.out.println(liste.getNextPatient().name); 
        System.out.println(liste.getNextPatient().name);         
        System.out.println(liste.getNextPatient().name); 
       
    }
}

