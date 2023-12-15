package vttp.ssf.assessment.eventmanagement.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.stream.JsonReader;

import jakarta.json.stream.JsonParser.Event;


@Service
public class DatabaseService {
   
     {
        
    };

    // task1
   public List<Event> readFile(String fileName){
   List<Event> contents = new LinkedList<>();
   JSONObject obj = new JSONObject("events.json");
   
   return contents;

    
   }
        }

    
