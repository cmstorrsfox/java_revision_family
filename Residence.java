import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Residence {
  private String address;
  private int numBedrooms;
  private int value;
  private String purchaseDate;
  private List<Person> residents;
  private List<Owner> owners;
 


  public Residence(String address, int numBedrooms, int value, String purchaseDate) {
    this.address = address;
    this.numBedrooms = numBedrooms;
    this.value = value;
    this.purchaseDate = purchaseDate;
    this.residents = new ArrayList<Person>();
    this.owners = new ArrayList<Owner>();
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

  public List<Person> getResidents() {
    return residents;
  }

  public List<Owner> getOwners() {
    return owners;
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

  public void setResidents(List<Person> newResidents) {
    this.residents = newResidents;
  }

  public void setOwners(List<Owner> newOwners) {
    this.owners = newOwners;
  }

  //methods
  //add residents
  public void addResident(Person newResident) {
    this.residents.add(newResident);
    if (newResident.getResidence() != this) {
      newResident.setResidence(this);
    }
  }
  //remove residents
  public void removeResident(Person resident) {
    residents.remove(this.residents.indexOf(resident));
  }

  //print residence data
  public void printResidenceData() throws ParseException {
    System.out.println("Address: " + this.address);
    System.out.println("Current Owners: ");
    for (Owner owner : this.owners) {
      owner.printPersonData();
    }
    if(this.residents != null) {
      System.out.println("Current Residents:");
      for (Person resident: this.residents) {
        resident.printPersonData();
      }
    } else {
      System.out.println("Current Residents: Not currently occupied");
    }
    System.out.println("Number of Bedrooms: " + this.numBedrooms);
    System.out.println("Value: " + this.value);
    System.out.println("Purchase Date: " + convertDateFormat(this.purchaseDate));
    
  }
}
