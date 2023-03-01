package com.pablofonsecadev.chess.spot;

public class Spot {
    private SpotColor color;
    private SpotCoordinate coordinate;

    private boolean isAvailable;

    public Spot(SpotColor color, SpotCoordinate coordinate){
        this.color = color;
        this.coordinate = coordinate;
    }

    public SpotColor getColor(){
        return this.color;
    }

    public SpotCoordinate getCoordinate() {
        return coordinate;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void setCoordinate(SpotCoordinate coordinate) {
        this.coordinate = coordinate;
    }
}
