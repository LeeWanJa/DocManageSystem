package main.java.com.jaewan.docmanagesystem.importing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextFile {
    private final Map<String, String> attributes;
    private final List<String> lines;
    private final File file;

    public TextFile(File file) {
        this.file = file;
        this.attributes = new HashMap<>();
        this.lines = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

        } catch (IOException){

        }
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
    public List<String> getLines() {}

    public void addLineSuffix(final String prefix, final String attributeName){
        for(final String line : lines){
            if(line.startsWith(prefix)){
                attributes.put(attributeName, line.substring(prefix.length()));
                break;
            }
        }
    }
}
