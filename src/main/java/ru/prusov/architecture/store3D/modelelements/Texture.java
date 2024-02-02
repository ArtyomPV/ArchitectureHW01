package ru.prusov.architecture.store3D.modelelements;

public class Texture {
    private int id;
    private final String Name;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Texture(String name) {
        Name = name;
    }
}
