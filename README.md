# Instructions
1. Fork this repo into your own github account
2. Complete the task
3. Commit your code to your fork (we want to be able to see your source code!)
4. Submit a publicly viewable link to your forked repo in the application form
5. If you have any comments or assumptions, add them to this README.md file

# Task
Create an app that has one button. When the button is pressed, the current temperature in Houston Texas is shown in a text field. By current temperature, we mean the temperature when we run your app.

# Your comments or assumptions
- Took the result of the first weather station from JSON data from openweather
- Assumed that temperature in kelvin would be fine 
- Assumed openweather would be up
- Assumed within free tier limit of this API usage
- Assumed that my API key would be used for only good purporses

# Improvements
- testing should be added
- decoupling & modularizing 
- refactoring for reusability
- can take average of all weather stations to find average weather across Houston, Texas
- ensure API threshold is not crossed within 1 minute
