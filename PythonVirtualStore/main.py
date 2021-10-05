from item.category import Category
from item.item import Item
import json

items = []

# Set the default items
def set_default_items():
  items.append(Item("Ramen", Category.FOOD, 3, 19.99))
  items.append(Item("iPhone", Category.ELECTRONICS, 4872, 799.99))
  items.append(Item("Harry Potter and the Sorcerer's Stone", Category.BOOKS, 3947238, 4.99))
  items.append(Item("NBA 2k21", Category.GAMES, 423, 59.99))
  items.append(Item("Chair", Category.HOME_AND_FURNITURE, 40284, 105.99))

# Convert the items to json format
def get_all_items():
  json_items = []
  for item in items:
    json_items.append(json.dumps(item.__dict__))
  return json_items

def get_item_by_id(id):
  for item in items:
    if item.id == id:
      return json.dumps(item.__dict__)

def create_item(name, category, quantity, price):
  items.append(Item(name, category, quantity, price))
  
def delete_item(id):
  for item in items:
    if item.id == id:
      items.remove(item)

set_default_items()
# create_item("Shoe Dog", Category.BOOKS, 432234, 14.99)
# print(get_all_items())

# id = input("Enter id: ")
# delete_item(id)

# print(get_all_items())

# # print(get_item_by_id(id))