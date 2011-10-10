package edu.gatech.cs2340.shlat.models;

public class Item {
  private int id;
  private String name;
  private String desc;

  public Item() {
  }

  public void setId(String id) {
    this.id = Integer.parseInt(id);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }
}
