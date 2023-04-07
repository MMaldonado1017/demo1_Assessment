package Assessment;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(new Resolution(1920, 1053), "M9X5T7", "Pelle");
        Case pcCase = new Case("H890", "NPOL", "650W",  new Dimensions(10,15,12));
        Motherboard motherboard = new Motherboard("Z390", "Pelle", 4, 2, "UEFI");
        PC pc = new PC(pcCase, motherboard, monitor);

        pc.description();
        pc.powerUp();
    }


    }

