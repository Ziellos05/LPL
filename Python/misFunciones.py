def factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact = fact * i
    return fact
def sumar(a,b):
    print(a,b)

def restar(a):
    return a+1,a+2,a+3

def media(*args):
    total=0
    for i in args:
        total+=i
    return total/len(args)


def mul():
    print("mul desde Funciones")

def div():
    print("dividir desde Funciones")

def cubo():
    print("cubo desde Funciones")