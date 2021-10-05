from item.category import Category
from item.item import Item
import json

items = []
items_bought = []

# Set the default items
def set_default_items():
  items.append(Item("Ramen", Category.FOOD, 3, 19.99))
  items.append(Item("iPhone", Category.ELECTRONICS, 4872, 799.99))
  items.append(Item("Harry Potter and the Sorcerer's Stone", Category.BOOKS, 3947238, 4.99))
  items.append(Item("NBA 2k21", Category.GAMES, 423, 59.99))
  items.append(Item("Chair", Category.HOME_AND_FURNITURE, 40284, 105.99))

# Convert the items to json format
def get_all_items(list_name, inJson):
  json_items = []
  for item in list_name:
    json_items.append(json.dumps(item.__dict__))
  if (inJson):
    return json_items
  return items

def get_item_by_id(list_name, id, inJson):
  for item in list_name:
    if item.id == id:
      if (inJson):
        return json.dumps(item.__dict__)
      return item

def create_item(name, category, quantity, price):
  items.append(Item(name, category, quantity, price))
  
def delete_item(id):
  for item in items:
    if item.id == id:
      items.remove(item)

def buy_item(id):
  for item in items:
    if item.id == id:
      item.quantity -= 1
  items_bought.append(get_item_by_id(items, id, False))


# Buy item
set_default_items()
print(f"All items: {get_all_items(items, True)}")
item_to_buy_id = input("Item id: ")
buy_item(item_to_buy_id)
print(f"Items bought: {get_all_items(items_bought, True)}")
print(f"All items: {get_all_items(items, True)}")
# create_item("Shoe Dog", Category.BOOKS, 432234, 14.99)
# print(get_all_items())

# id = input("Enter id: ")
# delete_item(id)

# print(get_all_items())

# # print(get_item_by_id(id))