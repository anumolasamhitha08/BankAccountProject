# Bank Account Management System

## Description
A Java application that models a bank account and prevents overdrafts using a custom exception.

## Features
- Deposit money
- Withdraw money
- Prevent negative balances
- Custom InsufficientFundsException
- Transaction history
- Display current balance

## Technologies Used
- Java
- Object-Oriented Programming
- Exception Handling
- ArrayList

## Project Files
- `BankAccount.java` — manages the balance, deposits, withdrawals, and transactions.
- `Main.java` — demonstrates successful and rejected transactions.

## How to Run
Install the Java JDK and open a terminal in the project folder.

Compile:
`javac BankAccount.java Main.java`

Run:
`java Main`

## Expected Result
The program starts with Rs. 1000, deposits Rs. 500, withdraws Rs. 300, and rejects a withdrawal of Rs. 2000.

The final balance remains Rs. 1200.
