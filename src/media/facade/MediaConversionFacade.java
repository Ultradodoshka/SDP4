package media.facade;

import media.VideoFile;
import media.subsystem.*;

import java.io.File;

public class MediaConversionFacade {
    public File convert(String fileName, String targetFormat){
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("File name must not be blank.");
        }
        System.out.println("Starting conversion:"+fileName+" --->>>"+targetFormat);
        VideoFile file = new VideoFile(fileName);
        MetadataReader.read(file);
        Codec destinationCodec = CodecFactory.extract(targetFormat);
        int[] buffer = BitrateReader.read(file,destinationCodec);
        String outputFileName = getBaseName(fileName)+"."+destinationCodec.getCodecType();
        VideoFile intermediateResult = BitrateReader.convert(buffer,outputFileName,destinationCodec);
        AudioMixer audioMixer =new AudioMixer();
        VideoFile finalResult = audioMixer.fix(intermediateResult);

        System.out.println("Conversion finished successfully");
        return new File(finalResult.getName());
    }

    private String getBaseName(String fileName){
        int dotIndex = fileName.lastIndexOf('.');
        return (dotIndex>0) ? fileName.substring(0,dotIndex) : fileName;
    }
}
