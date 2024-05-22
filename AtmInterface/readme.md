# ATM Interface

## Overview
This project is an ATM Interface developed as part of my Codsoft Java Development Internship. The application simulates basic ATM functionalities such as withdrawing, depositing, and checking the balance.

## Features
- User interface for ATM operations.
- Methods for withdrawing, depositing, and checking balance.
- User account management with account balance.
- Input validation to ensure sufficient balance for withdrawals.
- Display appropriate messages based on user actions and transaction outcomes.

## How to Run
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/Codsoft-Internship.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Codsoft-Internship/ATMInterface
    ```
3. Compile the Java files:
    ```bash
    javac ATM.java BankAccount.java
    ```
4. Run the program:
    ```bash
    java ATM
    ```

## Usage
1. The program will prompt you to select an ATM operation: withdraw, deposit, or check balance.
2. Follow the prompts to perform the selected operation.
    - For withdrawals, enter the amount to withdraw. The program will check if the balance is sufficient.
    - For deposits, enter the amount to deposit. The program will update the balance accordingly.
    - For balance checks, the program will display the current account balance.
3. The program will display appropriate messages based on your actions and the outcome of transactions.
4. You can perform multiple transactions in a single session.

## Example
1. Start the program and select "Check Balance":
    - Output: "Your current balance is: $1000"
2. Select "Withdraw" and enter $200:
    - Output: "Transaction successful. Your new balance is: $800"
3. Select "Deposit" and enter $500:
    - Output: "Transaction successful. Your new balance is: $1300"
4. Select "Check Balance" again:
    - Output: "Your current balance is: $1300"

## License
This project is licensed under the MIT License.

## Contact
For any questions or feedback, please contact [Your Name] at [your.email@example.com].

---

Feel free to explore the code and provide any feedback or suggestions!
