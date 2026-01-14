# Unit 5 Challenge: Time 🕜

**Must complete by the end of class**

---

## Problem Description

This question involves the creation and use of a `Time` class that keeps track of the time using a 24-hour digital clock, i.e. "military time," in which AM are the hours 00 through 12 and PM are the hours 13 through 24. A `Time` object represents a clock with a given number of hours, minutes, and seconds, that, when printed to the screen, appears in this format: `HH:MM:SS`

### Time Format Examples:
- Exact midnight is: `00:00:00`
- 8:37:24 AM is: `08:37:24`
- Exact noon is: `12:00:00`
- 6:05:08 PM is: `18:05:08`
- 11:59:59 PM (one second before midnight) is: `23:59:59`

---

## Required Behaviors

The `Time` class supports the following behaviors:

1. **Creating a new Time object** set to an initial time
2. **Increasing the clock's time by one second** (a second hand "tick"):
   - If the number of seconds is 60, add one to minutes and reset seconds to 0
   - If the number of minutes is 60, add one to hours and reset minutes to 0
   - If the number of hours reaches 24, reset to 0
3. **Adding a specified amount of time**, represented by a different `Time` object, which increases the current `Time` object's time appropriately
4. **An `info()` method** that returns a printable `String` representation of the time in `HH:MM:SS` format; all single digits should be "padded" with a leading zero so that hours, minutes, and seconds are all printed with two digits (e.g., `09:04:08` not `9:4:8`)

---

## Sample Execution Sequence

| Row | Statements | Value returned or printed | Comment |
|-----|------------|---------------------------|---------|
| | `Time time1 = new Time(8, 9, 58);` | | New Time object starting at time 08:09:58 |
| 1 | `System.out.println(time1.info());` | PRINTED: `08:09:58` | Single digits padded with a leading zero |
| | `time1.tick();` | | |
| 2 | `System.out.println(time1.info());` | PRINTED: `08:09:59` | |
| | `time1.tick();` | | |
| 3 | `System.out.println(time1.info());` | PRINTED: `08:10:00` | Seconds resets to 00 |
| | `time1.tick();` | | |
| 4 | `System.out.println(time1.info());` | PRINTED: `08:10:01` | |
| | `time1.tick();` | | |
| 5 | `System.out.println(time1.info());` | PRINTED: `08:10:02` | |
| | `time1.tick();`<br>`time1.tick();`<br>`time1.tick();`<br>`time1.tick();`<br>`time1.tick();`<br>`time1.tick();`<br>`time1.tick();`<br>`time1.tick();` | | |
| 6 | `System.out.println(time1.info());` | PRINTED: `08:10:10` | |
| | `Time time2 = new Time(15, 59, 58);` | | New Time object starting at time 15:59:58 |
| 7 | `System.out.println(time2.info());` | PRINTED: `15:59:58` | |
| | `time2.tick();` | | |
| 8 | `System.out.println(time2.info());` | PRINTED: `15:59:59` | |
| | `time2.tick();` | | |
| 9 | `System.out.println(time2.info());` | PRINTED: `16:00:00` | Minutes and seconds both reset to 00 |
| | `time2.tick();` | | |
| 10 | `System.out.println(time2.info());` | PRINTED: `16:00:01` | |
| | `Time time3 = new Time(23, 59, 58);` | | New Time object starting at time 23:59:58 |
| 11 | `System.out.println(time3.info());` | PRINTED: `23:59:58` | |
| | `time3.tick();` | | |
| 12 | `System.out.println(time3.info());` | PRINTED: `23:59:59` | |
| | `time3.tick();` | | |
| 13 | `System.out.println(time3.info());` | PRINTED: `00:00:00` | Hours, minutes, and seconds all reset to 00 |
| | `time3.tick();` | | |
| 14 | `System.out.println(time3.info());` | PRINTED: `00:00:01` | |

### Testing the `add` functionality:

| Row | Statements | Value returned or printed | Comment |
|-----|------------|---------------------------|---------|
| | `Time time4 = new Time(10, 14, 43);` | | New Time object |
| 15 | `System.out.println(time4.info());` | PRINTED: `10:14:43` | |
| | `Time time5 = new Time(8, 30, 29);` | | New Time object |
| | `time4.add(time5);` | | Adds 08:30:29 to 10:14:43, which changes the state of time4 |
| 16 | `System.out.println(time4.info());` | PRINTED: `18:45:12` | 08:30:29 + 10:14:43 = 18:45:12 |
| 17 | `System.out.println(time5.info());` | PRINTED: `08:30:29` | time5 is not affected, since time5 got added to time4 (not the other way around) |
| | `Time time6 = new Time(7, 20, 0);` | | New Time object |
| | `time4.add(time6);` | | Adds 07:20:00 to time4, which is currently 18:45:12 |
| 18 | `System.out.println(time4.info());` | PRINTED: `02:05:12` | 18:45:12 + 07:20:00 = 02:05:12 |

---

## Instructions

Write the complete `Time` class. Your implementation must meet all specifications and conform to the example code sequence above.

### Submission

1. Push to your repository git add . -> git commit -m "commit message" -> git push
2. Confirm your tests pass ./gradlew test

