package ca.bcit.winter2021.comp2522.midterm.question3;

import java.util.Comparator;

//TODO: Complete definition of this class
public class FollowingSorter implements Comparator<TwitterAccount> {

    @Override
    public int compare(TwitterAccount t1, TwitterAccount t2) {
        if(t1.getNumberOfFollowing() == t2.getNumberOfFollowers()){
            return 0;
        } else if (t1.getNumberOfFollowing() < t2.getNumberOfFollowers()){
            return -1;
        } else {
            return 1;
        }
    }
}

