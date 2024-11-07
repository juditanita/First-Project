package enums;

 enum Planet {

    MERCURY("Mercury", 0.39),
    VENUS("Venus", 0.72);


    private final String name;
    private final double distanceFromSun;




    Planet(String name, double distanceFromSun){
        this.name = name;
        this.distanceFromSun = distanceFromSun;

    }

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
