package ca.bcit.winter2021.comp2522.midterm.question4;

public class TestQuestion4 {
    public static void runAllTestScenariosForQuestion4(){

        DatabaseManager dbManager = null;
        //TODO: Create a DatabaseManager's Object Pool with size N = 3
        //dbManager = //TODO: complete it here
        dbManager = DatabaseManager.getInstance(3);
        System.out.println(dbManager);

        //TODO: Create 3 instances of DatabaseManagers
        DatabaseManager dbManager1 = DatabaseManager.getInstance(3);
        DatabaseManager dbManager2 = DatabaseManager.getInstance(3);
        DatabaseManager dbManager3 = DatabaseManager.getInstance(3);

        System.out.println(dbManager1);
        System.out.println(dbManager2);
        System.out.println(dbManager3);


        //TODO: create another instance of DatabaseManager.
        //Note: Remember at this point the ObjectPool is full and therefore either an existing object should be returned or
        //no object should be returned.

        DatabaseManager dbManager4 = DatabaseManager.getInstance(3);

        System.out.println(dbManager4);

        //TODO: set the isInUse property of all objects in object pool to false;

        DatabaseManager.allOfIsInUse();

        //TODO: create another instance of DatabaseManager:
        //Note: At this point there should be 3 instances of DatabaseManager in the pool and therefore, the getInstance method
        //should randonmly picked one and return it and set its isInUse to yes.

        DatabaseManager dbManager5 = DatabaseManager.getInstance(3);

        System.out.println(dbManager5);
    }
}
