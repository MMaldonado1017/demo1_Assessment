package Assessment;

public class PC {
    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;
    public PC( Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo(){
        monitor.drawPixel(8, 15, "Purple");

    }

    public void description() {
        String message = "Welcome to worst buy below is the description of the pc on sale today\n"
                + "Case: " + pcCase.toString() + "\n"
                + "Motherboard: " + motherboard.toString() + "\n"
                + "Monitor: " + monitor.toString();
        System.out.println(message);
    }

    public void powerUp() {
        pcCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram();
    }
}
