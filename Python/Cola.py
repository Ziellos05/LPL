class Cola:
    def __init__(self):
        self.items = []

    def agregar(self, item):
        # self.items.insert(0,item)
        self.items.append(item)

    def quitar(self):
        if(not self.estaVacia()):
            # return self.items.pop()
            return self.items.pop(0)

    def inicioCola(self):
        if (not self.estaVacia()):
            return self.items[0]

    def tamano(self):
        return len(self.items)

    def estaVacia(self):
        return self.items == []

    def __str__(self):
        return f"\n items: {self.items}"

"""PROGRAMA PRINCIPAL"""
# c=Cola()
# c.agregar(1)
# c.agregar(2)
# c.agregar(3)
# ic=c.inicioCola()
# # print(c.tamano())
# print(c.estaVacia())
# c.quitar()
# c.quitar()
# c.quitar()
# c.quitar()
# print(c.estaVacia())
# # print(c.tamano())
# # print(c.inicioCola())
# print()









# c=Cola()
# print(c.estaVacia())
#
# c.agregar(1)

# c.agregar(2)
# c.agregar(3)
#
#
# c.agregar(4)
# print(c)
# c.quitar()
# print(c)
#
# c.quitar()
#
#
#
# print(c)
# c.agregar(5)
# print(c)
# # print(c.estaVacia())
# print("tamaño: ",c.tamano())
#
# print(c.inicioCola())






