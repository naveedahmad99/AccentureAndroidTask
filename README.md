# Weather Logger
Accenture Latvia Android Task

The **Weather logger** application used to can log and save your current Weather data based on your location. 


**Description:**
Create an Android application to save weather conditions for your current location.

**Main functionality:**

The weather information should be retrieved from [Weather API website](https://openweathermap.org/api) select > CurrentWeatherData API. 
By default service returns a lot of data, but it’s mandatory to save and display only **temperature**. 
Usage of other data is optional but creativity is welcome here.

After ‘Save’ is pressed the application should retrieve the weather data from the API, 
store it locally together with the date of the event (request time) and then display it on screen.

Display the data in a list or graphical chart.

Data model is completely up to you, feel free to use custom frameworks and libraries

what might help you with application development.
For Weather API service usage you need to register in the portal and receive an APP KEY. 
Use it in network requests to fetch data.

**Non-functional requirements:**

● Compatibility with Android 4.1 and onwards

● Code quality, readability and consistent code style

● Best UI practices (Material design)

● Local data storage

● Unit test (JUnit/Robolectric)

**Optional Requirements:**

Completion of Optional requirements will grant additional bonus points

● UI layout optimized for both Phone and Tablets screens

● Implement ‘More details’ screen (with ability to view more detailed information
about weather data returned from API)

● Fetching and processing weather data for more locations

● Refresh the weather data periodically

● Ability to access application weather data from 3rd party apps via shared content
provider or other solutions

● Custom animations, transitions between screens

● Create Widget for Home Screen

● All CRUD operations

● UI tests using Espresso

● Use Kotlin instead of Java for MainActivity

______________________________________________________________________________

**Architecture & Libraries & Dependencies** used to do that task:

[MVP](https://antonioleiva.com/mvp-android/) architecture

[Support libraries:](https://developer.android.com/jetpack/androidx/) appcompat / recyclerview / constraintlayout

Square [Retrofit](https://github.com/square/retrofit) / [Okhttp](https://github.com/square/okhttp) / [Logging-Interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor)

A fast dependency injector for Android [Dagger2](https://github.com/google/dagger) 

[RxAndroid](https://github.com/ReactiveX/RxAndroid) Reactive Extensions for Android

[Room DataBase](https://developer.android.com/training/data-storage/room) used to do local storage in the appliction

[Lottie-Android:](https://github.com/airbnb/lottie-android) Render After Effects animations natively on Android

[ButterKnife:](https://github.com/JakeWharton/butterknife) Bind Android views and callbacks to fields and methods.

[Unit test](https://developer.android.com/training/testing/unit-testing) using .

Ui Testing using [Espresso](https://developer.android.com/training/testing/espresso)

[Android Home Widget](https://developer.android.com/guide/topics/appwidgets) 

[google play services](https://developers.google.com/android/guides/setup) location to get current location

________________________________________________________________________________________

**The Following screen shoots for app**

![Home Screen](https://github.com/Mahmoud-zahran/AccentureAndroidTask/blob/master/Screen%20Shot%202019-12-16%20at%208.34.46%20PM.png)
![Details Screen](https://github.com/Mahmoud-zahran/AccentureAndroidTask/blob/master/Screen%20Shot%202019-12-16%20at%208.35.54%20PM.png)
![test and clear](https://github.com/Mahmoud-zahran/AccentureAndroidTask/blob/master/Screen%20Shot%202019-12-16%20at%208.36.19%20PM.png)
![Test screen](https://github.com/Mahmoud-zahran/AccentureAndroidTask/blob/master/Screen%20Shot%202019-12-16%20at%208.36.44%20PM.png)
