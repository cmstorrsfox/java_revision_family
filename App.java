import java.util.List;
import java.util.ArrayList;

public class App {

  public static void main(String args[]) throws Exception {
    //storrs-fox family
    FamilyMember chris = new FamilyMember("Chris", "Storrs-Fox", 37, 'M');
    FamilyMember ngoc = new FamilyMember("Ngoc", "Nguyen", 36, 'F');
    FamilyMember hieu = new FamilyMember("Hieu", "Storrs-Fox", 5, 'M');
    FamilyMember khoa = new FamilyMember("Khoa", "Storrs-Fox", 3, 'M');

    Family storrsFox = new Family("Storrs-Fox");

    
    storrsFox.addFamilyMember(chris);
    storrsFox.addFamilyMember(ngoc);
    storrsFox.addFamilyMember(hieu);
    storrsFox.addFamilyMember(khoa);
    
    //Residence storrsFoxResidence = new Residence("Flat 1, 5 Lakeview Lane, Mytchett, Camberley, Surrey, GU16 6HA", 2, 375000, "26/07/2022");

  }  
}