$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/VINOTH KUMAR/eclipse-workspace/Cucumber4/Abibus_Sreach.feature");
formatter.feature({
  "name": "AbiBus sreach test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sreach bus avaiables with AbiBus",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on AbiBus Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AbiBus_Sreach.user_is_on_AbiBus_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the vaild sreach details",
  "rows": [
    {
      "cells": [
        "Chennai",
        "Bangalore"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AbiBus_Sreach.user_enter_the_vaild_sreach_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get the availabilities of bus",
  "keyword": "Then "
});
formatter.match({
  "location": "AbiBus_Sreach.user_get_the_availabilities_of_bus()"
});
formatter.result({
  "status": "passed"
});
});