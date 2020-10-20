import java.util.HashMap;

import sun.jvm.hotspot.utilities.Bits;
public class FileIOHash {
    public static void main(String[] args) 
    { 
        HashMap<String, Integer> map 
            = new HashMap<>(); 
  
        map.put("Key A", 10); 
        map.put("Key B", 20); 
        map.put("Key C", 30); 
  
        System.out.println("Size of map is: "
                           + map.size()); 
        System.out.println(map); 
  
        if (map.containsKey("Key A")) { 
            Integer a = map.get("Key A"); 
            System.out.println("value for key"
                               + " \"Key A\" is: "
                               + a); 
        } 
       if (map.containsKey("Key B")) { 
        Integer a = map.get("Key B"); 
        System.out.println("value for key"
                           + " \"Key B\" is: "
                           + a); 
    }  if (map.containsKey("Key C")) { 
        Integer a = map.get("Key C"); 
        System.out.println("value for key"
                           + " \"Key C\" is:- "
                           + a); 
    }     
    String s = Hashmap 
  

    Scanner scanner = new Scanner(s); 
    scanner.useDelimiter(","); 
    System.out.println("Scanner String: \n"
                       + scanner.nextLine()); 
    System.out.println("\nDelimiter being used in Scanner: "
                       + scanner.delimiter(0)); 
    scanner.close(); 
    Scanner scanner = new Scanner(s); 
    scanner.useDelimiter(","); 
    System.out.println("Scanner String: \n"
                       + scanner.nextLine()); 
    System.out.println("\nDelimiter being used in Scanner: "
                       + scanner.delimiter(1)); 
    scanner.close(); 
    Scanner scanner = new Scanner(s); 
    scanner.useDelimiter(","); 
    System.out.println("Scanner String: \n"
                       + scanner.nextLine()); 
    System.out.println("\nDelimiter being used in Scanner: "
                       + scanner.delimiter(2)); 
    scanner.close(); 
}
private long startTime = 0;
private long stopTime = 0;
private boolean running = false;
public void start() {
  this.startTime = System.currentTimeMillis();
  this.running = true;
}
public void stop() {
  this.stopTime = System.currentTimeMillis();
  this.running = false;
}
public long getElapsedTime() {
  long elapsed;
  if (running) {
    elapsed = (System.currentTimeMillis() - startTime);
  } else {
    elapsed = (stopTime - startTime);
  }
  return elapsed;
}
public long getElapsedTimeSecs() {
  long elapsed;
  if (running) {
    elapsed = ((System.currentTimeMillis() - startTime) / 1000);
  } else {
    elapsed = ((stopTime - startTime) / 1000);
  }
  return elapsed;
  System.out.println("SUM");
  int x = stopTime
  System.out.println(elapsed);
  System.out.println("AVERAGE");
  int y = #data/stopTime;
  System.out.println(int y);
  System.out.println("COUNT")
  int z = System.currentTiemMillis();
  System.out.println(int z)
}
}