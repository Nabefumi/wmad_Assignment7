package ca.bcit.winter2021.comp2522.midterm.question1;

///TODO: Complete the class definition
public class BlackRemote implements Remote{
    //TODO: define proper instance variables if needed
    //TODO: define a constructor(s)
    @Override
    public boolean turnOnOFFTV(TV tv) {
        boolean isOn = tv.isTVON();
        if (isOn) {
            tv.setTurnOnOFFTV(false);
            return false;
        } else {
            tv.setTurnOnOFFTV(true);
            return true;
        }
    }
    @Override
    public boolean muteUnMuteTV(TV tv) {
        boolean isMute = tv.isMute();
        if (isMute) {
            tv.setMuteUnMuteTV(false);
            return false;
        } else {
            tv.setMuteUnMuteTV(true);
            return true;
        }
    }
    @Override
    public int changeVolume(int amount, TV tv) {
        int currentVolume = tv.getVolume();
        if (amount ==1) {
            tv.setChangeVolume(currentVolume + 1);
            return currentVolume + amount;
        } else if (amount ==-1) {
            tv.setChangeVolume(currentVolume - 1);
            return currentVolume - amount;
        }
        return currentVolume;
    }
    @Override
    public int changeChannel(int amount, TV tv) {
        int currentChannel = tv.getChannel();
        if (amount == 1) {
            tv.setChangeChannel(currentChannel + 1);
            return currentChannel + 1;
        } else if (amount == -1) {
            tv.setChangeChannel(currentChannel - 1);
            return currentChannel - 1;
        }
        return currentChannel;
    }
    //TODO: Add proper methods if needed
}
