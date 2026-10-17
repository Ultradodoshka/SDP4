package media.subsystem;

import media.VideoFile;

public class BitrateReader {
    public static int[] read(VideoFile file, Codec codec){
        System.out.println("Reading buffer with codec: "+codec.getCodecType());
        return file.getData();
    }

    public static VideoFile convert(int[] buffer, String destinationFilename, Codec codec){
        System.out.println("Writing converted data to: "+destinationFilename);
        VideoFile result = new VideoFile(destinationFilename);
        result.setData(buffer);
        return result;
    }
}
