public enum Colour {

    YELLOW("\033[0;33m"),
    PURPLE("\033[0;35m"),
    BLUE("\033[0;34m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    WHITE("\033[0;37m"),
    RESET("\033[0m");

    private String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    public String getColour() { return this.colour; }

    public static String reset() {
        return RESET.colour;
    }

    public static Colour getStars(int stars) {
        switch(stars) {
            case 5:
                return Colour.YELLOW;
            case 4:
                return Colour.PURPLE;
            case 3:
                return Colour.BLUE;
            case 2:
                return Colour.GREEN;
            case 1:
                return Colour.WHITE;
            default:
                return null;
        }
    }

    public static Colour getElement(String element) {
        switch(element) {
            case "Pyro":
                return Colour.RED;
            case "Hydro":
                return Colour.BLUE;
            case "Anemo":
            case "Dendro":
                return Colour.GREEN;
            case "Cryo":
                return Colour.WHITE;
            case "Electro":
                return Colour.PURPLE;
            case "Geo":
                return Colour.YELLOW;
            default:
                return null;
        }
    }
}
