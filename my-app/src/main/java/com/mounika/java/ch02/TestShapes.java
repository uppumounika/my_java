package com.mounika.java.ch02;

/**
 * @author pavan
 */
public class TestShapes {

    public static void main(String[] args) {
        PlayerPiece playerPiece=new PlayerPiece();
        TilePiece tilePiece=new TilePiece();
        doShapes(playerPiece);
        doShapes(tilePiece);
    }
    public static void doShapes(GameShape shape) {
        shape.displayShape();
    }
}
