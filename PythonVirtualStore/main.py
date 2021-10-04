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
def items_in_json():
  json_items = []
  for item in items:
    json_items.append(json.dumps(item.__dict__))
  return json_items

set_default_items()
print(items_in_json())