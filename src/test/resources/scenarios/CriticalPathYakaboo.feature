@CriticalPath
Feature: Yakaboo critical path testing

  Scenario: The user can find,add,delete the product to the shopping cart and completes the order
    Given configure browser
      And the user is on the site Yakaboo
    When  user click on book category in home side bar
      And user click on random category in books category menu
      And user click on random book in book list
      And user click on button add to cart
      And user clicks back in the browser
      And user click on random book in book list
      And user click on button add to cart
      And user click on button buy now
      And user enter personal details in checkout block
      And user chose country,citi and method in delivery method
      And user chose payment method in payment method menu
      And user create comments in comment title
      And user click on button edit products in product list
      And user click on button delete product in checkout product card
      And user click on button confirm the order
    Then  user order was created