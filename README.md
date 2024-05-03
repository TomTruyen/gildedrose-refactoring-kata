# Gilded Rose starting position in Kotlin

Glided Rose Refactoring by Tom Truyen

Way of working:
1. Write Unit Tests for existing code to make sure nothing breaks
2. Looking at code, noticing multiple types of items all with different logic
3. Extract logic to an Item specific class
4. Abstract the code by making an interface/base class to define what an "ItemUpdater" should look like
5. Create a list (enum) of possible item types
6. Create a Factory to create an instace of the correct Item specific class based on the input
7. Write tests for new code
8. Implement new code

### Specify Number of Days

For e.g. 10 days:

```
./gradlew run --args 10
```
