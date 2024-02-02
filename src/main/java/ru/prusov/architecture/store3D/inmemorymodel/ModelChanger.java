package ru.prusov.architecture.store3D.inmemorymodel;

public interface ModelChanger {
    public void notifyChange(ModelChanger sender);
}
