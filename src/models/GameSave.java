package edu.gatech.cs2340.shlat.models;
import java.io.*;
import edu.gatech.cs2340.shlat.models.Serialize;

public class GameSave implements Serializable {
  private Party party;
  private Wagon wagon;
  private Pace pace;
  private Rations rations;

  public GameSave() {}
}
