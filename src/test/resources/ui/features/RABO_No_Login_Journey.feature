@onlythis
Feature:RABO Breakdown Reporting No-Login Journey
Background:
  Given I am in App main site
  And I click the "btnacceptCookies" on the "RABO_SafetyAdvicePage"
  And I click the "btnReportBreakdown" on the "RABO_SafetyAdvicePage"


  Scenario: verify the error message is displayed for find Address without postcode
    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value " " into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    When I wait "3" seconds to synchronize the things on app
    Then I verify that the text "Check your postcode." matches the text of the "postcodeerror" field on the "RABO_VehicleAddressPage"

  Scenario: verify the partial breakdown report when user not sure with the address and vehicle number
    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value "RG214EB" into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    When I wait "2" seconds to synchronize the things on app
    And I click the "btnAddressisNotListed" on the "RABO_VehicleAddressConfirmationPage"
    And I click the "dontKnowTheNumberPlate" on the "RABO_VehicleDetailsPage"
    And I click the "radioNotaMember" on the "RABO_CoverPage"
    And I click the "radioMr" on the "RABO_CoverPage"
    And I enter the value "Mahesh " into the "txtFirstName" on the "RABO_CoverPage"
    And I enter the value "Tester " into the "txtLastName" on the "RABO_CoverPage"
    And I enter the value "09999999999" into the "txtPhoneNum" on the "RABO_CoverPage"
    And I click the "btnSubmit" on the "RABO_CoverPage"
    When I wait "2" seconds to synchronize the things on app
    And I verify that the "btnCallUs" displayed on the "RABO_callUsPage"

  Scenario: verify the partial breakdown report when user not sure with  vehicle number
    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value "RG214EB" into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    When I wait "2" seconds to synchronize the things on app
    And I select the "selectByText" option type with value "Balfour Beatty Ltd" from the "ddSelectAnAddress" dropdown menu on the "RABO_VehicleAddressConfirmationPage"
    And I click the "btnUseThisAddress" on the "RABO_VehicleAddressConfirmationPage"
    And I click the "btnYes" on the "RABO_Map_LocationPage"
    And I click the "dontKnowTheNumberPlate" on the "RABO_VehicleDetailsPage"
    And I click the "radioNotaMember" on the "RABO_CoverPage"
    And I click the "radioMr" on the "RABO_CoverPage"
    And I enter the value "Mahesh " into the "txtFirstName" on the "RABO_CoverPage"
    And I enter the value "Tester " into the "txtLastName" on the "RABO_CoverPage"
    And I enter the value "09999999999" into the "txtPhoneNum" on the "RABO_CoverPage"
    And I click the "btnSubmit" on the "RABO_CoverPage"
    When I wait "2" seconds to synchronize the things on app
    And I verify that the "btnCallUs" displayed on the "RABO_callUsPage"

  Scenario: Verify the AA logo redirection
    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value "RG214EB" into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    When I wait "2" seconds to synchronize the things on app
    And I click the "btnAddressisNotListed" on the "RABO_VehicleAddressConfirmationPage"
    And I click the "dontKnowTheNumberPlate" on the "RABO_VehicleDetailsPage"
    And I click the "AALogo" on the "RABO_CoverPage"
    And I wait "2" seconds to synchronize the things on app
    Then I verify the driver is redirected to the URL "https://www-uat.theaa.digital/"

  Scenario: Verify the user reaching the call us page when user is entered wrong post code and confirmed the same
    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value "AB124CD" into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    And I click the "btnYes" on the "RABO_PostcodeConfirmationPage"
    When I wait "2" seconds to synchronize the things on app
    And I verify that the "btnCallUs" displayed on the "RABO_callUsPage"

  Scenario: Verify the user able to Re-Enter the Postcode when user is entered wrong post code and click NO at confirmation page
    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value "AB124CD" into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    And I click the "btnNo" on the "RABO_PostcodeConfirmationPage"
    And I wait "2" seconds to synchronize the things on app
    Then I verify that the field "btnFindAddress" is visible on the "RABO_VehicleAddressPage"

  Scenario: Verify the user can reach the Callus page When they choose the I have had an accident in problem page
    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value "RG214EB" into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    When I wait "2" seconds to synchronize the things on app
    And I select the "selectByText" option type with value "Balfour Beatty Ltd" from the "ddSelectAnAddress" dropdown menu on the "RABO_VehicleAddressConfirmationPage"
    And I click the "btnUseThisAddress" on the "RABO_VehicleAddressConfirmationPage"
    And I click the "btnYes" on the "RABO_Map_LocationPage"
    And I enter the value "HJ63JXL" into the "txtVRN" on the "RABO_VehicleDetailsPage"
    And I click the "btnConfirmNumberPlate" on the "RABO_VehicleDetailsPage"
    And I click the "btnYes" on the "RABO_VehicleDetailsConfirmationPage"
    And I click the "btnAccident" on the "RABO_ProblemPage"
    Then I verify that the "btnCallUs" displayed on the "RABO_callUsPage"

  Scenario: Verify the Back navigation at cover page
    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value "RG214EB" into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    When I wait "2" seconds to synchronize the things on app
    And I select the "selectByText" option type with value "Balfour Beatty Ltd" from the "ddSelectAnAddress" dropdown menu on the "RABO_VehicleAddressConfirmationPage"
    And I click the "btnUseThisAddress" on the "RABO_VehicleAddressConfirmationPage"
    And I click the "btnYes" on the "RABO_Map_LocationPage"
    And I enter the value "HJ63JXL" into the "txtVRN" on the "RABO_VehicleDetailsPage"
    And I click the "btnConfirmNumberPlate" on the "RABO_VehicleDetailsPage"
    And I click the "btnYes" on the "RABO_VehicleDetailsConfirmationPage"
    And I click the "btnFlatbattery" on the "RABO_ProblemPage"
    And I click the "radioNotaMember" on the "RABO_CoverPage"
    And I click the "radioMr" on the "RABO_CoverPage"
    And I enter the value "Mahesh " into the "txtFirstName" on the "RABO_CoverPage"
    And I enter the value "Tester " into the "txtLastName" on the "RABO_CoverPage"
    And I enter the value "09999999999" into the "txtPhoneNum" on the "RABO_CoverPage"
    When I wait "1" seconds to synchronize the things on app
    And user is Navigating back to previous page
    And I click the "btnFlatbattery" on the "RABO_ProblemPage"








