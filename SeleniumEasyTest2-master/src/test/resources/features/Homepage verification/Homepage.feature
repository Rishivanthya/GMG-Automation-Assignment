Feature: Date Pickers
  Bootstrap Date Pickers Example

  Background:
    Given Click on URL and verify whether page is loaded successfully

#Tasks

  Scenario Outline: Verify website
  When click on Men Menu and it should land on Mens page
  And click SHOP ALL button
  Then Click on any product from PLP
  Then Click on Colour
  And Add the product to Bag
  Then Validate the "<product>" is added to the Cart
  And Select the Size 
  
  
  
 

    Examples:
      | product |
      | Men's React Miler 2 Shoe  | 
    
