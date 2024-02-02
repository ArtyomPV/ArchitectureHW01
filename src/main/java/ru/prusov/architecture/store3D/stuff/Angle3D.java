package ru.prusov.architecture.store3D.stuff;

public class Angle3D {
    //region Public Properties
    public double getAngleX() {
        return angleX;
    }

    public void setAngleX(double angleX) {
        this.angleX = angleX;
    }

    public double getAngleY() {
        return angleY;
    }

    public void setAngleY(double angleY) {
        this.angleY = angleY;
    }

    public double getAngleZ() {
        return angleZ;
    }

    public void setAngleZ(double angleZ) {
        this.angleZ = angleZ;
    }
    //endregion

    //region Constructors
    public Angle3D(double angleX, double angleY, double angleZ) {
        this.angleX = angleX;
        this.angleY = angleY;
        this.angleZ = angleZ;
    }
    public Angle3D() {
        this.angleX = 0;
        this.angleY = 0;
        this.angleZ = 0;
    }
    //endregion

    //region Private Fields
    private double angleX, angleY, angleZ;
    //endregion


}
