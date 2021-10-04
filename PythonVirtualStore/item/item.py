import uuid
import locale

# Set the locale for monetary and English
locale.setlocale(locale.LC_MONETARY, 'en_US')

class Item:
  """
  This class is for creating an item in the virtual store
  """
  def __init__(self, name, category, quantity, price):
    """
    The constructor for the Item class
    
    Parameters:
      name (string): the name of the item
      category (Category): the category of the item
      quantity (int): the quantity of the item
      price (float): the price of the item
    """
    # Generate a random uuid
    self.id = str(uuid.uuid4())
    self.name = name
    self.quantity = quantity
    self.price = locale.currency(price, grouping=True)
    self.category = category
    