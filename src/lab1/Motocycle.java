package lab1;

public class Motocycle {
    private class Model{
        String modelName = null;
        double price = Double.NaN;
        Model prev = null;
        Model next = null;
    }
    private int size = 0;
    private Model head;
    private long lastModified;


}
