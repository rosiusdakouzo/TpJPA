/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.File;
import java.io.IOException;
import java.util.List;
import jdk.internal.org.objectweb.asm.TypeReference;
//import jpa.fasterxml.jackson.databind.ObjectMapper;
/**
 *
 * @author Rosius
 */
public class JSONFileReader {
    public static <T> List<T> getJavaFromJSON(File fichier, Class<T> obj) {
        List<T> lstT = null;
        try {
            JsonFactory f = new JsonFactory();
            
            JsonParser jp = f.createJsonParser(fichier);
            TypeReference<List<T>> tRef = new TypeReference<List<T>>() {
            };
            lstT = mapper.readValue(jp, tRef);
        }
        catch (JsonGenerationException | JsonMappingException e) {
            System.out.println("La conversion du JSON vers JAVA a échoué!!! " +e.getMessage());
        }
        catch (IOException e) {
             System.out.println("Un probleme est survenu lors du traitement du fichier !!!" +e.getMessage());
        }
        return lstT;
    }
    
}
