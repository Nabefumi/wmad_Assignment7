package ca.bcit.winter2021.comp2522.midterm.question4;

//TODO: Change this class to support an Object Pool for this class. Checkout the Problem4's description.
public final class DatabaseManager {

    private static DatabaseManager INSTANCE;
    private boolean isInUse;
    private static ObjectPool objectPool;
    /*
    For instance, an ObjectPool for DatabaseManager class, contains zero or more objects (instance) of the class DatabaseManager.
     */

    public static DatabaseManager getInstance(int capacity) {
        if(objectPool == null) {
            objectPool = new ObjectPool(capacity);
        }

        DatabaseManager databaseManager = new DatabaseManager();
        INSTANCE = objectPool.addPool(databaseManager);
        return INSTANCE;
    }

    public void setIsInUse(boolean isInUse) {
        this.isInUse = isInUse;
    }

    public void getIsInUse(boolean isInUse) {
        this.isInUse = isInUse;
    }

    private DatabaseManager() {
        isInUse = true;
    }

    public static DatabaseManager getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DatabaseManager();
        }
        return INSTANCE;
    }

    public boolean getIsInUse() {
        return this.isInUse;
    }

    public static void allOfIsInUse() {
        objectPool.allIsInUse();
    }
}
