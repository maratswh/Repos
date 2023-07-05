package education.milkeater;

public class Poop implements PrintDataProvider {
    private String smell;
    private int size;
    private boolean liquid;

    public Poop(String smell, int ssize, boolean liquid) {
        this.size = ssize;
        this.smell = smell;
        this.liquid = liquid;
    }

    public String getSmell() {
        return smell;
    }

    public int getSize() {
        return size;
    }

    public boolean isLiquid() {
        return liquid;
    }

    @Override
    public String getPrintData() {
        return size + " " + smell + " " + liquid;
    }
}
