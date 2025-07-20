package org.example.patterns.creational.aSingleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {


//    Without volatile, the JVM may return a partially constructed object.
//    Fix: Always declare instance as private static volatile Logger
    private static volatile Logger instance;
    private List<String> logs; // this stores all the log messages

// -------------------------------------------------
//    to make a singleton class follow these steps
// -------------------------------------------------

    // Step 1 || Constructor is Private :: no one could make an object of this class - we create only one object and call it instance

    private Logger() {
        logs = new ArrayList<>();
    }




    // step 2 || instance rather than object :: no one can have an object of this class ::

    // putting synchronized at method signature
    // Every call to getInstance() acquires the lock, even after the instance is created.
    // this leads to ❌ Performance bottleneck: Locks on every call, even when unnecessary (after initialization).
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


//    Locks only during initialization (when instance == null).
//    After initialization, threads skip the lock entirely (thanks to the first check).

    public static Logger getInstanceImproved(){
        if (instance == null){

            // Two threads could fulfill this condition at the same time
            // Thread A could acquires the lock first and create the instance
            // Thread B take the lock and create an instance as well
            synchronized (Logger.class){
                // so we need second check
                if (instance == null){
                    instance =  new Logger();
                }
            }

        }
        return instance;
    }


    public void log(String message) {
        String formatted = "[LOG] " + message;
        System.out.println(formatted);
        logs.add(formatted); // store the message
    }

    public List<String> getAllLogs() {
        return logs;
    }

    // Optional: save logs to a file
    public void saveToFile(String filePath) {
        try (java.io.FileWriter writer = new java.io.FileWriter(filePath)) {
            for (String log : logs) {
                writer.write(log + System.lineSeparator());
            }
            System.out.println("Logs saved to: " + filePath);
        } catch (Exception e) {
            System.err.println("Failed to save logs: " + e.getMessage());
        }

    }
}