package pl.sda.poznan.shop.model;

/**
 * Model class for representing User
 */
public class User {

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String password;

  public User() {
  }

  public User(String firstName, String lastName, String email, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }
}
