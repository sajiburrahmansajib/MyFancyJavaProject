import javax.swing.*;

class SingletonEagar {
  private static SingletonEagar instance = new SingletonEagar(); 
  
  private SingletonEagar(){}
  
  public static SingletonEagar getInstance() {
    return instance;
  }
}

public class simple_java_program {
    public static void main(String[] args) {
        System.out.println("Hello Munna , We need to create a project");
    }
}
