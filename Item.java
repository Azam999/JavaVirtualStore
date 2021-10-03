import java.text.NumberFormat;
import java.util.Locale;

public class Item {
  private String name;
  private int quantity;
  private double price;
  private String category;

  Item(String name, String category, int quantity, double price) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.category = category;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getPrice() {
    Locale locale = new Locale("en", "US");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    String formattedPrice = currencyFormatter.format(this.price);

    return formattedPrice;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getItem() {
    String item = String.format("%s | %s | %d | %s", this.name, this.category, this.quantity, this.getPrice());
    return item;
  }
}
