package main.java.com.jaewan.docmanagesystem.importing;

import main.java.com.jaewan.docmanagesystem.domain.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static main.java.com.jaewan.docmanagesystem.domain.Attributes.*;

public class InvoiceImporter implements Importer {
    @Override
    public Document importFile(final File file) {
        final TextFile textFile = new TextFile(file);

        textFile.addLineSuffix(NAME_PREFIX, PATIENT);
        textFile.addLineSuffix(AMOUNT_PREFIX, AMOUNT);

        final Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "INVOICE");

        return new Document(attributes);
    }
}
