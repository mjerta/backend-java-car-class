public class Driver {

  String naam;
  String rijbewijsNummer;

  public Driver(String naam, String rijbewijsNummer) {
    this.naam = naam;
    this.rijbewijsNummer = rijbewijsNummer;
  }

  public String getName() {
    return naam;
  }

  public String getLicenseNr() {
    return rijbewijsNummer;
  }
}
