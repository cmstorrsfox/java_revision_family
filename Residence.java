import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Residence {
  private String address;
  private int numBedrooms;
  private int value;
  private String purchaseDate;
  private Family residents;
 


  public Residence(String address, int numBedrooms, int value, String purchaseDate) {
    this.address = address;
    this.numBedrooms = numBedrooms;
    this.value = value;
    this.purchaseDate = purchaseDate;
  }

  //datetime formatting method
  public String convertDateFormat(String inputDate) throws ParseException {
    SimpleDateFormat originalFormat = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat newFormat = new SimpleDateFormat("EEEEE, dd MMMMM yyyy");

    Date dateAsDate = originalFormat.parse(inputDate);
    String outputDate = newFormat.format(dateAsDate);
    return outputDate;
  }

  //getters
  public String getAddress() {
    return address;
  }

  public int getNumBedrooms() {
    return numBedrooms;
  }

  public int getValue() {
    return value;
  }

  public String getPurchaseDate() throws ParseException {
    return convertDateFormat(this.purchaseDate);
  }

  public Family getResidents() {
    return residents;
  }

  //setters
  public void setAddress(String newAddress) {
    this.address = newAddress;
  }

  public void setNumBedrooms(int newNumBedrooms) {
    this.numBedrooms = newNumBedrooms;
  }

  public void setValue(int newValue) {
    this.value = newValue;
  }

  public void setPurchaseDate(String newPurchaseDate) {
    this.purchaseDate = newPurchaseDate;
  }


  //methods
  //print residence data
  public void printResidenceData() throws ParseException {
    System.out.println("Address: " + this.address);
    if(this.residents != null) {
      System.out.println("Current Residents: " + this.residents.getFamilyName() + " Family");
      System.out.println("Number of Residents: " + this.residents.getFamilySize());
    } else {
      System.out.println("Current Residents: Not currently occupied");
    }
    
    System.out.println("Number of Bedrooms: " + this.numBedrooms);
    System.out.println("Value: " + this.value);
    System.out.println("Purchase Date: " + convertDateFormat(this.purchaseDate));
    
  }
}
