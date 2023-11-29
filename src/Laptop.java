public class Laptop {
    private String brand;
    private String model;
    private String OS;
    private String processor;
    private String graphics;
    private String color;
    private double displayInch;
    private int memory;
    private int storage;
    private int camera;
    private double price;
    private String link;

    public Laptop(
            String brand,
            String model,
            String OS,
            String processor,
            String graphics,
            String color,
            double displayInch,
            int memory,
            int storage,
            int camera,
            double price,
            String link
    ) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.processor = processor;
        this.graphics = graphics;
        this.color = color;
        this.displayInch = displayInch;
        this.memory = memory;
        this.storage = storage;
        this.camera = camera;
        this.price = price;
        this.link = link;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getOS() {
        return OS;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setDisplayInch(double displayInch) {
        this.displayInch = displayInch;
    }

    public double getDisplayInch() {
        return displayInch;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getCamera() {
        return camera;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public String laptopDetails() {
        String specs = this.brand + " / " +
                this.model + " / " +
                this.displayInch + "' / " +
                this.processor + " / " +
                this.graphics + " / " +
                this.color + " / " +
                this.memory + "Gb RAM / " +
                this.storage + "Gb / " +
                this.OS + " \n " +
                this.price + " руб \n" +
                this.link;
        return specs;
    }

}
