# compiler-project
Compiler's project overview:
This project will direct you to design and build an interpreter for Cool. 
The first phase of the interpreter for cool  is lexical analysi.

# Prerequisites
-Install any ide such as Intellij, NetBeans, Eclipse (Intellij is preferred )

-then follow this link : https://github.com/antlr/antlr4/blob/master/doc/java-target.md

-bring your grammar (in this project it is COOL.g4)

-press Ctrl+Shift+G

# 1)Lexical Analysis:

Introduction :

Lexical analysis is the first phase of a compiler. It takes the modified source code from language preprocessors 
that are written in the form of sentences.The lexical analyzer breaks these syntaxes into a series of tokens, 
by removing any whitespace or comments in the source code. If the lexical analyzer finds a token invalid,
it generates an error. The lexical analyzer works closely with the syntax analyzer.It reads character streams
from the source code, checks for legal tokens, and passes the data to the syntax analyzer when it demand

![](https://raw.githubusercontent.com/asmaa122281/compiler-project/master/lexical%20(1).png)

### Regular Expressions:

A good way of specifying and documenting the lexer is transition diagrams.
More concisely, we can use regular expressions:

    Tokens = Space (Token Space)*
    Token  = TInt | TId | TKey | TSpec 
    TInt   = Digit Digit*
    Digit  = '0' | '1' | '2' |'3' | '4' |'5' | '6' |'7' | '8' | '9'
    TId    = Letter IdChar*
    Letter = 'A' | ... | 'Z' | 'a' | ... | 'z'
    IdChar = Letter | Digit
    TKey   = 'i' 'f' | 'e' 'l' 's' 'e' | ...
    TSpec  = '+''+' | '+' | ...For more info, please check For this link: http://www.cse.chalmers.se/edu/year/2009/course/TIN321_Proglang/lectures/proglang-04.html
    
### good result :

![](https://github.com/asmaa122281/compiler-project/blob/master/good.cl-lex.jpeg)

# 2)Parser :

he final parsing stage in which the meaning and implications of the validated expression are determined and necessary actions are taken.
A parser's main purpose is to determine if input data may be derived from the start symbol of the grammar. If yes, then in what ways can this input data be derived? This is achieved as follows:

  -Top-Down Parsing: Involves searching a parse tree to find the left most derivations of an input stream by using a top-down expansion.      Examples include LL parsers and recursive-descent parsers.

  -Bottom-Up Parsing: Involves rewriting the input back to the start symbol. This type of parsing is also known as shift-reduce parsing.      One example is a LR parser.

### Code Specification:
 1) A program that takes a single command-line argument (e.g., file.cl-lex). That argument will be an ASCII text Cool tokens file (as     described in the lexer programming assignment). The cl-lex file will always be well-formed (i.e., there will be no syntax errors in     the cl-lex file itself).

  If your program is called parser, invoking parser file.cl-lex should yield the same output as cool --parse file.cl.
  Your program can take another argument which is the file to print the output of the Concrete Syntax Tree (CST) as follows: parser       file.cl-lex file.cl-cst

  Your program should determine and print any errors in the parsing tree and terminate the program.

2)Test cases good.cl and bad.cl. The first should parse correctly and yield an abstract syntax tree. The second should contain an error.
3) A plain ASCII text file called readme.txt describing your design decisions and choice of test cases. A few paragraphs should suffice.
 
 ### Test cases good.cl and bad.cl. The first should parse correctly and yield an abstract syntax tree. The second should contain an error.

![](https://github.com/asmaa122281/compiler-project/blob/master/good.cl-cst.jpeg)
![](https://github.com/asmaa122281/compiler-project/blob/master/tree.jpeg)




