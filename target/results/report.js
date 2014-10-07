$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/tvh/test/features/plantsManagement.feature");
formatter.feature({
  "id": "plants-management",
  "description": "In this suite will be covers a smoke  functional tests defined for Plant  page as an admin user",
  "name": "Plants Management",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "plants-management;test-functionality-from-plants--page-as-an-admin",
  "tags": [
    {
      "name": "@plantsPage",
      "line": 6
    }
  ],
  "description": "",
  "name": "Test functionality from Plants  page as an admin",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "Open WFM as an admin user in order to test Plants  page",
  "keyword": "Given ",
  "line": 9
});
formatter.step({
  "name": "i will create a new plant",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "i will search for the new created plant",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "i will search for a not created plant",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "i will go to edit move time with valid data",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "i will edit move time with invalid data",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "i will go back and i will reset the filter",
  "keyword": "Then ",
  "line": 15
});
formatter.step({
  "name": "i will assign a company to a plant",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "i will try to assign the same company again",
  "keyword": "Then ",
  "line": 17
});
formatter.step({
  "name": "i will removed assigned company",
  "keyword": "And ",
  "line": 18
});
formatter.match({
  "location": "PlantsPage.Open_WFM_as_an_admin_user_in_order_to_test_Plants_page()"
});
formatter.result({
  "duration": 3349726088,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_create_a_new_plant()"
});
formatter.result({
  "duration": 82573,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_search_for_the_new_created_plant()"
});
formatter.result({
  "duration": 83505,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_search_for_a_not_created_plant()"
});
formatter.result({
  "duration": 108697,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_go_to_edit_move_time_with_valid_data()"
});
formatter.result({
  "duration": 90503,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_edit_move_time_with_invalid_data()"
});
formatter.result({
  "duration": 87704,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_go_back_and_i_will_reset_the_filter()"
});
formatter.result({
  "duration": 113362,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_assign_a_company_to_a_plant()"
});
formatter.result({
  "duration": 76975,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_try_to_assign_the_same_company_again()"
});
formatter.result({
  "duration": 71377,
  "status": "passed"
});
formatter.match({
  "location": "PlantsPage.i_will_removed_assigned_company()"
});
formatter.result({
  "duration": 71843,
  "status": "passed"
});
});