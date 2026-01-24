import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {
  /**
   * These are the private instance variables
   * in order for my code to function
   */
  private String[] photos2;
  private String[] description2 = {
    "Travel to El Salvador",
    "Spend time with family",
    "Travel to Guatemala",
    "Hang out with friends",
    "Get straight A's",
  };
  
  /**
   * This is my no-argument constructor
   * for the ThisYear class
   */
  public ThisYear() {
    photos2 = FileReader.toStringArray("photos2.txt");
  }
  /**
   * These is my parameterized constructor
   * for the ThisYear class
   */
  public ThisYear (String[] photos2) {
    this.photos2 = photos2;
  }


  /**
   * Plays every method below so it shows up
   * in the theater
   */
  public void drawScene() {
    playMusic();
    drawTitleScreen();
    drawImage();
    drawEndScreen();
  }

  /**
   * This is to play the background music in the code
   */
  public void playMusic() {
    //the audio that was chosen
    double[] music = SoundLoader.read("-bg.wav");
    playSound(music);
  }
  
  /**
   * Creates the title screen for the ThisYear class
   */
  public void drawTitleScreen () {
    clear ("VIOLET");
    setTextHeight(50);
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    drawText("Goals for", 80, 170);
    drawText("2026!", 135, 230);
    pause(2.0);
  }

  /**
   * Goes through the photos so it can 
   * be played in the video
   */  
  public void drawImage() {
    //allows for the photos and descriptions to be played
    for (int i = 0; i < photos2.length; i++) {
      drawImage(photos2[i], 0, 0, 400, 400, 0.0);
      setTextHeight(25);
      setTextColor("FUCHSIA");
      setTextStyle(Font.SANS, FontStyle.BOLD);
      drawText(description2[i], 80, 20);
      pause(2.5);
    }
  }

  /**
   * Creates the end screen for the ThisYear class
   */
  public void drawEndScreen() {
    clear ("VIOLET");
    setTextHeight(50);
    setTextColor("black");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    drawText("Thank", 130, 170);
    drawText("You", 145, 230);
    pause(2.0);
  }
}