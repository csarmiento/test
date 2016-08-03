# Counting out problem
Code implementation that solves the counting out problem. In these problems, 
you are in a circle. From some starting point, X you count k people.  

If you are standing in that kth spot, you are ‘out’. The counting continues 
until there is one person standing.  

A concrete, but morbid, example of this is the [Josephus Problem](https://en.wikipedia.org/wiki/Josephus_problem).
 
# Running the program
The program will take in 2 parameters: the number of people in the circle (**n**) and the step rate (**k**).  

1. Clone the repo. You can put it anywhere you like.

  ```sh
git clone git@github.com:csarmiento/test.git
cd test
  ```

1. Run the program, passing the 2 numbers: **N** and **K**.

  ```
sbt "run N K"
  ```
  
# Interesting Reading
This article has a very interesting approach to tackle this problem: [The Josephus Problem](http://user.math.uzh.ch/halbeisen/publications/pdf/jos.pdf)