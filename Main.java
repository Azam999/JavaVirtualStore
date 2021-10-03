import java.util.ArrayList;

public class Main {
  /*
    CRUD
    Create - Create things in store
    Read - Get things from store
    Update - Update things in store
    Delete - Delete things in store
  */
  public static void main(String[] args) {
    System.out.println("Welcome to the store");

    ArrayList<Item> items = new ArrayList<Item>();
    items.add(new Item("Ramen", "Food", 3, 19.99));
    items.add(new Item("iPhone", "Electronics", 4872, 799.99));
    items.add(new Item("Harry Potter and the Sorcerer's Stone", "Books", 3947238, 4.99));
    items.add(new Item("NBA 2k21", "Games", 423, 59.99));
    items.add(new Item("Chair", "Home and Furniture", 40284, 105.99));

    for (Item item : items) {
      System.out.println(item.getItem());
    }
  }
}