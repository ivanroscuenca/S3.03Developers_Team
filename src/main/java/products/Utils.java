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
    public static HashSet<Decoration> fromFileProductToDecorationSet() {
        try {
            HashSet<Decoration> decorations = new HashSet<>();
            File file = new File("decorations.json");
            if(file.length()!=0) {
                ObjectMapper mapper = new ObjectMapper();
                decorations = mapper.readValue(file, new TypeReference<>() {
                });
            }
            return decorations;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static HashSet<Flower> fromFileProductToFlowerSet() {
        try {
            HashSet<Flower> flowers = new HashSet<>();
            File file=new File("flowers.json");
            if(file.length()!=0) {
                ObjectMapper mapper = new ObjectMapper();
                flowers = mapper.readValue(file, new TypeReference<>() {
                });
            }
            return flowers;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static HashSet<Tree> fromFileProductToTreeSet() {
        try {
            HashSet<Tree> trees = new HashSet<>();
            File file = new File("trees.json");
            if(file.length()!=0) {
                ObjectMapper mapper = new ObjectMapper();
                trees = mapper.readValue(file, new TypeReference<>() {
                });
            }
            return trees;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printingSet(Set<? extends Product> set) {
        for(Product product:set) {
            System.out.println(product);
        }
    }
}
