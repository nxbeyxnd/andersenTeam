package ru.andersen.app.user_patterns.alexey.creational.singleton;
/* 
15.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.creational.singleton 
*/


public class CurrentStatus {
    private final static CurrentStatus INSTANCE = new CurrentStatus();
    private static String myStatus = "Happy";

    public static CurrentStatus getCurrentStatus(){
        return INSTANCE;
    }

    private CurrentStatus() {
    }

    public static CurrentStatus getInstance(){
        return INSTANCE;
    }

    public static String getMyStatus() {
        return myStatus;
    }

    public static void setMyStatus(String myStatus) {
        CurrentStatus.myStatus = myStatus;
    }
}
