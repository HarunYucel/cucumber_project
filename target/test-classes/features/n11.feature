Feature: Product search on e-commerce site


  @hy
Scenario Outline: n11 functional tests

Given Goes to page n11
Then  Types "<products>" into the search engine and searches
And  Verifies that search results contain "<products>"


Examples:
  |products|
  | Dyson |
  | Robot |
  | Arnica|




