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
- You are not allowed to add any method or to change any method signature

### Expected output
=== 1 ===
- New bank created

=== 2 ===
- New customer joining the  Welcome Jean
- New customer joining the  Welcome David
- New customer joining the  Welcome Paul

=== 3 ===
- New account 'Decorator.Account 1' created for Jean.
- New account 'Decorator.Account 2' created for David.
- New account 'Decorator.Account 3' created for Paul.

=== 4 ===
- Jean identity not validated, operation refused.

=== 5 ===
- Transfert from Decorator.Account 1 to Decorator.Account 2 with 50.0 done.
- new balances 50.0 - 150.0

=== 6 ===
- Operation refused, account balance from Decorator.Account 3 would become negative.

=== 7 ===
- Jean identity not validated, operation refused.
- Jean identity not validated, operation refused.
- Decorator.Account locked because too many wrong logins.
- Jean identity not validated, operation refused.
- Decorator.Account is locked, please contact your representative.

=== 8 ===
- 100.0 added to account Decorator.Account 3, new balance is 200.0

=== 9 ===
- To withdraw money, please come to our bancomat.

=== 10 ===
- Transfert from Decorator.Account 3 to Decorator.Account 1 with 150.0 done.
- new balances 50.0 - 200.0

=== 11 ===
- Customer List
- Jean
-  Decorator.Account 1 - 200.0
- David
-  Decorator.Account 2 - 150.0
- Paul
- Decorator.Account 3 - 50.0
