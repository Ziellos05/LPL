class Pila:
    def __init__(self):
        self.items = []

    def apilar(self, item):
        self.items.append(item)

    def desapilar(self):
        if(not self.estaVacia()):
            return self.items.pop()

    #retorna el dato que eta en la cima
    def cima(self):
        if(not self.estaVacia()):
            return self.items[len(self.items)-1]

    def tamanio(self):
        return len(self.items)

    def estaVacia(self):
        if(self.items==[]):
            return True
        else:
            return False

    def __str__(self):
        return f"{self.items}"


# elem=Pila()
# elem.apilar("Lunes")
#
# elem.apilar("Martes")
# elem.apilar("Miercoles")
# elem.apilar("Jueves")
# print(elem)
# x=elem.tamanio()
# print(elem.tamanio())
# print(elem.estaVacia())

# elem.desapilar()
# print(elem)
# print(elem.cima())

# print(elem)
# elem.desapilar()
# elem.desapilar()
# elem.desapilar()
# elem.desapilar()
# print(elem)






# elem=Pila()
# elem.apilar("Lunes")
# elem.apilar("Martes")
# elem.apilar("Miércoles")
# print(elem)
# elem.desapilar()

# print(elem.cima())

# print(elem.tamanio())
# print(elem.cima())

#desapilar hasta vaciar
# while not elem.estaVacia():
#    elem.desapilar()


# print(elem)

