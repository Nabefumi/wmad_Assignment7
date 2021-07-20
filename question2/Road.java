package ca.bcit.winter2021.comp2522.midterm.question2;
public class Road implements Comparable<Road>{
    //TODO: define proper instance variables if needed
    private String cityName1;
    private String cityName2;
    private double distance;
    //TODO: define a constructor(s)
    public Road(String cityName1, String cityName2, double distance){
        this.cityName1 = cityName1;
        this.cityName2 = cityName2;
        this.distance = distance;
    }
    //TODO: Add proper methods if needed
//    public String getCityName() {return cityName;}
    public String getCityName1() {
        return cityName1;
    }
    public String getCityName2() {
        return cityName2;
    }
    public double getDistance() {
        return distance;
    }
    public String toString() {
        return "Road {" + "city1='" + cityName1 + '\'' +", city2='" + cityName2 + '\'' +", distance=" + distance +'}';
    }
    @Override
    public int compareTo(Road road) {
        if(this.distance == road.getDistance()){
            return 0;
        }else if(this.distance < road.getDistance()){
            return 1;
        }
        return -1;
    }
}