Feature: CostChecker

  Scenario: Knowing what help I can get with my NHS costs
    Given User Launches chrome browser
    When User opens URL "https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"
    And User click the start button
    Then page title should be Which country do you live in?
    When user select Wales and click on the Next button
    Then page title should be What is your date of birth?
    When user enters date of birth and click on Next
    Then page title should be Do you live with a partner?
    When user select No and click on Next
    Then page title should be Do you claim any benefits or tax credits?
    When user select No and user click next
    Then page title should be Are you pregnant or have you given birth in the last 12 months?

    When User select No and the user clicks Next
    Then page title should be Do you have an injury or illness caused by serving in the armed forces


    And User select No and click Yes
    Then page title should be Do you have diabetes?
    When the user clicks No and user clicks next button
    Then page title should be Do you have glaucoma?
    When user clicks No and also click Next

    Then page title should be Do you live permanently in a care home?
    When the user selects no and click Next
    Then page should contain Do you have more
    When the user select No and click next
    Then user can view the message "Based on what you've told us"
    And close browser
