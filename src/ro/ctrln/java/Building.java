package ro.ctrln.java;

public class Building <T>{

    private T property;

    public T getProperty() {
        return property;
    }

    public void setProperty(T property) {
        this.property = property;
    }


    @Override
    public String toString() {
        return "Building{" +
                "property=" + property +
                '}';
    }
}
