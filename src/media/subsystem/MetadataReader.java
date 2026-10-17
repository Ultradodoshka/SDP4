package media.subsystem;

import media.VideoFile;

public class MetadataReader {
    public static void read(VideoFile file){
        System.out.println("Reading metadata form "+ file.getName());
    }
}
