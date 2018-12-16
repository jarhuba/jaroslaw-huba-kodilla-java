package com.kodilla.rps;

public enum Gestures {

    PAPIER (1, "papier"), KAMIEN (2, "kamień"), NOZYCE (3, "nożyce");

    private final int gestureNumber;
    private final String gestureName;

    Gestures(int gestureNumber, String gestureName) {
        this.gestureNumber = gestureNumber;
        this.gestureName = gestureName;
    }

    static String getGestureStringName(int gestureNumber) {
        switch (gestureNumber) {
            case 1:
                return PAPIER.gestureName;
            case 2:
                return KAMIEN.gestureName;
            case 3:
                return NOZYCE.gestureName;
        }
        return PAPIER.gestureName;
    }

    public int getGestureNumber() {
        return gestureNumber;
    }

    public String getGestureName() {
        return gestureName;
    }
}
