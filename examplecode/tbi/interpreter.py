# PART 2 solution - recursive descent top-down parser by hand
from lexicalanalysis import build_the_lexer

lexer = build_the_lexer()

# define all the non terminal parsing functions
def tokerror(tok, exp):
  print(f"Unexpected token found: {tok.type}, Expecting: {exp}")
  print("INVALID")
  exit(1)

#store all statments to store goto and gosub
statements = []

#List of return line numbers
returnstack = []

def p_program(p):
  "program : actual_statement | program acutal_statement"
  print("yay, valid program")


def p_actual_statement(p):
  "actual_statement : NUMBER statement NEWLINE"
  statements += [{"num":p[1].value, "p":p}]

def p_statement(p):
  "statement : print | if| goto| input | let|gosub|rem|return|end"
  pass

def p_print(p):
  "print : PRINT expr_list | PR expr_list"
  print(p[1])

def p_if(p):
  "if : IF expression RELOP expression THEN statement"
  pass

def P_goto(p):
  "goto : GOTO NUMBER"
  pass

def p_gosub(p):
  "gosub : GOSUB NUMBER"
  pass

def p_input(p):
  "input : INPUT var_list"
  pass

def p_let(p):
  "let : LET VAR EQUALS expression"
  pass

def P_rem(p):
  "rem : REM"
  pass
  
def p_return(p):
  "return : RETURN"
  pass

def p_end(p):
  "end : END"
  pass

def p_expression(p):
  "expr_list : expression | expr_list COMMA expression"
  pass