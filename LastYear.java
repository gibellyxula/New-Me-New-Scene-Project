import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  /**
   * These are the private instance variables
   * in order for my code to function
   */
  private String[] photos;
  private String[] description = {
    "Beach day with my friends",
    "Chicago trip with my family",
    "Hangout with my best friends",
    "Favorite movie on the plane",
    "Quality time with my family",
  };
  
  /**
   * This is my no-argument constructor
   * for the LastYear class
   */
  public LastYear() {
    photos = FileReader.toStringArray("photos1.txt");
  }
  /**
   * These is my parameterized constructor
   * for the LastYear class
   */
  public LastYear(String[] photos) {
    this.photos = photos;
  }

  /**
   * The drawScene method is what 
   * causes my program to show up in the theater.
   */
  public void drawScene() {
    playMusic();
    drawTitleScreen();
    drawImage();
  }

  // other methods
  /**
   * Plays the background music for my Last Year portion!
   */
  public void playMusic() {
    double[] music = SoundLoader.read("-bg.wav");
    playSound(music);
  }
  
  /**
   * Writes the Title Screen for the Last Year portion of my project
   */
  public void drawTitleScreen () {
    clear ("VIOLET");
    setTextHeight(50);
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    drawText("Memories from", 27, 170);
    drawText("2025!", 135, 230);
    
      pause(2.0);
  }

  /**
   * Draws the images in the theater
   */
  public void drawImage() {
    //Goes through all the pictures and descriptions
    for (int i = 0; i < photos.length; i++) {
      drawImage(photos[i], 0, 0, 400, 400, 0.0);
      setTextHeight(25);
      setTextColor("ivory");
      setTextStyle(Font.SANS, FontStyle.BOLD);
      drawText(description[i], 40, 350);
      pause(2.5);
    }
  }
}
