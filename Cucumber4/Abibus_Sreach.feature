Feature: AbiBus sreach test

Scenario: Sreach bus avaiables with AbiBus

Given User is on AbiBus Homepage
When User enter the vaild sreach details 
|Chennai|Bangalore|
Then User get the availabilities of bus

