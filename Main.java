import java.util.ArrayList;

public class Main {
  /*
    CRUD
    Create - Create things in store
    Read - Get things from store
    Update - Update things in store
    Delete - Delete things in store
  */
  

  static ArrayList<Item> items = new ArrayList<Item>();

  public static void setDefaultItems() {
    items.add(new Item(1, "Ramen", Category.FOOD, 3, 19.99));
    items.add(new Item(2, "iPhone", Category.ELECTRONICS, 4872, 799.99));
    items.add(new Item(3, "Harry Potter and the Sorcerer's Stone", Category.BOOKS, 3947238, 4.99));
    items.add(new Item(4, "NBA 2k21", Category.GAMES, 423, 59.99));
    items.add(new Item(5, "Chair", Category.HOME_AND_FURNITURE, 40284, 105.99));
  }

  public static void createItem(Item item) {
    
  }

  public static void getItem(int id) {

  }

  public static void getAllItems() {

  }

  public static void updateItem(int id) {

  }

  public static void deleteItem(int id) {

  }
  
  public static void main(String[] args) {
    System.out.println("Welcome to the store!\n");
    System.out.println(
    """
    Instructions:
    Create item: c
    Read/Get item: r
    Update item: u
    Delete item: d
    """
    );

    for (Item item : items) {
      System.out.println(item.getItem());
    }
  }
}