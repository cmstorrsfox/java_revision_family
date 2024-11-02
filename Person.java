public class Person {
  protected String forename;
  protected String surname;
  protected int age;
  protected char sex;
  protected Residence residence;

  //main constructor
  public Person(String forename, String surname, int age, char sex) {
    this.forename = forename;
    this.surname = surname;
    this.age = age;
    this.sex = sex;
  }

  //getters
  // get forename
  public String getForename() {
    return forename;
  }

  //get surname
  public String getSurname() {
    return surname;
  }

  //get age
  public int getAge() {
    return age;
  }

  //get sex
  public char getSex() {
    return sex;
  }

  public Residence getResidence() {
    return residence;
  }

  //setters
  //set forename
  public void setForename(String newForename) {
    this.forename = newForename;
  }

  //set forename
  public void setSurname(String newSurname) {
    this.surname = newSurname;
  }

  //set age
  public void setAge(int newAge) {
    this.age = newAge;
  }

  //set sex
  public void setSex(char newSex) {
    this.sex = newSex;
  }

  //set residence
  public void setResidence(Residence newResidence) {
    this.residence = newResidence;
  }

  //methods
  //print person data method
  public void printPersonData() {
    System.out.println("Name: " + this.forename + " " + this.surname);
    System.out.println("Age: " + this.age);
    if (this.residence != null) {
      System.out.println("Current Address: " + this.residence.getAddress());
    } else {
      System.out.println("Current address unknown.");
    }
    if (this.sex == 'M') {
      System.out.println("Sex: Male\n");
    } else {
      System.out.println("Sex: Female\n");
    }
  }
  
  //celebrate birthday (increase age)
  public void celebrateBirthday() {
    int currentAge = this.age;
    currentAge += 1;
    setAge(currentAge);
    System.out.println("Happy Birthday " + this.forename + "! You are " + this.age + " years old today!");
  }
}

