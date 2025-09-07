package main.java.com.jaewan.docmanagesystem.importing;
import main.java.com.jaewan.docmanagesystem.domain.Document;

import java.io.File;
import java.io.IOException;

public interface Importer {
    Document importFile(File file) throws IOException;
}
