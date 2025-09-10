package main.java.com.jaewan.docmanagesystem.importing;

import main.java.com.jaewan.docmanagesystem.domain.Document;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static main.java.com.jaewan.docmanagesystem.domain.Attributes.*;

public class PrescriptionImporter implements Importer{
    @Override
    public Document importFile(File file){
        final TextFile textFile = new TextFile(file);

        textFile.addLineSuffix(PATIENT_PREFIX, PATIENT);
        textFile.addLineSuffix(DATE_PREFIX, DATE);
        textFile.addLineSuffix(DRUG_PREFIX, DRUG);
        textFile.addLineSuffix(DOSAGE_PREFIX, DOSAGE);
        textFile.addLineSuffix(INSTRUCTIONS_PREFIX, INSTRUCTIONS);

        final Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "PRESCRIPTION");

        return new Document(attributes);
    }
}
