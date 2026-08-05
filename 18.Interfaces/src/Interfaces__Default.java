interface Camera {

    void takePhoto();

    default void recordVideo() {
        System.out.println("Recording Video...");
    }
}

class samsungs implements Camera {

    public void takePhoto() {
        System.out.println("Samsung Photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording 4K Video");
    }
}

public class Interfaces__Default {

    public static void main(String[] args) {

        samsungs s = new samsungs();

        s.takePhoto();

        s.recordVideo();
    }
}