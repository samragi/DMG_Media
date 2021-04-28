Feature:A user can buy book online accommodation

 Scenario: user a can book an accommodation when the user is on the mail travel site
    Given the user visits mail travel site homepage
    When the user enters "India" in the search text box
    And the use clicks on the search button
    Then the user can see the tour search page
    When the user clicks on More Info on the first result page
    Then the user can see mail travel page with the details of the tour selected
    Then the user can see "10" days from message on the page
    Then the user can see "£990*" price messsage on the the page
    Then the user can see the telephone number on the page
    When the user clicks on Book Online button
    Then the user see the highlighted date selected in the calender with default values
    When the user selects Standard Room dropdown options
    And the user clicks on the Select your room and continue button
    When the user clicks on Continue without Extras button
    When the user enters first passenger details "Mrs" "test1" "user1" "2" "January" "2005"
    When the user enters second passenger details "Mr" "test2" "user2" "1" "March" "2001"
    When the user enters the lead contact details
    |phoneNumber        | 9999999999                     |
    |email              | test@test.com                  |
    |address            | Test Street                    |
    |city               | London                         |
    When the user clicks on the continue button
    Then the user can see the payment amount as per the accommodation selected




