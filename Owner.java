import java.util.List;
import java.util.ArrayList;

public class Owner extends Person {
  private List<Residence> residences;

  public Owner(String forename, String surname, int age, char sex) {
    super(forename, surname, age, sex);
    this.residences = new ArrayList<Residence>();
  }

  //getters
  public List<Residence> getResidences() {
    return residences;
  }

  //methods
  //purchase new residence
  public void purchaseResidence(Residence newResidence) {
    this.residences.add(newResidence);
  }

  //sell current residence
  public void sellResidence(Residence residence) {
    this.residences.remove(this.residences.indexOf(residence));
  }

  
}
