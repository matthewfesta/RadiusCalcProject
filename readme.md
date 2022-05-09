# Project Documentation

Author: Matthew Festa


# Problem-Solving Lifecycle:

1. Describe the problem:

   I need to build a program that will take a user input for radius and return
   three different calculations for the circumference, area and volume and output
   the results to the user. The program output should look like this:

   Enter the radius:
   2.75
   The circumference of a circle with a radius of 2.750 is 17.27875
   The area of a circle with a radius of 2.750 is 23.75827
   The volume of a sphere with a radius of 2.750 is 87.11367


2. Analyze the problem:

   a. What are the inputs?
   i. The radius of the circle (r).

   b. What are the outputs that should made by the solution to the problem?
   i. The circumference of the circle with the inputted radius followed by
   the calculation with 5 decimal points.
   ii. The area of the circle with the inputted radius followed by
   the calculation with 5 decimal points.
   iii. The volume of the sphere with the inputted radius followed by
   the calculation with 5 decimal points.

   c. How are the inputs and outputs related?
   i. Circumference = 2 * π * r   
   ii. Area = π * r ** 2  
   iii. Volume = (4/3) * π * r ** 3

   d. Are there any constraints on the input?
   i. Radius must be a non-negative real number used a double variable if
   the user needs to use a decimal number.

3. Design the algorithm to solve the problem
   a. Prompt user for the radius (r) of the circle.
   b. Compute the circumference of the circle, 2 * π * r
   c. Compute the area of the circle, π * r ** 2
   d. Compute the volume of the sphere, (4/3) * π * r ** 3
   e. Display the circumference, area and volume to the user along with their
   input.
   (Flowchart is in a separate document)

4. Test the correctness of algorithm using a trace:

| Input     | Expected Output               | Trace Result     | Implementation Result        |
|-----------|-------------------------------|------------------|------------------------------|
| R = 42.42 | R = 42.420 / C = 266.39760    | C = 266.39760    | R = 42.420 / C = 266.39760   |
| R = 42.42 | R = 42.420 / A = 5650.29310   | A = 5650.29310   | R = 42.420 / A = 5650.29310  |
| R = 42.42 | R = 42.420 / V = 179764.07485 | V = 179764.07485 | R = 42.42 / V = 179764.07485 |