#  Scenario: verify the partial breakdown report when user  sure with  vehicle number
#    And I click the "btnNo" on the "RABO_SafetyQuestionPage"
#    And I click the "btnPostCode" on the "RABO_LocationPage"
#    And I enter the value "RG214EB" into the "txtpostCode" on the "RABO_VehicleAddressPage"
#    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
#    When I wait "2" seconds to synchronize the things on app
#    And I select the "selectByText" option type with value "Balfour Beatty Ltd" from the "ddSelectAnAddress" dropdown menu on the "RABO_VehicleAddressConfirmationPage"
#    And I click the "btnUseThisAddress" on the "RABO_VehicleAddressConfirmationPage"
#    And I click the "dontKnowTheNumberPlate" on the "RABO_VehicleDetailsPage"
#    And I click the "radioNotaMember" on the "RABO_CoverPage"

#  Scenario: verify the partial breakdown report when user  sure with  expired policy
#    When I wait "3" seconds to synchronize the things on app
#    And I select the "selectByText" option type with value "Balfour Beatty Ltd" from the "ddSelectAnAddress" dropdown menu on the "RABO_VehicleAddressConfirmationPage"
#    And I click the "btnUseThisAddress" on the "RABO_VehicleAddressConfirmationPage"
#    And I click the "btnYes" on the "RABO_Map_LocationPage"
#    And I enter the value "AF60JVW" into the "txtVRN" on the "RABO_VehicleDetailsPage"
#    And I click the "btnConfirmNumberPlate" on the "RABO_VehicleDetailsPage"
#    When I click the "btnYes" on the "RABO_VehicleDetailsConfirmationPage"
    #And I verify that the field "txtProblemQuery" should be visible on the "RABO_IssuePage"

#  Scenario: verify the partial breakdown report when user has active policy
#    And I verify that the text: "Problem" partially matches the current page title
#    And I click the "vehicleCover" on the "CoverPage"
#    And I click the "continueButton" on the "CoverPage"
#
#    And I click the "atHome" on the "OptionPage"
#    And I click the "continueButton" on the "CoverPage"
#
#    And I enter the value "J4J HS" into the "numberPlate" on the "DetailsPage"
#    And I click the "findYourVehicle" on the "DetailsPage"
#    And I click the "confirmButton" on the "DetailsPage"
#    And I click the "selectTitle" on the "DetailsPage"
#    And I enter the value "John" into the "firstName" on the "DetailsPage"