package coreservlets;

public class Mhs {

  private Nama nama;
  private Alamat alamat;
  private 

  public Mhs(Name name, Company company) {
    this.name = name;
    this.company = company;
  }

  public Name getName() { return(name); }

  public Company getCompany() { return(company); }

  public String processEmployee() {
    if (Math.random() < 0.5) {
      return("accepted");
    } else {
      return("rejected");
    }
  }
}