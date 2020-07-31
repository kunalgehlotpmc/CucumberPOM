$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Home page tests",
  "description": "",
  "id": "home-page-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Execute homepage test cases",
  "description": "",
  "id": "home-page-tests;execute-homepage-test-cases",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is at home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Banner is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Contact us link is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Login link is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user quits browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepagestep.user_at_homepage()"
});
formatter.result({
  "duration": 21924321500,
  "status": "passed"
});
formatter.match({
  "location": "Homepagestep.banner_is_displayed()"
});
formatter.result({
  "duration": 130316200,
  "status": "passed"
});
formatter.match({
  "location": "Homepagestep.contact_us_is_displayed()"
});
formatter.result({
  "duration": 37748300,
  "status": "passed"
});
formatter.match({
  "location": "Homepagestep.login_link()"
});
formatter.result({
  "duration": 44183900,
  "status": "passed"
});
formatter.match({
  "location": "Homepagestep.user_quits_browser()"
});
formatter.result({
  "duration": 1364554500,
  "status": "passed"
});
});