# Java Training project V1.2

### Used functionalities
- Interface
- Enumeration
- Abstract types (E)

### Description
- We manage a bank where customers have accounts.
- The bank has a bancomat and an E-banking
- They can create an account, add money on it and get money out.
- They can as well transfer money to another account

### Implementation
Implements the interface BankOperations in the objects Bancomat and EBanking
- In the bancomat the identity is tested with a pin code (int) and in E-banking with a password (String)
- There is only one Bank, which contain 1 Bancomat and 1 E-banking
- You can only withdraw or deposit money from Bancomat. 
- You can only transfer money or create new accounts in E-banking
- Three error in the identification should lock the customer.
- The different state should be managed with the enumeration CustomerState.
- You should not be able to transfer money from/to the same account

For each operation
- Check the identity of the customer.
- No negative sold on any account is allowed.
- In case of error the balance of the account should be the same as before the transaction
- The customer is informed about any exception during an operation
- The customer is always informed about the account balance after each successful operation.

### Expected output
=== 1 ===
- New bank created

=== 2 ===
- New customer joining the bank. Welcome Jean
- New customer joining the bank. Welcome David
- New customer joining the bank. Welcome Paul

=== 3 ===
- New account 'Account 1' created for Jean.
- New account 'Account 2' created for David.
- New account 'Account 3' created for Paul.

=== 4 ===
- Jean identity not validated, operation refused.

=== 5 ===
- Transfert from Account 1 to Account 2 with 50.0 done.
- new balances 50.0 - 150.0

=== 6 ===
- Operation refused, account balance from Account 3 would become negative.

=== 7 ===
- Jean identity not validated, operation refused.
- Jean identity not validated, operation refused.
- Account locked because too many wrong logins.
- Jean identity not validated, operation refused.
- Account is locked, please contact your representative.

=== 8 ===
- 100.0 added to account Account 3, new balance is 200.0

=== 9 ===
- To withdraw money, please come to our bancomat.

=== 10 ===
- Transfert from Account 3 to Account 1 with 150.0 done.
- new balances 50.0 - 200.0

=== 11 ===
- Customer List
- Jean
-  Account 1 - 250.0
- David
-  Account 2 - 150.0
- Paul
- Account 3 - 50.0

### Feedbacks
Please feel free to contact me with you feedbacks which are welcome.