package media;

import media.facade.MediaConversionFacade;

import java.io.File;

public class Main {
    public static void main(String[] args){
        MediaConversionFacade converter = new MediaConversionFacade();
        File fileMP4 = converter.convert("skibididopdop.mov", "mp4");
        System.out.println("Ready: "+fileMP4.getName());
        System.out.println();
        File fileOGG = converter.convert("idontknowhowtoname.pdf", "ogg");
        System.out.println("Ready:"+fileOGG.getName());
    }
}
