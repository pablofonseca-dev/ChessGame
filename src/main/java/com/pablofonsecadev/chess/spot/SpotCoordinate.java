package com.pablofonsecadev.chess.spot;

public class SpotCoordinate {
    private char file;
    private int rank;

    public SpotCoordinate(char file, int rank){
        this.file = file;
        this.rank = rank;
    }

    public char getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }

    public void setFile(char file) {
        this.file = file;
    }

    public void setRank(byte rank) {
        this.rank = rank;
    }

    public String getLocation(){
        return "" + this.file + this.rank;
    }
}
