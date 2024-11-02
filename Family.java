import java.util.List;
import java.util.ArrayList;

public class Family {
  private String familyName;
  private List<FamilyMember> members;
  private int familySize;

  //constructor
  public Family(String familyName) {
    this.familyName = familyName;
    this.members = new ArrayList<FamilyMember>();
    this.familySize = 0;
  }

  //getters
  public String getFamilyName() {
    return familyName;
  }

  public List<FamilyMember> getMembers() {
    return members;
  }

  public int getFamilySize() {
    return familySize;
  }

  //setters
  public void setFamilyName(String newFamilyName) {
    this.familyName = newFamilyName;
  }

  public void setFamilyMembers(List<FamilyMember> newMembers) {
    this.members = newMembers;
  }

  //methods
  //add family member
  public void addFamilyMember(FamilyMember newMember) {
    this.members.add(newMember);
    this.familySize += 1;
  }

  //remove family member
  public void removeFamilyMember(FamilyMember member) {
    this.members.remove(this.members.indexOf(member));
    this.familySize -= 1;
  }

  //print family data
  public void printFamilyData() {
    System.out.println("Family Name: " + this.familyName);
    System.out.println("Family Size: " + this.familySize);
    System.out.println("Family Members:");
    for(int i = 0; i < members.size(); i++) {
      members.get(i).printPersonData();
    }
  }
}
