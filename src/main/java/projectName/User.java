package projectName;

public class User {

    private boolean isUpright;

    private int experienceRidingBikes;

    public User(int experienceRidingBikes_years) {
        this.experienceRidingBikes=experienceRidingBikes_years;
        this.isUpright=true;
    }

    public int getExperienceRidingBikes() {
        return experienceRidingBikes;
    }

    public void setExperienceRidingBikes(int experienceRidingBikes) {
        this.experienceRidingBikes = experienceRidingBikes;
    }

    public boolean isUpright() {
        return isUpright;
    }

    public void setUpright(boolean upright) {
        isUpright = upright;
    }
}
