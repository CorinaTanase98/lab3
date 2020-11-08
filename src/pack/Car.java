package pack;

public class Car {

    private String marca;
    private String model;
    private int an_fabricatie;

    public Car(String marca, String model, int an_fabricatie) {
        this.marca = marca;
        this.model = model;
        this.an_fabricatie = an_fabricatie;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getAn_fabricatie() {
        return an_fabricatie;
    }

}
