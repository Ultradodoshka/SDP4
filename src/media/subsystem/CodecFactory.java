package media.subsystem;

public class CodecFactory {
    public static Codec extract(String targetFormat){
        if(targetFormat==null || targetFormat.isBlank()){
            throw new IllegalArgumentException("Target format cant be empty");
        }
        return switch (targetFormat.toLowerCase()){
            case "mp4" -> new MPEG4CompressionCodec();
            case "ogg" -> new OGGCompressionCodec();
            default -> throw new UnsupportedOperationException("Unsupported format");
        };
    }
}
