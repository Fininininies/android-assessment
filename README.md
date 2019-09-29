# REFERENCE_ANDROID tests and how to run them

This project contains two build variants:
- original  
- limitless  

The original version of the project contains the app as it was sent to me 
(with minor additions to facilitate testing)
 
The limitless version contains the same app, but with added e-mail functionality for the email  
button.

# how to run  

In terminal, navigate to the root project folder  
then run  

- for original  
./gradlew connectedOriginalDebugAndroidTest  

- for limitless  
./gradlew connectedLimitlessDebugAndroidTest  

- for all tests (original and limitless combined)  
./gradlew connectedAndroidTest  

