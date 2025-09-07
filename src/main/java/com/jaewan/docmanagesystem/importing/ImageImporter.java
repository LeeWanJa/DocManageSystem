package main.java.com.jaewan.docmanagesystem.importing;

import main.java.com.jaewan.docmanagesystem.domain.Document;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static main.java.com.jaewan.docmanagesystem.domain.Attributes.*;

public class ImageImporter implements Importer {
    @Override
    public Document importFile(final File file) throws IOException{
        final Map<String, String> attributes = new HashMap<>();
        attributes.put(PATH, file.getPath());

        /*
            ImageIO.read()을 통해 이미지 파일을 읽어 온다.
            그리고 이미지 데이터는 BufferedImage 객체로 리턴된다.
            BufferedImage 객체에서 필요한 이미지 정보를 획득할 수 있다.
         */
        final BufferedImage image = ImageIO.read(file);
        attributes.put(WIDTH, String.valueOf(image.getWidth()));
        attributes.put(HEIGHT, String.valueOf(image.getHeight()));
        attributes.put(TYPE, "IMAGE");

        return new Document(attributes);
    }
}
