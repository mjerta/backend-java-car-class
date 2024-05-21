public class Main {
  public static void main(String[] args) {
    Driver driver = new Driver("Maarten", "NRX021827");

    // bewlo is just to make the test work.
    Car fiat = new Car("Fiat", "500", 2019, "groen", 1.4);
    Car toyota = new Car("Toyota", "Aygo", 2016, "blauw", 1.2);
    Car volvo = new Car("Volvo", "CX90", 2022, "zwart", 2.0);

    toyota.getDescription();
    fiat.getDescription();
    volvo.getDescription();
//    Car fiat = new Car("Fiat", "500", 2019, "groen", 1.4, driver);
//    Car toyota = new Car("Toyota", "Aygo", 2016, "blauw", 1.2, driver);
//    Car volvo = new Car("Volvo", "CX90", 2022, "zwart", 2.0, driver);
//
//
//    fiat.ownerCar();
//    toyota.ownerCar();
//    System.out.println("the license numbers that belongs to the " + toyota.merk + " is " + toyota.getLicenseOwner());
  }
}

