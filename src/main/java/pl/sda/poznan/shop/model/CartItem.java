package pl.sda.poznan.shop.model;

// 1 - usunac produkt - i stworzyc 3 pola -> name, desc, unitprice
// 2 - stworzyc klase wewnetrzna public static class CartItemBuilder
// 3 - utworzyc pola o takiej samej nawie
//
/*
public CartItemBuilder name(String name){
    this.name = name;
    return this;

    }*/

// 5. Utworzyc metode build zwracajaca finalny obiekt
// 6. Utworzyc metode statyczna fabrykujaca tworzaca builder
/*public static CartItemBuilder builder(){
    return new CartItemBuilder();
    }*/
public class CartItem {

  private String name;
  private String description;
  private double unitPrice;
  private int quantity;

  public CartItem() {
  }

  private CartItem(String name, String description, double unitPrice, int quantity) {
    this.name = name;
    this.description = description;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public static CartItemBuilder builder() {
    return new CartItemBuilder();
  }
  public static class CartItemBuilder {

    private String name;
    private String description;
    private double unitPrice;
    private int quantity;

    public CartItemBuilder name(String name) {
      this.name = name;
      return this;
    }

    public CartItemBuilder description(String description) {
      this.description = description;
      return this;
    }

    // dla dwoch pol
    public CartItemBuilder unitPrice(Double unitPrice) {
      this.unitPrice = unitPrice;
      return this;
    }

    public CartItem build() {
      return new CartItem(this.name, this.description, this.unitPrice, this.quantity);
    }
  }

}
