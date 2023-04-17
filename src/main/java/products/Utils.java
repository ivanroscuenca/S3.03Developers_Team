package products;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;


public class Utils {
    private static final String PROPERTIESPATH="config.properties";
    private static Properties properties=new Properties();
    public static void fromSetToFileProduct(List<? extends Product>list) {
        try {
            if(!list.isEmpty()) {
                properties.load(new FileInputStream(PROPERTIESPATH));
                ObjectMapper objectMapper = new ObjectMapper();
                String setToString = objectMapper.writeValueAsString(list);
                PrintWriter printWriter;
                if(list.get(0) instanceof Decoration) {
                    printWriter = new PrintWriter(properties.getProperty("decorations"));
                }
                else if(list.get(0) instanceof Flower) {
                    printWriter = new PrintWriter(properties.getProperty("flowers"));
                }
                else {
                    printWriter = new PrintWriter(properties.getProperty("trees"));
                }
                printWriter.write(setToString);
                printWriter.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
