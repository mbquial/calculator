# Calculadora Versión 1.1

# Inicio: 20 de Diciembre 2025
# Fin: 

# Este programa realiza operaciones matemáticas básicas: suma, resta, multiplicación y división.
# Funciones actuales: Realiza las operaciones simples.
# Hecho por Karla

def sumar(a,b):
    """
    Función que se va a encargar de las sumas
    (float, float) --> float
    """
    
    return a+b

def restar(a,b):
    """
    Función que se va a encargar de las restas
    (float, float) --> float
    """
    
    return a-b

def multiplicar(a,b):
    """
    Función que se va a encargar de las multiplicaciones
    (float, float) --> float
    """
    
    return a*b

def dividir(a,b):
    """
    Función que se va a encargar de las divisiones
    Arroja error si el divisor es igual a 0 (b = 0)
    (float, float) --> float
    """

    return a/b 

def get_op(x):
    """
    Función que ayuda a identificar la operación
    (str) --> str
    """
    
    for i in x[1:]:
        if i in ["+","-","*","/"]:
            return i
    else:
        return "nini"

def strip_inter(x):
    """
    Función que actúa como .strip pero también remueve los espacios
    intermedios
    (str) --> str 
    """

    resultado = ""
    for i in x:
        if i != " ":
            resultado += i
    return resultado

def get_nums(x):
    """
    Función que ayuda a identificar los números
    Arroja error si no se encuentra operación
    (str) --> list
    """
    
    op = get_op(x)
    if op == "nini":
        return "No se ingresó ninguna operación"
    else:
        op_pos = x.index(op, 1)
        return [float(strip_inter(x[:op_pos])), float(strip_inter(x[op_pos+1:]))]


def main():
    cadena = input().strip()
    op = get_op(cadena)
    a = get_nums(cadena)[0]
    b = get_nums(cadena)[1]
    if op == "+":
        print(sumar(a,b))
    elif op == "-":
        print(restar(a,b))
    elif op == "*":
        print(multiplicar(a,b))
    elif op == "/":
        if b == 0:
            print("No es posible dividir por 0")
        else: 
            print(dividir(a,b))
    else:
        print("No se ingresó ninguna operación")
main()
