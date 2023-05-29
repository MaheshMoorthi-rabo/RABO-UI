@onlythis
Feature: RABO Breakdown Reporting No-Login Journey


  Scenario: No login Journey for the Breakdown Reporting
    Given I am in App main site
    And I click the "btnacceptCookies" on the "RABO_SafetyHomePage"
    And I click the "btnContinue" on the "RABO_SafetyHomePage"
    And I click the "btnReportaBreakdown" on the "RABO_SafetyAdvicePage"
    And I click the "btnPostCode" on the "RABO_LocationPage"
    And I enter the value "RG214EB" into the "txtpostCode" on the "RABO_VehicleAddressPage"
    And I click the "btnFindAddress" on the "RABO_VehicleAddressPage"
    When I wait "3" seconds to synchronize the things on app
    And I select the "selectByText" option type with value "Balfour Beatty Ltd" from the "ddSelectAnAddress" dropdown menu on the "RABO_VehicleAddressConfirmationPage"
    And I click the "btnUseThisAddress" on the "RABO_VehicleAddressConfirmationPage"
    And I click the "btnYes" on the "RABO_Map_LocationPage"
    And I enter the value "AF60JVW" into the "txtVRN" on the "RABO_VehicleDetailsPage"
    And I click the "btnConfirmNumberPlate" on the "RABO_VehicleDetailsPage"
    When I click the "btnYes" on the "RABO_VehicleDetailsConfirmationPage"
    And I verify that the field "txtProblemQuery" should be visible on the "RABO_IssuePage"



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