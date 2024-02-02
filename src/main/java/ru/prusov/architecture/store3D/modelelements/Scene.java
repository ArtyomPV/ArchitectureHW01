package ru.prusov.architecture.store3D.modelelements;

import java.util.Collection;
import java.util.List;

public class Scene {
    public int id;
    public Collection<PoligonalModel> poligonalModels;
    public Collection<Flash> flashes;
    public Collection<Camera> cameras;

    public Scene(int id, List<PoligonalModel> poligonalModels, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if(poligonalModels.size() > 0) {
            this.poligonalModels = poligonalModels;
        }
        else {
            throw  new Exception("Должна быть хотя бы одна модель");
        }
        this.flashes=flashes;
        if(cameras.size() > 0) {
            this.cameras = cameras;
        }
        else {
            throw  new Exception("Должна быть хотя бы одна камера");
        }
    }

    public <T> T method1(T flash){
        return flash;
    }
    public <T, E> T method2(T flash, E camera){
        return flash;
    }
}
