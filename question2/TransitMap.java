package ca.bcit.winter2021.comp2522.midterm.question2;
import java.util.ArrayList;
import java.util.Collections;
public class TransitMap {
    //TODO: define proper instance variables if needed
    private ArrayList<Road> roads;
    //    private  int distance;
    //TODO: define a constructor(s)
    public TransitMap() {
        this.roads = new ArrayList<>();
    }
    //TODO: Add proper methods if needed
    public ArrayList<Road> addRoads(Road road){
        roads.add(road);
        return roads;
    }
    public ArrayList<Road> getRoads() {
        return roads;
    }
    public ArrayList<Double> getDistance(String cityName) {
//        System.out.println(roads);
        ArrayList<Double> distances = new ArrayList<>();
        for(Road road : roads){
            if(road.getCityName1().equals(cityName) || road.getCityName2().equals(cityName)){
                distances.add(road.getDistance());
            }
        }
        return distances;
    }
    //    public static Road getBiggestDistance(ArrayList<Road> roads){
//        double maxDistance = 0;
//        Road longestDistance = null;
//
//        for(Road road: roads){
//            if(road.getDistance() > maxDistance){
//                maxDistance = road.getDistance();
//                longestDistance = road;
//            }
//        }
//        return longestDistance;
//    }
    public ArrayList<Road> getSortRoadBasedOnDistance(){
        ArrayList<Road> sortedRoad = new ArrayList<>();
        ArrayList<Road> copyRoads = (ArrayList<Road>)(roads.clone());
        for(Road road : roads){
            double minValue = Integer.MIN_VALUE;
            Road currentRoad= null;
            for(Road road2: copyRoads){
                if(road2.getDistance() >= minValue){
                    minValue = road2.getDistance();
                    currentRoad = road2;
                }
            }
            copyRoads.remove(currentRoad);
            sortedRoad.add(currentRoad);
        }
        return sortedRoad;
    }
    public static Road getBiggestDistance(ArrayList<Road> roads){
        Collections.sort(roads);
        return roads.get(0);
    }
}