import java.util.List;

public class FamilyMember extends Person {
  private FamilyMember mother;
  private FamilyMember father;
  private FamilyMember partner;
  private List<FamilyMember> siblings;

  //main constructor
  public FamilyMember(String forename, String surname, int age, char sex) {
    super(forename, surname, age, sex);
  }

  //getters
  //get mother
  public FamilyMember getMother() {
    return mother;
  }

  //get father
  public FamilyMember getFather() {
    return father;
  }

  //get partner
  public FamilyMember getPartner() {
    return partner;
  }

  //get siblings
  public List<FamilyMember> getSiblings() {
    return siblings;
  }

  //setters
  //set mother
  public void setMother(FamilyMember newMother) {
    this.mother = newMother;
  }

  //set father
  public void setFather(FamilyMember newFather) {
    this.father = newFather;
  }

  //set partner
  public void setPartner(FamilyMember newPartner) {
    this.partner = newPartner;
  }

  //set siblings
  public void setSiblings(List<FamilyMember> newSiblings) {
    this.siblings = newSiblings;
  }

  //methods
  //print sibling data
  public void printSiblingData() {
    for(FamilyMember sibling : siblings) {
      sibling.printPersonData();
    }
  }
}