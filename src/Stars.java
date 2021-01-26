public enum Stars {

    THREE(3),
    FOUR(4),
    FIVE(5);

    public int numStars;
    private final float[] probabilities = {0.006f, 0.051f, 0.943f};
    private final int OFFSET = 3;
    private Colour rarity;

    Stars(int numStars) {
        this.numStars = numStars;
        this.rarity = Colour.getStars(numStars);
    }

    public int getNumStars() {
        return this.numStars;
    }

    public float getProbablity() {
        return probabilities[numStars - OFFSET];
    }

    public Colour getRarity() { return this.rarity; }
}
