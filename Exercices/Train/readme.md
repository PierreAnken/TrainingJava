# Java Training project Train V1.0

### Used functionalities
- Interface
- Enumeration
- Double "custom" linked list

### Description
- We manage a train
- The train contain a locomotive (head) and wagons
- The wagons can be built either to transport goods or people

### Implementation
Implements the interface AWagon in the objects GoodsWagon and PeopleWagon
- A wagon contain a list of <Things>
- Things are coal for the locomotive, person for the PersonWagon and Merchandise for the MerchandiseWagon
- The limit of <Things> each wagon can store is defined by maxContent (max size of the list of <Things>)

Adding <things> to wagons and locomotive:
- The locomotive store only on box of Coal. Using or refuelling Coal for running should update its content.
- The PersonWagon has 20 seats. It can only be one person by seat. When you add a passager to the train he will always take the first seat available starting from the front wagon.
- The MerchandiseWagon contains 100 boxes which can contain 1 thing. The merchandises are loaded from the back of the train in the first empty box.

### Expected output

=== 1 ===
- We got a brand new train.

=== 2 ===
- The locomotive has 500 coal remaining.

=== 3 ===
- The train has 10 wagons.

=== 4 ===
- Composition: <[]__]-[ m ]-[ m ]-[ m ]-[ p ]-[ p ]-[ p ]-[ p ]-[ p ]-[ p ]-[ p ]

=== 5 ===
- We loaded 45 people over 45

=== 6 ===
- They are 95 free seats in the train.

=== 7 ===
- Sorry, the train is full you have to wait the next one.
- We loaded 95 people over 100

=== 8 ===
- They are 40 free seats in the train.
- Composition: <[]__]-[ p ]-[ p ]-[ m ]-[ m ]-[ m ]-[ p ]-[ p ]-[ p ]-[ p ]-[ p ]-[ p ]-[ p ]