public enum WeaponType {

    CLAYMORE("Claymore"),
    SWORD("Sword"),
    POLEARM("Polearm"),
    CATALYST("Catalyst"),
    BOWS("Bows");

    private String type;

    WeaponType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
