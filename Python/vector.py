class vector:

    def __init__(self, n):
        self.n = n
        self.V = [0] * (n + 1)

def esVacio(vec):
    return vec.V[0] == 0


def esLleno(vec):
    return vec.V[0] == vec.n


def tamagno(vec):
    return vec.n



#agregar un dato(d) al final del Vector. Si esta lleno no agrega el dato
def agregarDato(vec, d):
    if esLleno(vec):
        return
    vec.V[0] = vec.V[0] + 1
    vec.V[vec.V[0]] = d



    #asigna un dato (d) en la posición (i). Debe haber un dato en el vector para remplazarlo
    # def asignaDato(self, d, i):
    #     self.V[i] = d

    #Retorna un dato dado su indice i
    # def retornaDato(self, i):
    #     return self.V[i]

    #intercambia 2 datos. a y b son indices.
def intercambiar(vec, a, b):
    aux = vec.V[a]
    vec.V[a] = vec.V[b]
    vec.V[b] = aux

#suma los datos de los elementos vector. Retorna la suma
def sumarDatos(vec):
    s = 0
    for i in range(1, vec.V[0] + 1):
        s = s + vec.V[i]
    return s


#ordena el vector de forma descendente. 10,9,8,7...
def burbuja(vec):
    for i in range(1, vec.V[0]):
        for j in range(1, vec.V[0] - i + 1):
            if vec.V[j] < vec.V[j + 1]:
                intercambiar(vec,j, j + 1)

#ordena el vector de forma ascendente 1,2,3,4...
def seleccion(vec):
    for i in range(1, vec.V[0]):
        k = i
        for j in range(i + 1, vec.V[0] + 1):
            if vec.V[j] < vec.V[k]:
                k = j

        intercambiar(vec,k, i)



    #retorna el indice del dato mayor, primera ocurrencia
def mayor(vec):
    mayor = 1
    for i in range(1, vec.V[0] + 1):
        if vec.V[i] > vec.V[mayor]:
            mayor = i
    return mayor

    #retorna el indice del mayor, si hay repetidos la ultima ocurrencia
def mayorult(vec):
    mayor = 1
    for i in range(1, vec.V[0] + 1):
        if vec.V[i] >= vec.V[mayor]:
            mayor = i
    return mayor


    #retorna el menor (probar bien)
def menor(vec):
    menor = 1
    for i in range(1, vec.V[0] + 1):
        if vec.V[i] < vec.V[menor]:
            menor = i
    return menor

    #busca un dato(d) y retorna el indice donde esta
def buscarDato(vec, d):
    i = 1
    while i <= vec.V[0] and vec.V[i] != d:
        i = i + 1
    if i <= vec.V[0]:
        return i
    return -1

    #busca donde insertar(d). retorna el indice donde insertar.
def buscarDondeInsertar(vec, d):
    i = 1
    while i <= vec.V[0] and vec.V[i] < d:
        i = i + 1
    return i

    #inserta  el dato (d) en posicion i del vector. Debe haber espacio para insertar.#si esta lleno no inserta
    #si no envía (i), inserta el dato ordenado. El vector debe estar ordenado con algoritmo Seleccion()
def insertar(vec, d, i=0):
    if esLleno(vec):
        print("\nVector lleno, no se puede insertar")
        return
    if i == 0:
        i = buscarDondeInsertar(vec,d)
    for j in range(vec.V[0], i - 1, -1):
        vec.V[j + 1] = vec.V[j]
    vec.V[i] = d
    vec.V[0] = vec.V[0] +1

    #borra dato en posición dada
def borrarDatoEnPosicion(vec, i):
    if i <= 0 or i > vec.V[0]:
        print("\nParámetro i inválido")
        return

    for j in range(i, vec.V[0]):
        vec.V[j] = vec.V[j + 1]
    vec.V[0] = vec.V[0] - 1


    #borra dato(d). Si existe lo borra
def borrarDato(vec, d):
    i = buscarDato(vec,d)
    if i != -1:
        borrarDatoEnPosicion(vec,i)