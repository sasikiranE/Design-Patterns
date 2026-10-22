import structural.composite.File;
import structural.composite.Folder;


public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("rootDir");
        Folder images = new Folder("images");
        Folder videos = new Folder("videos");
        File rcFile = new File("bashrc", 10);
        File img1 = new File("car.jpeg", 100);
        File img2 = new File("dog.jpeg", 50);
        File vid1 = new File("ocean_waves.mp4", 1000);
        root.addItem(rcFile);
        root.addItem(images);
        root.addItem(videos);
        images.addItem(img1);
        images.addItem(img2);
        videos.addItem(vid1);

        root.print();
    }
}