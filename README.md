# Expression Tree

A function to **_validate an expression_** and to **_convert it to Postfix form_**.

A function to **_convert the Postfix Expression_** to an **_Expression Tree_**.

## Getting Started

```
git clone https://github.com/shv-luffy-98/Expression-Tree.git
cd src
javac -d ../bin Test.java
java -cp ../bin Test
```

## Functions
- ### Infix to Postfix - Shunting Yard method
  - > **Validates** the infix Expression
  - > **Formats** the Infix Expression by separating operator and operands by spaces
  - > Infix Expression can contain **standard arithmetic operators, mathematical functions and single character variables**('A' - 'Z' and 'a' - 'z')
- ### Postfix expresion to Expression Tree
  - > Postfix expression should follow the **Wall Notation** for functions
  - > Each operator and operand in the expression should be space separated[ eg:- infix = "sin(A + cos(B))" then postfix = "| A | B cos + sin"]
  - > For unary operations and functions left node will contain the operator and the right node will be null

    
