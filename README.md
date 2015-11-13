Sample mtgjson.com Java Parser
=========================

This is a simple [Spring Boot](http://projects.spring.io/spring-boot/) based parser for [mtgjson.com](http://mtgjson.com) format files. This project provides an example of using the [Jackson JSON parser](https://github.com/FasterXML/jackson) to deserialize mtgjson.com data into Java objects in an efficient and easy to do manner.

Feel free to use any of this code in your own project. The model classes cover every field in the JSON data using sensible types; nested types such as rulings or legalities are implemented as child objects. In your own project, if there are any fields you don't want use remove them from the model classes and add `@JsonIngoreProperties(ignoreUnknown = true)`.

Advanced usage would be deserializing certain fields like color or border into enums or using polymorphic deserialization based on a field like types.