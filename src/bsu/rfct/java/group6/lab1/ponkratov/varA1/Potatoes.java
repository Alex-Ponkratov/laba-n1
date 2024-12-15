package bsu.rfct.java.group6.lab1.ponkratov.varA1;

public class Potatoes extends Food {
    private String type;

    public Potatoes(String type) {
        super("Картошка");
        this.type = type;
    }

    @Override
    public void consume() {
        System.out.println(this + " съедено.");
    }

    @Override
    public String toString() {
        return super.toString() + " типа '" + type.toUpperCase() + "'";
    }

    public String getType() {
        return type;
    }
}
