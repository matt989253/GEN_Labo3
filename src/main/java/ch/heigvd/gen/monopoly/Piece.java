package ch.heigvd.gen.monopoly;

public class Piece {
    private String name;
    private Square location;

    public Piece(String name, Square location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Square getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return getName();
    }
}