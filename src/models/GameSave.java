package edu.gatech.cs2340.shlat.models;
import java.io.*;
import java.math.*;
import java.security.*;
import java.util.Date;
import edu.gatech.cs2340.shlat.models.Serialize;

public class GameSave implements Serializable {
  private Party party;
  private Wagon wagon;
  private Pace pace;
  private Rations rations;

  public GameSave() {}

  public GameSave(Party party, Wagon wagon, Pace pace, Rations rations) {
    this.party = party;
    this.wagon = wagon;
    this.pace = pace;
    this.rations = rations;
  }

  public void prepare(Party party, Wagon wagon, Pace pace, Rations rations) {
    this.party = party;
    this.wagon = wagon;
    this.pace = pace;
    this.rations = rations;
  }

  public void prepare(Party party) {
    this.party = party;
  }

  public void prepare(Wagon wagon) {
    this.wagon = wagon;
  }

  public void prepare(Pace pace) {
    this.pace = pace;
  }

  public void prepare(Rations rations) {
    this.rations = rations;
  }

  public Party loadParty() {
    return this.party;
  }

  public Wagon loadWagon() {
    return this.wagon;
  }

  public Rations loadRations() {
    return this.rations;
  }

  public Pace loadPace() {
    return this.pace;
  }

  public void save() {
    try {
      File saves = new File("saves");
      if (!saves.exists()) {
        saves.mkdir();
      }
      
      Date currentDate = new Date();
      byte[] date = currentDate.toString().getBytes();

      MessageDigest md = MessageDigest.getInstance("MD5");
      md.update(date);

      BigInteger b = new BigInteger(md.digest());

      String filename = "saves/" + b.abs().toString(16);
      System.out.println(filename);

      Serialize<GameSave> s = new Serialize();
      
      FileOutputStream fos = new FileOutputStream(filename);
      fos.write(s.serialize(this));
      fos.close();
    } catch (SecurityException e) {
      System.out.println("Sorry! It appears that you don't have permission to save files!");
      System.out.println(e);
    } catch (NoSuchAlgorithmException e) {
      System.out.println("Sorry! Can't save. What were you thinking? Wanting to save an awesome game like this. Be extreme! Keep going!");
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static GameSave load(String filename) {
    try {
      filename = "saves/" + filename;
      File f = new File(filename);
      byte b[] = new byte[(int) f.length()];
      
      FileInputStream fis = new FileInputStream(filename);
      fis.read(b);
      fis.close();

      Serialize s = new Serialize();
      return (GameSave) s.deserialize(b);
    } catch (IOException e) {
      System.out.println(e);
      return null;
    } catch (ClassNotFoundException e) {
      System.out.println(e);
      return null;
    }
  }

  public String[] getSaveFiles() {
    File f = new File("saves");
    String[] saves = f.list();
    if (saves.length == 0) {
      return null;
    } else {
      return saves;
    }
  }
}
