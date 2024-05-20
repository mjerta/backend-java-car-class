public class Car {
  String merk;
  String type;
  int bouwjaar;
  String kleur;
  Double motorinhoud;
  Driver driver;

  //   de constructor
  public Car(String merk, String type, int bouwjaar, String kleur,
             Double motorinhoud, Driver driver) {
    this.merk = merk;
    this.type = type;
    this.bouwjaar = bouwjaar;
    this.kleur = kleur;
    this.motorinhoud = motorinhoud;
    this.driver = driver;

  }

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
