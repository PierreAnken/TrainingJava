# Java Supermarket project V1.0

### Used functionalities

- Queues in List
- Enumeration

### Description
- We manage a supermarket.
- The supermarket has cashiers, which can process customers when they are open.
- Customers always look for the first empty cashier or the one with the smallest queue

### Implementation
- You are not allowed to add any method or to change any method signature

### Expected output
=== 1 ===
- A new supermarket opened

=== 2 ===
- A new cashier was installed
- A new cashier was installed
- A new cashier was installed
- A new cashier was installed
- A new cashier was installed

=== 3 ===
- No available cashier

=== 4 ===
- Cashier 1 is now OPEN
- Cashier 2 is now OPEN
- Cashier 3 is now OPEN

=== 5 ===
- The cashier queue is full, sorry customer 17

=== 6 ===
- C1: o[14] o[11] o[8] o[5] o[2]
- C2: o[15] o[12] o[9] o[6] o[3]
- C3: o[16] o[13] o[10] o[7] o[4]
- C4:
- C5:


=== 7 ===
- Cashier 1 is now CLOSED
- Cashier 2 is now CLOSED
- Cashier 1 is now OPEN
- Cashier 2 is now OPEN
- Cashier 4 is now OPEN

=== 8 ===
- C1: o[24] o[21] o[18]
- C2: o[25] o[22] o[19]
- C3: o[16] o[13] o[10] o[7] o[4]
- C4: o[23] o[20]
- C5:


=== 9 ===
- C1: o[24]
- C2: o[25] o[22] o[19]
- C3: o[16] o[13] o[10]
- C4: o[23] o[20]
- C5:


=== 10 ===
- The angry customer 26 forced the queue 2
- C1: o[24]
- C2: o[25] o[22] o[19] o[26]
- C3: o[16] o[13] o[10]
- C4: o[23] o[20]
- C5: 