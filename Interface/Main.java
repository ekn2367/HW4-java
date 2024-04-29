package Interface;

public class Main {
    public static void main(String[] args) {

        Document document = new Document("Bu bir belgedir.");
        Image image = new Image("resim.jpg");


        document.print();
        image.print();
    }
}
