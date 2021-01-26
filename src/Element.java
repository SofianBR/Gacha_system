import java.awt.*;

public enum Element {

    PYRO("Pyro"),
    HYDRO("Hydro"),
    ANEMO("Anemo"),
    DENDRO("Dendro"),
    CRYO("Cryo"),
    ELECTRO("Electro"),
    GEO("geo");

    private String element;
    private Colour elementType;

    Element(String element) {
        this.element = element;
        this.elementType = Colour.getElement(element);
    }

    public String getElement() { return this.element; }

    public Colour getElementType() { return this.elementType; }
}