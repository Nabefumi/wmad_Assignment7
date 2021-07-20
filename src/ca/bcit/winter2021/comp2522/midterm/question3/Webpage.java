package ca.bcit.winter2021.comp2522.midterm.question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Webpage {

    //TODO: define proper instance variables if needed
    private ArrayList<TwitterAccount> twitterAccount;

    //TODO: define a constructors
    public Webpage(ArrayList<TwitterAccount> twitterAccounts){
        this.twitterAccount = twitterAccounts;
    }

    //TODO: Add proper methods if needed

    //TODO: fix the compile error below
    //The following code does not work because the sort method has not been defined yet.
    //Please fix the issue without changing the methods below

    /**
     *
     */
    public void sort(Comparator<TwitterAccount> twitterlist){
        Collections.sort(this.twitterAccount, twitterlist);
    }

    public void sortBasedOnNumberOfFollowers(){
        this.sort(new FollowerSorter());
    }

    public void sortBasedOnNumberOfFollowing(){
        this.sort(new FollowingSorter());

    }

    //TODO: Changes allowed to this method
    public void filterBasedOnYearJoinTwitter(int joinedYear){
        //TODO: Complete implementation of this method to return all twitter accounts which have joined on or before the given input year
        for(TwitterAccount twitterAccount: this.twitterAccount){
            //2015 < ○○○○
            if(twitterAccount.getJoinedYear() <= joinedYear){
                System.out.println(twitterAccount);
            }
        }

    }
}
