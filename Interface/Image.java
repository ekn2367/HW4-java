package Interface;

public class Image implements Printable{
    private String filename;

    public Image(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void print() {
        System.out.println("Bu bir resimdir.");
    }
}
