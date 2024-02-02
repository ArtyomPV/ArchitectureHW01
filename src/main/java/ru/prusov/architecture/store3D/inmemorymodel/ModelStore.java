package ru.prusov.architecture.store3D.inmemorymodel;

import ru.prusov.architecture.store3D.modelelements.Camera;
import ru.prusov.architecture.store3D.modelelements.Flash;
import ru.prusov.architecture.store3D.modelelements.PoligonalModel;
import ru.prusov.architecture.store3D.modelelements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements ModelChanger{

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<ModelChangeObserver> changeObserver;

    public ModelStore(List<ModelChangeObserver>
                              changeObserver)
            throws Exception {
        this.changeObserver = changeObserver;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }


    public Scene GetScene(int id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }

        }
        return null;
    }


    @Override
    public void notifyChange(ModelChanger sender) {

    }
}

