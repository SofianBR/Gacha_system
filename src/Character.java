public class Character implements Summonable {

    private String name;
    private Element element_type;
    private Stars stars;

    public Character(String name, Element element_type, Stars stars) {
        this.name = name;
        this.element_type = element_type;
        this.stars = stars;
    }

    public String getName() {
        return this.name;
    }

    public String getElement() {
        return this.element_type.getElement();
    }

    public int getNumStars() {
        return this.stars.getNumStars();
    }

    @Override
    public String toString() {
        int numStars = getNumStars();
        Colour stars = this.stars.getRarity();
        Colour element = this.element_type.getElementType();
        return new StringBuilder(element.getColour())
                .append(getName())
                .append(" ")
                .append(stars.getColour())
                .append(numStars)
                .append("*")
                .append(Colour.reset())
                .toString();
    }
}
