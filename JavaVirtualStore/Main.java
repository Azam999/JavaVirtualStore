import java.util.*;
import java.util.stream.*;
import java.util.UUID;

public class Main {
  /*
   * Create items 
   * Get items 
   * Delete items 
   * Buy items
   */

  static ArrayList<Item> items = new ArrayList<Item>();

  public static void setDefaultItems() {
    items.add(new Item("Ramen", Category.FOOD, 3, 19.99));
    items.add(new Item("iPhone", Category.ELECTRONICS, 4872, 799.99));
    items.add(new Item("Harry Potter and the Sorcerer's Stone", Category.BOOKS, 3947238, 4.99));
    items.add(new Item("NBA 2k21", Category.GAMES, 423, 59.99));
    items.add(new Item("Chair", Category.HOME_AND_FURNITURE, 40284, 105.99));
  }

  public static String createItem(Item item) {
    items.add(item);
    return item.getItem();
  }

  public static String getItemById(UUID id) {
    String itemFound = items.stream().filter(item -> item.getId() == id).collect(Collectors.toList()).get(0).getItem();
    return itemFound;
  }

  public static ArrayList<String> getAllItems() {
    ArrayList<String> updatedItems = new ArrayList<String>();
    items.forEach(item -> updatedItems.add(item.getItem()));
    return updatedItems;
  }

  public static void deleteItem(UUID id) {
    // The id is the index
    items.removeIf(item -> item.getId() == id);
  }

  public static void main(String[] args) {
    System.out.println("Welcome to the store!\n");
    System.out.println("""
        Instructions:
        Create item: c
        Get item: g
        Delete item: d
        Buy item: b
        """);

    // Initialize the store with the default items
    setDefaultItems();

    for (String item : getAllItems()) {
      System.out.println(item);
    }
  }
}