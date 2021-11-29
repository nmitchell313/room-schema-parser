package edu.cnm.deepdive.model;

import com.google.gson.annotations.Expose;

public class Schema {

  @Expose
  private Database database;

  public Database getDatabase() {
    return database;
  }

  public void setDatabase(Database database) {
    this.database = database;
  }
}
