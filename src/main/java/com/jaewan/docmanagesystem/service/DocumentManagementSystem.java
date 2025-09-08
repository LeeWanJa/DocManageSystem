package main.java.com.jaewan.docmanagesystem.service;

import main.java.com.jaewan.docmanagesystem.domain.Document;
import main.java.com.jaewan.docmanagesystem.exception.UnknownFileTypeException;
import main.java.com.jaewan.docmanagesystem.importing.ImageImporter;
import main.java.com.jaewan.docmanagesystem.importing.Importer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentManagementSystem {
    private final Map<String, Importer> extensiontoImporter = new HashMap<>();
    private final List<Document> documents = new ArrayList<>();

    public DocumentManagementSystem() {
        extensiontoImporter.put("jpg", new ImageImporter());
    }

    public void importFile(final String path) throws IOException{
        final File file = new File(path);
        if(!file.exists())
            throw new FileNotFoundException();

        final int separatorIndex = path.lastIndexOf('.');
        if(separatorIndex != -1){
            if(separatorIndex == path.length())
                throw new UnknownFileTypeException("No extension found For file: " + path);

            final String extension = path.substring(separatorIndex + 1);
            final Importer importer = extensiontoImporter.get(extension);
            if(importer == null)
                throw new UnknownFileTypeException("For file: " + path);

            final Document document = importer.importFile(file);
            documents.add(document);
        } else{
            throw new UnknownFileTypeException("No extension found For file: " + path);
        }
    }

}
