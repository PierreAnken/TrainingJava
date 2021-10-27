# Java Training project Train V1.0

### Used functionalities
- Interface
- Abstract data types (E)
- Double custom linked list

### Description
- We manage a train
- The train contain a locomotive (head) and wagons
- The wagons can be built either to transport goods or people

### Implementation
Implements the interface AWagon in the objects GoodsWagon and PeopleWagon
- The wagons contain a list of seats 
- There is only one Bank.Bank, which contain 1 Bank.Bancomat and 1 E-banking
- You can only withdraw or deposit money from Bank.Bancomat. 
- You can only transfer money or create new accounts in E-banking
- Three error in the identification should lock the customer.
- The different state should be managed with the enumeration Bank.CustomerState.
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
- New account 'Bank.Decorator.Account 1' created for Jean.
- New account 'Bank.Decorator.Account 2' created for David.
- New account 'Bank.Decorator.Account 3' created for Paul.

=== 4 ===
- Jean identity not validated, operation refused.

=== 5 ===
- Transfert from Bank.Decorator.Account 1 to Bank.Decorator.Account 2 with 50.0 done.
- new balances 50.0 - 150.0

=== 6 ===
- Operation refused, account balance from Bank.Decorator.Account 3 would become negative.

=== 7 ===
- Jean identity not validated, operation refused.
- Jean identity not validated, operation refused.
- Bank.Decorator.Account locked because too many wrong logins.
- Jean identity not validated, operation refused.
- Bank.Decorator.Account is locked, please contact your representative.

=== 8 ===
- 100.0 added to account Bank.Decorator.Account 3, new balance is 200.0

=== 9 ===
- To withdraw money, please come to our bancomat.

=== 10 ===
- Transfert from Bank.Decorator.Account 3 to Bank.Decorator.Account 1 with 150.0 done.
- new balances 50.0 - 200.0

=== 11 ===
- Bank.Customer List
- Jean
-  Bank.Decorator.Account 1 - 250.0
- David
-  Bank.Decorator.Account 2 - 150.0
- Paul
- Bank.Decorator.Account 3 - 50.0

### Feedbacks
Please feel free to contact me with you feedbacks which are welcome.