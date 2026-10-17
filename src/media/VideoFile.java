package media;

public class VideoFile {
    private final String name;
    private final String extension;
    private int[] data;

    public VideoFile(String name){
        this.name =name;
        int dotIndex = name.lastIndexOf('.');
        this.extension = (dotIndex > 0) ? name.substring(dotIndex + 1) : "";
        this.data = new int[]{1,2,3,4,5};
    }
    public String getName() {return name;}
    public String getExtension() {return extension;}
    public int[] getData() {return data;}
    public void setData(int[] data) {this.data = data;}
}

