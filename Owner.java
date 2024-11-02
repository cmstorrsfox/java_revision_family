public class Owner extends Person {
  private Residence residence;

  public Owner(String forename, String surname, int age, char sex, Residence residence) {
    super(forename, surname, age, sex);
    this.residence = residence;
  }

  //getters
  public Residence getResidence() {
    return residence;
  }
  
}
