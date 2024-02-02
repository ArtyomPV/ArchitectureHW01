package ru.prusov.architecture.store3D.modelelements;

import java.util.Collection;

public class PoligonalModel {

    //region Constructor
    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }
    public PoligonalModel(Collection<Poligon> poligons) {
        this.poligons = poligons;
        }
    //endregion

    //region Public Properties
    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }
    //endregion

    //region private Fields
    private Collection<Poligon> poligons;
    private Collection<Texture> textures;
    //endregion

}
