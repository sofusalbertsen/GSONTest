/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsontest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sofus
 */
public class GSONTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
    //assignment 1
    JsonElement json = new JsonParser().parse(new FileReader("src/assignment1.json"));
    
    //Assignment 2;
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    FileWriter writer = new FileWriter("src/out.json");
		writer.write(gson.toJson(json));
		writer.close();
    }
    
}
