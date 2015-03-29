# gitio-java-api

Java API to access the [Git.io](http://git.io) service.

### Example Usage

```java
URL url = new URL("https://github.com/github/hubot");
URL shorten = GitIO.shorten(url); // Actual API call
System.out.println(shorten); // Will print http://git.io/lBXqpA
```
