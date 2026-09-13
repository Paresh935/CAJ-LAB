package practice;
class Box {
    double width;
    double height;
    double depth;

    // Instance method
    double getVolume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

