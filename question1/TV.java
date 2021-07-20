package ca.bcit.winter2021.comp2522.midterm.question1;

public class TV {
    //TODO: define 4 instance properties for the class TV
    private boolean turnOnOFFTV;
    private boolean muteUnMuteTV;
    private int changeVolume;
    public int changeChannel;
    //TODO: define a constructor for the class TV
    public TV(boolean turnOnOFFTV, boolean muteUnMuteTV, int changeVolume, int changeChannel) {
        this.turnOnOFFTV = turnOnOFFTV;
        this.muteUnMuteTV = muteUnMuteTV;
        this.changeVolume = changeVolume;
        this.changeChannel = changeChannel;
    }
    //TODO: add any instance, static method as needed
    // private boolean tvOn; //
    public boolean isTVON() {
        return turnOnOFFTV;
    }
    //    public void setisTVON(boolean tvOn) {
//        this.tvOn = tvOn;
//    }
    //=====
// private boolean tvMute; //
    public boolean isMute() {
        return muteUnMuteTV;
    }
    //    public void setIsMute(boolean tvMute) {
//        this.tvMute = tvMute;
//    }
    //=====
//private int volume;
    public int getVolume() {
        return changeVolume;
    }
    //    public int setVolume(int volume) {
//        this.volume = volume;
//        return volume;
//    }
    //=====
//public int channel;
    public int getChannel() {
        return changeChannel;
    }
    //    public void setChangeChannel(int channel) {
//        this.channel = channel;
//=====
    public void setChangeChannel(int changeChannel) {
        this.changeChannel = changeChannel;
    }
    public void setChangeVolume(int changeVolume) {
        this.changeVolume = changeVolume;
    }
    public void setMuteUnMuteTV(boolean muteUnMuteTV) {
        this.muteUnMuteTV = muteUnMuteTV;
    }
    public void setTurnOnOFFTV(boolean turnOnOFFTV) {
        this.turnOnOFFTV = turnOnOFFTV;
    }
    @Override
    public String toString() {
        return "TV{" +
                "tvOn=" + turnOnOFFTV +
                ", tvMute=" + muteUnMuteTV +
                ", volume=" + changeVolume +
                ", channel=" + changeChannel +
                '}';
    }
}
