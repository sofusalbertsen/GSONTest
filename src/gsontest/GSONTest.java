/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsontest;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author sofus
 */
public class GSONTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
//        File f =new File("");
//        System.out.println(new File("s").getAbsolutePath());        
    //assignment 1
    JsonElement json = new JsonParser().parse(new FileReader("src/assignment1.json"));
        System.out.println(json.getAsJsonObject().get("name").getAsString());
        System.out.println(json.getAsJsonObject().get("grades").getAsJsonArray().size());
    
    }
    
}
