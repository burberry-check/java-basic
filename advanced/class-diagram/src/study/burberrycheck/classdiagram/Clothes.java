package study.burberrycheck.classdiagram;

/**
 * 옷
 * */
public class Clothes {
    protected String name;
    protected String color;
    protected int size;
    protected String material;

    public String getName() {
        return name;
    }

    public Clothes(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
