package vttp.ssf.assessment.eventmanagement.services;

import java.util.LinkedList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

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

    
