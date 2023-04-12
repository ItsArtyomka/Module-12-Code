package Code.Module.Lists.PracticalExample;

public class Car {
    private String name;
    private String brand;
    private boolean onSale;

    public Car(String brand, String name, boolean onSale) {
        this.brand = brand;
        this.name = name;
        this.onSale = onSale;
    }

    // ---Name---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ---Brand---
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // ---Sale---
    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", onSale=" + onSale +
                '}';
    }

}
