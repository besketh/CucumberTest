package projectName;

public class Bicycle {
    private final int experienceNeededToRide_y = 1;
    public Bicycle() {
    }

    public void rideBike(User user) {
        if (user.getExperienceRidingBikes() < this.experienceNeededToRide_y) {
            user.setUpright(false);
        }
    }
}
