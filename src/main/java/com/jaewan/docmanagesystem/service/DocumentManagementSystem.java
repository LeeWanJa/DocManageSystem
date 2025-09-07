package main.java.com.jaewan.docmanagesystem.service;

import main.java.com.jaewan.docmanagesystem.importing.ImageImporter;
import main.java.com.jaewan.docmanagesystem.importing.Importer;

import java.util.HashMap;
import java.util.Map;

public class DocumentManagementSystem {
    private final Map<String, Importer> extensiontoImporter = new HashMap<>();

    public DocumentManagementSystem() {
        extensiontoImporter.put("jpg", new ImageImporter());
    }
}
