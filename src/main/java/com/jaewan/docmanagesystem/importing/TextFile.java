package main.java.com.jaewan.docmanagesystem.importing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class TextFile {
    private final Map<String, String> attributes;
    private final List<String> lines;
    private final File file;

    public TextFile(File file) {
        this.file = file;
        this.attributes = new HashMap<>();
        this.lines = new ArrayList<>();
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    private void fillLines(){
        try(BufferedReader inFile = new BufferedReader(new FileReader(this.file))){
            String line;
            while ((line = inFile.readLine()) != null)
                lines.add(line);
        } catch (IOException ie) {
            System.out.println("File Error : " + ie.getMessage());
        }
    }

    public void addLineSuffix(final String prefix, final String attributeName){
        if(this.lines.isEmpty())
            fillLines();

        for(final String line : lines){
            if(line.startsWith(prefix)){
                attributes.put(attributeName, line.substring(prefix.length()));
                break;
            }
        }
    }

    public int addLines(final int start, final Predicate<String> isEnd, final String attributeName){
        final StringBuilder accumulator = new StringBuilder();
        int lineNumber;
        for(lineNumber = start; lineNumber < lines.size(); lineNumber++){
            final String line = lines.get(lineNumber);
            if(isEnd.test(line)){
                break;
            }

            accumulator.append(line);
            accumulator.append("\n");
        }

        attributes.put(attributeName, accumulator.toString().trim());
        return lineNumber;
    }
}
