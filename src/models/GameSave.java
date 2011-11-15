package edu.gatech.cs2340.shlat.models;
import java.io.*;
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

  public void prepare(Player player) {
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
}
