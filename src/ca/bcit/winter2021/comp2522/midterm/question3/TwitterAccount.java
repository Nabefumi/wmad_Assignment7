package ca.bcit.winter2021.comp2522.midterm.question3;

public class TwitterAccount {
    //TODO: define proper instance variables if needed
    private String TweeterID;
    private int numberOfFollowers;
    private int numberOfFollowing;
    private int joinedYear;

    //TODO: define a constructors
    public TwitterAccount(String TweeterID, int numberOfFollowers, int numberOfFollowing, int joinedYear) {
        this.TweeterID = TweeterID;
        this.numberOfFollowers = numberOfFollowers;
        this.numberOfFollowing = numberOfFollowing;
        this.joinedYear = joinedYear;
    }

    //TODO: Add proper methods if needed
//    public String getTweeterID() {
//        return TweeterID;
//    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public int getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    @Override
    public String toString() {
        return "TwitterAccount{" +
                "TweeterID='" + TweeterID + '\'' +
                ", numberOfFollowers=" + numberOfFollowers +
                ", numberOfFollowing=" + numberOfFollowing +
                ", joinedYear=" + joinedYear +
                '}';
    }

}
