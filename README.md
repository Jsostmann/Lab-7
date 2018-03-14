# Lab 8
## Interfaces

This is the eigth lab for COMP 167, Computer Program Design at North Carolina A&T State University.

Instructor: Dr. Kelvin Bryant ksbryant@ncat.edu

### Lab Description

You will be implementing the Comparable and interface in this lab.

#### Card class

First, create a class named Card with the following properties: color:Color, value:String. The card would be used in the game of Uno. Add two constructors (no-arg constructor and a constructor that includes both properties), toString(), mutator and accessor methods. The toString method should use the “,” to separate properties.

Your Card class should implement the Comparable interface as discussed in class. Implement the compareTo method that sorts by color then by value. So, if the cards have the same color, you need to look at the value to determine whether one card is less than the other. Use alphabetical order to compare colors.

#### Deck Class

Create a Deck class consisting of 108 Cards represented in an ArrayList<Card> named cards. There are 0 x 1, 1 to 9 x 2 for each color (Red, Green, Blue, Yellow) = 76 cards. The game of Uno has other cards; however, we are ignoring them for this exercise. Here is an example of creating just the Green cards with the number values set that would be a part of the Deck constructor:
```
cards.add( new Card( Color.green, “0”) );
for (int i=1; i<=9; i++) {
  cards.add( new Card( Color.green, i+””) );
  cards.add( new Card( Color.green, i+””) );
}
```
                   
`void shuffle()` - Add a method to your Deck class that shuffles (randomizes) the cards. This method should loop through the entire deck of 76 cards and assign that card to another random location within the deck. Repeat this loop 7 times (so you will have nested loops where the outer loop is executed 7 times and the inner loop is executed 76 times). Use the java.util.Random class for your random number generator.

`void sort()` - This method should sort your deck and should simply consist of a call to the static method sort() of the Collections class. This Collections.sort() method will sort your ArrayList since your Card class implements the Comparable interface.

`String toString()` – return a string with all the cards separated by a “|”. Insert a newline after every 15 cards.

#### Main Method

- Your main method should :
- Instantiate a new deck of cards
- Shuffle the cards
- Output the shuffled (randomized) cards to a JOptionPane.
- Sort the cards.
- Output the sorted cards to a JOptionPane.

### Grading

You must complete your main method that shows the sorted cards (i.e. complete the Comparable part
of the lab) to received 20pts on this lab.
