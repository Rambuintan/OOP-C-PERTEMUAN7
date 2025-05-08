package pertemuan701;

public class MainProject {
    public static void main(String[] args) {
        Salam s = new Salam();

        // Memanggil method tanpa parameter
        s.tulisSalam();

        // Memanggil method dengan 1 parameter String
        s.tulisSalam("Intan");

        // Memanggil method dengan 1 parameter int
        s.tulisSalam(5);

        // Memanggil method dengan 2 parameter (String dan int)
        s.tulisSalam("Rambu", 21);

        // Memanggil method dengan 2 parameter (int dan boolean)
        s.tulisSalam(99, true);
        s.tulisSalam(99, false);
    }
}

