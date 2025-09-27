# Online-Reservation-System
# Online Reservation System

A simple console-based train reservation system built in Java that allows users to login, make reservations, and cancel bookings.


https://github.com/user-attachments/assets/761bef9d-f9cd-4184-8056-fcac6529a419


## Table of Contents
- Objective
- Features
- Steps Performed
- Tools Used
- How to Run
- Usage
- Code Structure
- Outcome
- Future Enhancements

## Objective

The Online Reservation System is designed to facilitate train ticket reservations for users. It provides a simple and efficient way for users to manage their travel plans through a console-based interface, allowing them to log in, make reservations, and cancel them as needed.

## Features

- **User Authentication**: Secure login system with username and password
- **Make Reservations**: Create new train reservations with complete journey details
- **Cancel Reservations**: Cancel existing reservations using PNR number
- **Session Management**: User logout functionality
- **Data Management**: In-memory storage for users and reservations

## Steps Performed

1. **User Management System**
   - Created a `User` class to handle user credentials (username and password)
   - Implemented user authentication mechanism

2. **Reservation Management System**
   - Developed a `Reservation` class to store reservation details:
     - PNR number
     - Train information (number and name)
     - Class type
     - Journey date
     - Travel route (from and to destinations)

3. **User Interface Development**
   - Implemented console-based user interface
   - Created menu-driven navigation system
   - Added input validation and error handling

4. **Data Storage Implementation**
   - Utilized `HashMap` for efficient data storage and retrieval
   - Implemented separate storage for users and reservations

## Tools Used

- **Java SE**: Primary programming language
- **Java Collections Framework**: `HashMap` for data storage
- **Scanner Class**: For reading user input from console
- **Object-Oriented Programming**: Classes and objects for code organization

## How to Run

1. **Prerequisites**
   - Java Development Kit (JDK) 8 or higher
   - Any Java IDE or text editor

2. **Compilation**
   ```bash
   javac OnlineReservationSystem.java

### Usage

## Default Users
The system comes with pre-configured test users:
-Username: user1, Password: password1
-Username: user2, Password: password2

## System Navigation
-Login: Enter username and password
-Make Reservation: Provide all required journey details
-Cancel Reservation: Enter PNR number to cancel
-Logout: Return to main menu

## Sample Workflow

Welcome to the Online Reservation System
1. Login
2. Exit
> 1

Enter username: user1
Enter password: password1
Login successful!

1. Make a Reservation
2. Cancel a Reservation
3. Logout
> 1

Enter PNR number: PNR001
Enter Train Number: 12345
Enter Train Name: Express Train
Enter Class Type: AC
Enter Date of Journey (YYYY-MM-DD): 2024-12-25
From (Place): New York
To (Destination): Washington
Reservation made successfully!

### Code Structure

OnlineReservationSystem/
├── OnlineReservationSystem.java
├── User.java (inner class)
├── Reservation.java (inner class)
└── README.md
## Classes Overview
-User: Stores user credentials
-Reservation: Contains all reservation details
-OnlineReservationSystem: Main class with system logic

### Outcome

The Online Reservation System successfully provides:
- User Authentication: Secure login mechanism
- Reservation Creation: Complete booking functionality
- Reservation Cancellation: PNR-based cancellation
- Session Management: Proper login/logout flow
- Data Management: Efficient storage and retrieval
- User-Friendly Interface: Simple console navigation

### Future Enhancements

## Short-term Improvements

[ ] User Registration: Allow new users to create accounts
[ ] Input Validation: Enhanced validation for dates and PNR formats
[ ] View Reservations: Display all user reservations
[ ] Password Encryption: Secure password storage

## Medium-term Features

[ ] Database Integration: Replace HashMap with SQL database (MySQL/PostgreSQL)
[ ] Train Schedule Management: Add available trains and schedules
[ ] Seat Selection: Implement seat booking and availability
[ ] Ticket Pricing: Dynamic pricing based on class and distance

## Long-term Vision

[ ] Web Interface: Convert to web-based application
[ ] Payment Gateway: Integrate payment processing
[ ] Email Notifications: Automated booking confirmations
[ ] Mobile App: React Native or Flutter mobile application
[ ] Admin Panel: Administrative interface for system management
[ ] Real-time Updates: Live train status and delays
[ ] Multi-language Support: Internationalization features
