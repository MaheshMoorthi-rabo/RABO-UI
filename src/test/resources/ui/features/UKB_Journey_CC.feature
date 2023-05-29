Feature: UK Breakdown Journey


  Scenario:UK Breakdown Journey with National Recovery using Credit Card
    Given I am in App main site
    And I click the "acceptCokies" on the "CoverPage"
    And I click the "vehicleCover" on the "CoverPage"
    And I click the "continueButton" on the "CoverPage"

    And I click the "nationalRecovery" on the "OptionPage"
    And I click the "continueButton" on the "CoverPage"

    And I enter the value "J4J HS" into the "numberPlate" on the "DetailsPage"
    And I click the "findYourVehicle" on the "DetailsPage"
    And I click the "confirmButton" on the "DetailsPage"
    And I click the "selectTitle" on the "DetailsPage"
    And I enter the value "John" into the "firstName" on the "DetailsPage"
    And I enter the value "Adams" into the "lastName" on the "DetailsPage"
    And I enter the value "12" into the "birthDay" on the "DetailsPage"
    And I enter the value "2" into the "birthMonth" on the "DetailsPage"
    And I enter the value "1990" into the "birthYear" on the "DetailsPage"

    And I enter the value "RG21 4EA" into the "postCode" on the "DetailsPage"
    And I click the "findYourAddress" on the "DetailsPage"
    And I enter the value "09876543210" into the "phoneNumber" on the "DetailsPage"
    And I enter the value "usertest@thaa.com" into the "Email" on the "DetailsPage"
    And I click the "paymentYearly" on the "DetailsPage"
    And I click the "creditDebitCardRadioBtn" on the "DetailsPage"
    And I click the "continueButton" on the "CoverPage"

    When I wait "5" seconds to synchronize the things on app
    And I switch to the "iframePaymentPage" frame on the "PaymentPage"
    When I wait "2" seconds to synchronize the things on app
    And I switch to the "iframeCreditCard" frame on the "PaymentPage"
    And I enter the value "4222000006285344" into the "cardNumber" on the "PaymentPage"
    And I enter the value "0224" into the "cardExpiry" on the "PaymentPage"
    And I enter the value "233" into the "cardCVV" on the "PaymentPage"
    And I enter the value "TestingAA" into the "nameOnCard" on the "PaymentPage"
    When I wait "2" seconds to synchronize the things on app
    And I click the "payNowButton" on the "PaymentPage"

    Given I switch to main content of the page
    Given I switch to main content of the page
    When I wait "10" seconds to synchronize the things on app
		#And I wait element "confirmationPageText" to be visible on the "ConfirmationPage"
    When I print all the values of "membershipNumber" on the "ConfirmationPage" page
    When I print all the values of "priceOnConfimationPage" on the "ConfirmationPage" page
		
		
		
		