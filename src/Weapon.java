public class Weapon implements Summonable {

    private String name;
    private WeaponType weaponType;
    private Stars stars;

    public Weapon(String name, WeaponType weaponType, Stars stars) {
        this.name = name;
        this.weaponType = weaponType;
        this.stars = stars;
    }

    public String getName() {
        return this.name;
    }

    public String getWeaponType() { return this.weaponType.getType(); }

    public int getNumStars() {
        return this.stars.getNumStars();
    }

    @Override
    public String toString() {
        int numStars = getNumStars();
        Colour stars = Colour.getStars(numStars);
        return new StringBuilder(stars.getColour())
                .append(getName())
                .append(" ")
                .append(numStars)
                .append("*")
                .append(Colour.reset())
                .toString();
    }
}
