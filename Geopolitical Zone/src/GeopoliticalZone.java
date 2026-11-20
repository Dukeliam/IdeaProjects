public enum GeopoliticalZone {
    NORTH_CENTRAL("North Central"),
    NORTH_EAST("North East"),
    NORTH_WEST("North West"),
    SOUTH_EAST("South East"),
    SOUTH_SOUTH("South South"),
    SOUTH_WEST("South West");

    private String displayName;

    GeopoliticalZone(String name){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
