package ca.bcit.winter2021.comp2522.midterm.question4;

import java.util.ArrayList;

public class ObjectPool {
    public Object allIsInUse;
    /*
        -Each ObjectPool has a size(capacity)which representshow many objects/instances can be added to the pool.
         */
    private int capacity;
    private ArrayList<DatabaseManager> objects;

    /*
    -If the size of the pool is N, then there could be 0 to N number of instances of DatabaseManager objects in the pool (ObjectPool).
    */
    public ObjectPool(int capacity) {
        this.capacity = capacity;
        objects = new ArrayList<>();
    }
    /*
    -When an instance of DatabaseManager is created it will be added to the pool and the property isInUse of DatabaseManager instance will be set to true.
    */
    public DatabaseManager addPool(DatabaseManager databaseManager) {
        if(objects.size() == 0) {
            objects.add(databaseManager);
            databaseManager.setIsInUse(true);
            return databaseManager;
        }
        else if(objects.size() == capacity) {
            for(DatabaseManager i : objects) {
                if(i.getIsInUse() == false){
                    i.setIsInUse(true);
                    return i;
                }
            }
            return null;
        } else {
            for(DatabaseManager instance : objects) {
                if(instance.getIsInUse() == false);
                instance.setIsInUse(true);
            }
        }
        objects.add(databaseManager);
        databaseManager.setIsInUse(true);
        return databaseManager;
    }
    public void allIsInUse() {
        for (DatabaseManager i : objects) {
            i.setIsInUse(true);
        }
    }
}