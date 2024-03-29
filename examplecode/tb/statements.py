class Statement:
    def __init__(self, linenumber):
        self._linenumber = linenumber
        self._tokens = []

    def addtoken(self, token):
        self._tokens.append(token)

    def execute(self):
        print("ERROR: statement.execute() never should have been called")

class PrintStatement(Statement):
    def __init__(self, linenumber):
        Statement.__init__(self, linenumber)

    def execute(self):
        print("Called print execute")

class InputStatement(Statement):
    def __init__(self, linenumber):
        Statement.__init__(self, linenumber)

    def __str__(self):
        return "input"
    
    def execute(self):
        pass
    
class FunctionStatement(Statement):
    def __init__(self, linenumber):
        Statement.__init__(self, linenumber)

    def __str__(self):
        return "function"

    def execute(self):
        print("Error this should never be called")
    

class UsrStatement(FunctionStatement):
    def __init__(self, linenumber):
        FunctionStatement.__init__(self, linenumber)

    def __str__(self):
        return "usr function"

    def execute(self):
        pass
    
class RndStatement(FunctionStatement):
    def __init__(self, linenumber):
        FunctionStatement.__init__(self, linenumber)

    def __str__(self):
        return "rnd function"

    def execute(self):
        pass
    
class RemStatement(FunctionStatement):
    def __init__(self, linenumber):
        Statement.__init__(self, linenumber)

    def __str__(self):
        return "rem"

    def execute(self):
        pass
    
class LetStatement(FunctionStatement):
    def __init__(self, linenumber):
        Statement.__init__(self, linenumber)

    def __str__(self):
        return "let"

    def execute(self):
        pass

class IfStatement(Statement):
    def __init__(self, linenumber):
        Statement.__init__(self, linenumber)

    def __str__(self):
        return "if"

    def execute(self):
        pass