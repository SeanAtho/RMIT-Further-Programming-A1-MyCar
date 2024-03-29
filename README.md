# Assignment 1: Online Booking System for Vehicle Rentals 
## Algorithm
1.	Read the CSV file and store the vehicle data into an appropriate data structure, such as an ArrayList of objects.
2.	Display the main menu with the following options: a. Search by Brand b. Browse by vehicle type c. Filter by number of passengers d. Exit
3.	If the user selects "Search by Brand," prompt the user to enter the brand name and display all the vehicles matching the brand name.
4.	If the user selects "Browse by vehicle type," display a list of all vehicle types and prompt the user to select a vehicle type. Then display all the vehicles matching the selected type.
5.	If the user selects "Filter by number of passengers," prompt the user to enter the number of passengers and display all the vehicles that can carry at least that many passengers.
6.	Once the user selects a vehicle, prompt the user to provide pick-up and return dates.
7.	Calculate the total rental price without discount for the period of rental with price breakdown (i.e., rental per day * number of days), total rental price with discount for the period of rental with price breakdown (i.e., discounted price per day * number of days), total insurance with fee breakdown (i.e., insurance per day * number of days), total service fee, and the final total payment using the formula provided in the problem statement.
8.	Print the information of the selected vehicle, including the ID of the vehicle, brand, model, type of vehicle, year of manufacture, no. of seats, color, and the calculated rental, insurance, and service fees.
9.	Prompt the user to reserve the vehicle or go back to the main menu.
10.	If the user chooses to reserve, prompt the user to provide personal information, including the given name, surname, email address, and number of passengers for the rental.
11.	Prompt the user to confirm and pay.
12.	Print the reservation details and exit the program.


## Overview of what each class in the current design does:
The current classes in the provided program are:

    Car - Represents a single car object with properties such as brand, model, type of vehicle, year of manufacture, number of seats, and color.
    Inventory - Maintains a list of all the cars in the fleet, allowing for operations such as searching and filtering based on various criteria.
    Rental - Represents a rental object that contains details such as the car being rented, rental duration, rental fee, insurance fee, and any discounts applied.
    Customer - Represents a customer object with personal details such as name, email, and number of passengers.
    ConsoleUI - Handles the user interface and allows users to interact with the program through the console.
    Main - Acts as the entry point of the program.
    MyCarApp - Acts as the controller, orchestrating interactions between the model (Inventory, Rental, Customer) and view (ConsoleUI) classes, and implementing program logic such as searching, filtering, and rental booking.

## RMIT University | Academic Integrity Warning


![image](https://user-images.githubusercontent.com/79836947/160737604-273c62fd-1503-4ce6-a292-a351665cc2e1.png#gh-dark-mode-only)
![image](https://user-images.githubusercontent.com/79836947/160738358-eaa88731-2a44-4004-ab9a-3d83a2268742.png#gh-light-mode-only)

Cheating is a serious offense:

> "What happens if you get caught cheating at RMIT? For serious breaches of academic integrity, students can be charged with academic misconduct. Possible penalties > include cancellation of results and expulsion resulting in the cancellation of a student's program."

Academic integrity - RMIT University

### Links:

 [RMIT Academic Integrity Awarness Micro Credential](https://www.rmit.edu.au/study-with-us/levels-of-study/short-courses/academic-integrity-awareness)
 
 [Academic Integrity at RMIT](https://www.rmit.edu.au/students/my-course/assessment-results/academic-integrity)
