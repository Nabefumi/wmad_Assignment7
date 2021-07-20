package ca.bcit.winter2021.comp2522.midterm.question2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class TestQuestion2 {
    public static void runAllTestScenariosForQuestion2(){
        //Note: Do not make changes to the following statement
        //Note: Do not make changes to the following statement
        TransitMap tm = new TransitMap();
        String chicago = "Chicago";
        String detroit = "Detroit";
        String newYork = "New York";
        String boston = "Boston";
        String philadelphia = "Philadelphia";
        //TODO: Create instances to represent the roads (cities, distances) of the sample transit map.
        Road road1 = new Road(chicago, detroit, 237.053);
        Road road2 = new Road(chicago, newYork, 710.849);
        Road road3 = new Road(chicago, philadelphia, 663.624);
        Road road4 = new Road(detroit, boston, 611.554);
        Road road5 = new Road(detroit, newYork, 480.506);
        Road road6 = new Road(detroit, philadelphia, 441.609);
        Road road7 = new Road(newYork, boston, 190.015);
        Road road8 = new Road(newYork, philadelphia, 80.592);
        Road road9 = new Road(boston, philadelphia, 270.545);
        //TODO: add anything else needed here (if needed)
        tm = new TransitMap();
        tm.addRoads(road1);
        tm.addRoads(road2);
        tm.addRoads(road3);
        tm.addRoads(road4);
        tm.addRoads(road5);
        tm.addRoads(road6);
        tm.addRoads(road7);
        tm.addRoads(road8);
        tm.addRoads(road9);
        //Note: Do not make changes to the following statements
        //Note: Do not make changes to the following statements
        testGetDistance(tm, "Boston");
        System.out.println("--------------------------------------");
        testGetBiggestDistance(tm);
        System.out.println("--------------------------------------");
        testSortTransitMap(tm);
        ArrayList<Double> bostonDistance = new ArrayList<>();
        bostonDistance.add(611.554);
        bostonDistance.add(190.015);
        bostonDistance.add(270.545);
        System.out.println();
        boolean result1 =  testBoston(bostonDistance, tm.getDistance(boston));
        System.out.println("Test Get Distance: " + result1);
        testIsSortTransitMap(tm);
        testIsGetBiggestDistance(tm);
    }
    private static void testGetDistance(TransitMap tm, String cityName){
        //TODO: Complete this test according to part 2 of the problem 2.
        ArrayList<Double> distances = tm.getDistance(cityName);
        System.out.println(distances);
    }
    private static void testGetBiggestDistance(TransitMap tm){
        //TODO: complete this test according to part 3 of the Problem 2.
        ArrayList<Road> roads = tm.getRoads();
        Road biggestDistance = TransitMap.getBiggestDistance(roads);
        System.out.println("The biggest distance: " + biggestDistance);
    }
    public static void testSortTransitMap(TransitMap tm){
        //TODO: Complete this test based on the part 4 of the problem 2.
//        ArrayList<Road> sorted = tm.getSortRoadBasedOnDistance();
//        for(Road road: sorted){
//            System.out.println(road);
//        }
        ArrayList<Road> roads = tm.getRoads();
        Collections.sort(roads);
        for(Road road : roads){
            System.out.println(road);
        }
    }
    private static boolean testBoston(ArrayList<Double> distanceOfBoston, ArrayList<Double> distances){
        if(distanceOfBoston.size() != distanceOfBoston.size()){
            return false;
        }
        else {
            Collections.sort(distanceOfBoston);
            Collections.sort(distances);
            return distanceOfBoston.equals(distances);
        }
    }
    public static void testIsSortTransitMap(TransitMap tm) {
        //TODO: Complete this test based on the part 4 of the problem 2.
        double[] distances = {237.053, 611.554, 441.609, 480.506, 710.849, 663.624, 80.592, 190.015, 270.545};
        Arrays.sort(distances);
        ArrayList<Road> roads = tm.getRoads();
        Collections.sort(roads);
        boolean flag = true;
        for (int i = 0; i < distances.length; i++) {
            if (distances[distances.length - i - 1] != roads.get(i).getDistance()) {
                System.out.println(distances);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("testSortTransitMap: true");
        } else {
            System.out.println("testSortTransitMap: false");
        }
    }
    public static void testIsGetBiggestDistance(TransitMap tm){
        double correctAnswer = 710.849;
        if (tm.getBiggestDistance(tm.getRoads()).getDistance() == correctAnswer){
            System.out.println("testGetBiggestDistance: Ture");
        }else {
            System.out.println("testGetBiggestDistance: false");
        }
    }
}