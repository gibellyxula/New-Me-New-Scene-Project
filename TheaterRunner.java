import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    //creates the objects for the scence class
    LastYear lastYear = new LastYear();
    ThisYear thisYear   = new ThisYear();

    //allows for the code in the classes to run
    lastYear.drawScene();
    thisYear.drawScene();

    //plays the code from the scene classes into the theater
    Theater.playScenes(lastYear, thisYear);
    
  }
}