public class Car {
  String merk;
  String type;
  int bouwjaar;
  String kleur;
  Double motorinhoud;
  Driver driver;

  // De constructor(s) - ik heb 2 constructor en maak gebruik van constructor-overloading
  // Dat wil dan zeggen dat de zelfde constructor naam toegepast worden maar met een andere signature.
  // Dus andere parameters.
  public Car(String merk, String type, int bouwjaar, String kleur,
             Double motorinhoud) {
    this.merk = merk;
    this.type = type;
    this.bouwjaar = bouwjaar;
    this.kleur = kleur;
    this.motorinhoud = motorinhoud;

  }

  public Car(String merk, String type, int bouwjaar, String kleur,
             Double motorinhoud, Driver driver) {
    this.merk = merk;
    this.type = type;
    this.bouwjaar = bouwjaar;
    this.kleur = kleur;
    this.motorinhoud = motorinhoud;
    this.driver = driver;

  }
  // End of constructors

  // Below are some methods
  public void getDescription() {
    System.out.println("Deze " + merk + " " + type + " is " + kleur);
  }

  public void ownerCar() {
    System.out.println("De " + merk + " " + type + " is  van " + driver
        .getName());
  }

  public String getLicenseOwner() {

    return driver.getLicenseNr();
  }

}
