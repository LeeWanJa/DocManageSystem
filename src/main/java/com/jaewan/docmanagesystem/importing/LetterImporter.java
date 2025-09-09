package main.java.com.jaewan.docmanagesystem.importing;

import main.java.com.jaewan.docmanagesystem.domain.Document;

import java.io.File;
import java.util.Map;

import static main.java.com.jaewan.docmanagesystem.domain.Attributes.*;

public class LetterImporter implements Importer {
    @Override
    public Document importFile(final File file){
        final TextFile  textFile = new TextFile(file);

        textFile.addLineSuffix(NAME_PREFIX, PATIENT);

        final int lineNumber = textFile.addLines(2, String::isEmpty, ADDRESS);
        textFile.addLines(lineNumber + 1, (line) -> line.startsWith("regard,"), BODY);

        final Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "LETTER");
        return new Document(attributes);
    }
}
