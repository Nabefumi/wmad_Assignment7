package ca.bcit.winter2021.comp2522.midterm.question3;

import java.util.ArrayList;

public class TestQuestion3 {
    public static void runAllTestScenariosForQuestion3(){

        /**
         * We have webPage,
         *
         * Properties -> ArrayList<TwitterAccount> twitterAccount
         * method
         * getTwitterAccount
         * addTwitterAccount
         *
         * TwitterAccount,
         * Properties -> String twitterID, int following, int followers, int joyedYear
         * methods:
         * getFollowing
         * getFollowers
         * getJoyedYear
         *
         * FollowingSorter,
         *      compare()
         *
         * FollowerSorter,
         *      compare()
         *
         * JoiningYear
         *      compare()
         *
         */

        Webpage webpage = null;;
        //TODO: complete creating webpage instance

        TwitterAccount barackObamaAccount = null;
        //TODO: create an instance for @barackObama
        barackObamaAccount = new TwitterAccount("BarackObama", 129600000, 594500, 2007);

        TwitterAccount joeBidenAccount = null;
        //TODO: create an instance for @JoeBiden
        joeBidenAccount = new TwitterAccount("JoeBiden", 28800000, 47, 2007);

        TwitterAccount elonmuskAccount = null;
        //TODO: create an instance for @elonmusk
        elonmuskAccount = new TwitterAccount("elonmusk", 47900000, 103, 2009);

        TwitterAccount billgatesAccount = null;
        //TODO: create an instance for @BillGates
        billgatesAccount = new TwitterAccount("BillGates", 53800000, 274, 2009);

        TwitterAccount ladygagaAccount = null;
        //TODO: create an instance for @ladygaga
        ladygagaAccount = new TwitterAccount("lallygag", 83900000, 120400, 2008);

        TwitterAccount rihannaAccount = null;
        //TODO: create an instance for @rihanna
        rihannaAccount = new TwitterAccount("rihanna", 102100000, 1015, 2011);

        TwitterAccount michelleObamaAccount = null;
        //TODO: create an instance for @Michelle Obama
        michelleObamaAccount = new TwitterAccount("MichelleObama", 20300000, 15, 2011);

        //TODO: add anything else needed here (if needed)


        ArrayList<TwitterAccount> twitterAccounts = new ArrayList<>();
        twitterAccounts.add(barackObamaAccount);
        twitterAccounts.add(joeBidenAccount);
        twitterAccounts.add(elonmuskAccount);
        twitterAccounts.add(billgatesAccount);
        twitterAccounts.add(ladygagaAccount);
        twitterAccounts.add(rihannaAccount);
        twitterAccounts.add(michelleObamaAccount);

        webpage = new Webpage(twitterAccounts);

        //Note: Do not make changes to the following statements
        //Note: Do not make changes to the following statements

        System.out.println("===Sorting the list only based on the number of followings===" );
        webpage.sortBasedOnNumberOfFollowers();

        System.out.println("===Sorting the list only based on the number of followers===");
        webpage.sortBasedOnNumberOfFollowing();

        System.out.println("===Filtering the list based on the year of joining twitter before 2015===" );
        webpage.filterBasedOnYearJoinTwitter(2015);

    }
}
