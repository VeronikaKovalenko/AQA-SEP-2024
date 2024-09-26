package org.prog.homework;

public class Airplane {

  private String name;
  private String code;

  public Airplane (String name , String code ) {
    this.name = name ;
    this.code = code ;
  }


  public String getName() {
    return name  ;
  }

  public String getCode() {
    return code ;
  }

  @Override
  public String toString() {
    return "Airplane: " + name  + "(Code: " + code  +")";
  }

  public static class Main {
      public static void main(String[] args) {
          Airplane airplane = new Airplane("Bergamo", "SU"); //
          Flight flight = new Flight(airplane, "SU-6566"); //

          System.out.println(airplane);
          System.out.println(flight);
          flight.printFlightDetails("Venice", " Stuttgart", "Berne");
      }
  }
}