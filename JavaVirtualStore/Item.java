import java.text.NumberFormat;
import java.util.Locale;
import java.util.UUID;

public class Item {
  private UUID id;
  private String name;
  private int quantity;
  private double price;
  private Category category;

  Item(String name, Category category, int quantity, double price) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.category = category;
  }

  // ========================= GETTERS AND SETTERS =========================
  public UUID getId() {
    return this.id;
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

  public Category getCategory() {
    return this.category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  // Returns the item with the format
  public String getFormattedItem(boolean compact) {
    String item;
    if (compact) {
      item = String.format("%s | %s | %s | %d | %s", this.id, this.name, this.category, this.quantity, this.getPrice());
    } else {
      item = String.format("""
        {
            id: %s,
            name: %s,
            category: %s,
            quantity: %d,
            price: %s
        }
        """, this.id, this.name, this.category, this.quantity, this.getPrice());
    }
    return item;
  }
}
