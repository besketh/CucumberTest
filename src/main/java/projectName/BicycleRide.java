package projectName;

public class BicycleRide {
    private User user;
    private Bicycle bicycle;


    public BicycleRide(User user, Bicycle bicycle) {
        this.user = user;
        this.bicycle = bicycle;
        bicycle.rideBike(user);
    }

}
