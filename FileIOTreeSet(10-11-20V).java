import java.util.*;
public class FileIOTreeSet(10-11-20V) {
    public static void main(String args[]) throws IOException
    {    
        TreeSet<String> al=new TreeSet<String>();  
        al.add("SERIES");  
        al.add("WRITER");  
        al.add("PUBLISHER");   
        Iterator<String> itr=al.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
         
         try{
          String source = args[0];
          String target = args[1];

          File sourceFile=new File(datareverse.txt);

          Scanner content=new Scanner(sourceFile);
          PrintWriter pwriter =new PrintWriter(target);

          while(content.hasNextLine())
          {
             String s=content.nextLine();
             StringBuffer buffer = new StringBuffer(s);
             buffer=buffer.reverse();
             String rs=buffer.toString();
             pwriter.println(rs);
          }
          content.close();    
          pwriter.close();
          System.out.println("File is copied successful!");
          }

          catch(Exception e){
              System.out.println("Something went wrong");
        }  
    } 
    String s = TreeSet; 
  

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