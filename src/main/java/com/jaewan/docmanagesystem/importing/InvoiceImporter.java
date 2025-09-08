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
    public Document importFile(final File file) throws IOException{
        final Map<String, String> attributes = new HashMap<>();

        // Amount 키값에 Amount : 이후의 숫자 value로 설정
        final TextFile textFile = new TextFile(file);

        return new Document(attributes);
    }
}
