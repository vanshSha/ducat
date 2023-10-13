# ducat

RevisionCalculator project name 
Here are the short steps and explanations for the code you provided:

1. `RevisionCalculator` class is the main class with a `main` method.
   - It creates an instance of the `Input` class.
   - Calls the `getInputOne` and `getInputTwo` methods to get two integer inputs.

2. `Logic` class contains methods for performing various calculations:
   - `add(Input input)` method adds two integers.
   - `subtract(Input input)` method subtracts one integer from another.
   - `multiplay(Input input)` method multiplies two integers.
   - `divided(Input input)` method divides one integer by another.
   - `percent(Input2 input2)` method calculates the percentage by dividing one double by another. Note the typo in the method name; it should be "multiply."

3. `Input2` class is designed to store two inputs of different data types:
   - `inputOne` is an integer.
   - `inputTwo` is a double.

4. `Input` class is similar to `Input2` but only stores two integer inputs.

However, there are some issues in your code:
- The typo in the `multiplay` method in the `Logic` class should be corrected to `multiply`.
- In the `percent` method in the `Logic` class, you use `Input2` as a parameter type, but you should use `Input` to match the methods in the `Input` class.
- The code doesn't demonstrate how the calculated results are used or displayed, so you might want to add code to print or use the results of these calculations in your `main` method.

Make sure to address these issues to have a functioning program.
