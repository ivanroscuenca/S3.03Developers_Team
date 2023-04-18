package products;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;


public class Utils {
    private static final String PROPERTIESPATH="config.properties";
    private static Properties properties=new Properties();
    public static void fromDecorationSetToFile(Set<Decoration> set) {
        try {
            properties.load(new FileInputStream(PROPERTIESPATH));
            PrintWriter writer = new PrintWriter(properties.getProperty("decorations"));
            writer.print("");
            writer.close();
            ObjectMapper objectMapper = new ObjectMapper();
            String setToString = objectMapper.writeValueAsString(set);
            PrintWriter printWriter;
            printWriter = new PrintWriter(properties.getProperty("decorations"));
            printWriter.write(setToString);
            printWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void fromTreeSetToFile(Set<Tree> set) {
        try {
            properties.load(new FileInputStream(PROPERTIESPATH));
            PrintWriter writer = new PrintWriter(properties.getProperty("trees"));
            writer.print("");
            writer.close();
            ObjectMapper objectMapper = new ObjectMapper();
            String setToString = objectMapper.writeValueAsString(set);
            PrintWriter printWriter;
            printWriter = new PrintWriter(properties.getProperty("trees"));
            printWriter.write(setToString);
            printWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void fromFlowerSetToFile(Set<Flower> set) {
        try {
            properties.load(new FileInputStream(PROPERTIESPATH));
            PrintWriter writer = new PrintWriter(properties.getProperty("flowers"));
            writer.print("");
            writer.close();
            ObjectMapper objectMapper = new ObjectMapper();
            String setToString = objectMapper.writeValueAsString(set);
            PrintWriter printWriter;
            printWriter = new PrintWriter(properties.getProperty("flowers"));
            printWriter.write(setToString);
            printWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Set<Decoration> fromFileProductToDecorationSet() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Set<Decoration> decorations = new HashSet<>();
            File file = new File("decorations.json");
            decorations = mapper.readValue(file, new TypeReference<>() {});
            return decorations;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Set<Flower> fromFileProductToFlowerSet() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Set<Flower> flowers = new HashSet<>();
            File file = new File("decorations.json");
            flowers = mapper.readValue(file, new TypeReference<>() {});
            return flowers;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Set<Tree> fromFileProductToTreeSet() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Set<Tree> trees = new HashSet<>();
            File file = new File("decorations.json");
            trees = mapper.readValue(file, new TypeReference<>() {});
            return trees;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
