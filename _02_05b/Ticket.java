package _02_05b;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three public methods to set the value of each field, called
  // setDestination, setPrice and setIsReturn.
  public void setDestination(String destino) {
    this.destination = destino;
  }

  public void setPrice(double precio) {
    this.price = precio;
  }

  public void setIsReturn(boolean returned) {
    this.isReturn = returned;
  }
  // Add three public methods to get the value of each field, called
  // getDestination, getPrice and getIsReturn.

  public String getDestination() {
    return this.destination;
  }

  public double getPrice() {
    return this.price;
  }

  public boolean getReturn() {
    return this.isReturn;
  }

}
