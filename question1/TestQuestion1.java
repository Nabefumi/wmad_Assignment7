package ca.bcit.winter2021.comp2522.midterm.question1;

public class TestQuestion1 {
    public static void runAllTestScenariosForQuestion1(){
        /**
         * TV:
         * properties->
         *     private boolean turnOnOFFTV;
         *     private boolean muteUnMuteTV;
         *     private int changeVolume;
         *     public int changeChannel;
         * methods ->
         *
         * Takafumi
         *     public int getVolume(){}
         *     public boolean isMute(){}
         *     public boolean isTVON(){}
         *     public int getChannel(){}
         *done
         *     public void setChangeChannel(int changeChannel) {}
         *     public void setChangeVolume(int changeVolume) {}
         *     public void setMuteUnMuteTV(boolean muteUnMuteTV) {}
         *     public void setTurnOnOFFTV(boolean turnOnOFFTV) {}
         *
         *     Phoebe
         *     public String toString(){} // to follow the instruction to print with "System.out.println(tv1);"
         * BlackRemote(implements Remote):
         * properties->null
         * methods->
         *     generally, these method do the followings
         *     1) get the current value of a TV object
         *     2) change the value
         *     3) set the changed value as a new value of the TV object
         *     4) return he changed value
         *     Tatsuma, Kosei,
         *     public boolean turnOnOFFTV(TV tv) {}
         *     public boolean muteUnMuteTV(TV tv) {}
         *     public int changeVolume(int amount, TV tv) {}
         *     public int changeChannel(int amount, TV tv) {}
         *
         *
         * WhiteRemote(implements Remote):
         *     exactly same as BlackRemote
         */
        TV tv1 = null;
        //TODO: create tv1 which is an instance of TV. The tv1 instance should be initialized with volume: 10, channel: 100, unmute and off.
        tv1 = new TV(true, true, 10,100 );
        WhiteRemote whiteRemote = null;
        BlackRemote blackRemote = null;
        //TODO: create an instance for the whiteRemote and blackRemote
        whiteRemote = new WhiteRemote();
        blackRemote = new BlackRemote();
        //TODO: use the whiteRemote instance to turn on the tv1
        whiteRemote.turnOnOFFTV(tv1);
        //TODO: use the whiteRemote object to change the tv1's volume to 13
        whiteRemote.changeVolume(+1,tv1);
        whiteRemote.changeVolume(+1,tv1);
        whiteRemote.changeVolume(+1,tv1);
        //TODO: use the whiteRemote object to change the tv1's volume back to 11
        whiteRemote.changeVolume(-1,tv1);
        whiteRemote.changeVolume(-1,tv1);
        //TODO: use the blackRemote object to do change the tv1's current channle to 103
        blackRemote.changeChannel(+1,tv1);
        blackRemote.changeChannel(+1,tv1);
        blackRemote.changeChannel(+1,tv1);
        //TODO: use the blackRemote instance to mute the tv1
        blackRemote.muteUnMuteTV(tv1);
        //TODO: use the whiteRemote instance to unmute the tv1
        blackRemote.muteUnMuteTV(tv1);
        //TODO: Make sure the following print statement, prints out the information of the TV (volume, channle, mute or unmute, on or off)
        //Note: Do not make changes to this print statement
        //Note: Do not make changes to this print statement
        System.out.println(tv1);
        //TODO: add anything else needed here (if needed)
        //Note: Do not make changes to the following statements
        //Note: Do not make changes to the following statements
        System.out.println("TV Volume Test: "+testTVVolume(tv1));
        System.out.println("TV Mute Test: "+isTVMute(tv1));
        System.out.println("TV Off Test: "+isTVOff(tv1));
        System.out.println("TV Channel Test: "+testTVChannel(tv1));
    }
    //TODO: There are 4 compile errors here. Do not make changes here. Make changes in the right place to fix these issues.
    //The following code does not compile as there are some compile errors. Please fix them without making any change in the code below.
    //Note: Do not change this method
    //Note: Do not change this method
    private static boolean testTVVolume(TV tv){
        if(tv.getVolume()==13){
            return true;
        } else {
            return false;
        }
    }
    //Do not change this method
    //Do not change this method
    private static boolean isTVMute(TV tv){
        return tv.isMute();
    }
    //Do not change this method
    //Do not change this method
    private static boolean isTVOff(TV tv){
        return !(tv.isTVON());
    }
    //Do not change this method
    //Do not change this method
    private static boolean testTVChannel(TV tv){
        if (tv.getChannel()==103){
            return true;
        } else {
            return false;
        }
    }
}
