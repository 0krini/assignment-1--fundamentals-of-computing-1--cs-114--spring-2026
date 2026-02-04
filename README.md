# Spring 2026 Fundamentals of Computing I — Assignment 1

* **Read these instructions repeatedly until you understand, then begin your project. If something is not clear, ask.**

## ❖・Before You Begin・❖

1. Log in to GitHub.
2. Fork this repo(sitory). See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/) on how to carry out this step and step `3`.
3. Clone your fork, using either the web site or the GitHub Desktop client.
4. Checkout your personalized branch, the one with your name and GitHub handle.

---

## ❖・What You’ll Do・❖

For this assignment, you’ll be writing two separate programs, each requiring input from the user.

### Program 1

For the first program, you’ll be writing a program that creates a string based on temperature and random factors.

1. Your program should print your first and last initials in large block letters. Use each letter’s corresponding characters to form the letters. (See the **Example Output** section below.)
2. Now, take input from the user in the form of a 5-character string, then save the string in reverse _without_ the first and last characters. In other words, trim the outside characters. For example, if the user enters `abewz`, your program would save `web`.
3. Next, ask the user to enter a number in Fahrenheit. Your program should convert the value to Celsius and save it. For example, entering `32` should yield `0.0`.
4. In this penultimate step, generate and save a random number between 32 – 16,384, inclusive.
5. And, finally, combine the results of steps 2 – 4 and print it to the screen.

#### Example Output

If I was creating this program, it would look like this:

```bash
RRRRRRRR    VVV         VVV
RRR    RRR   VVV       VVV
RRR    RRR    VVV     VVV
RR RRR         VVV   VVV
RRR  RRR        VVV VVV
RRR    RRR       VVVVV
RRR      RRR      VVV

Please enter a 5-character string:
abewz

Please enter a number in Fahrenheit:
32

Random number generated. Continuing...

Your new string is 0.0web15769
```

---

### Program 2

For the second program, you’ll convert a base 10 number to another base, both of which are chosen by the user. You’ll need to calculate and report the largest 4-digit number that can be represented using the entered base. You may not use any looping structure to solve this program. See **Example Output** below, and [this video](https://roy.vanegas.org/video/base-conversion.mp4), for a full example of what the input must look like and the resulting output.

#### Example Output

Here’s an example of using 3 as the base and 17 as the base 10 number.

```bash
Base Conversion Program

Please enter a base (2 – 9): 3

The maximum, 4-digit, base 10 number in base 3 is 80.
Now, enter a base 10 number in the range 0 to 80 to convert: 17

17 (base 10) = 0122 (base 3)
```

---

## ❖・Grading・❖
| Item                                           | Points |
|------------------------------------------------|:------:|
| Program 1 works according to instructions      |  `25`  |
| Program 2 works according to instructions      |  `25`  |
| Code compliant with EditorConfig rules         |  `25`  |
| Code is neat and variable names are logical    |  `25`  |

---

## ❖・Due・❖

Thursday, 19 February 2026, at 4:45 PM.

---

## ❖・Submission・❖

You will need to issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may *only* be submitted via GitHub. **No other form of submission will be accepted**.
