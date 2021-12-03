import vector
import random
import math
class matriz:

    def __init__(self, m, n):
        self.m=m
        self.n=n
        self.mat=[]*(m+1)
        for i in range (m+1):
            a=[0]*(n+1)
            self.mat.append(a)

    def numeroFilas(self):
        return self.m

    def numeroColumnas(self):
        return self.n

    def imprimeMatrizPorFilas(self, mensaje="Matriz por filas"):
        print("\n", mensaje)
        for i in range(1, self.m+1):
            for j in range(1, self.n+1):
                print(self.mat[i][j], "\t", end="")
            print()

    def imprimeMatrizPorColumnas(self, mensaje="Matriz por columnas"):
        print("\n", mensaje)
        for i in range(1, self.n+1):
            for j in range(1, self.m+1):
                print(self.mat[j][i], "\t", end="")
            print()

    def intercambiarFilas(self, i, j):
        for k in range(1, self.n):
            aux=self.mat[i][k]
            self.mat[i][k]=self.mat[j][k]
            self.mat[j][k]=aux

    def intercambiarColumnas(self, i, j):
        for k in range(1, self.m):
            aux=self.mat[k][i]
            self.mat[k][i]=self.mat[k][j]
            self.mat[k][j]=aux

    def sumarFilas(self):
        v=vector(self.m)
        for i in range(1, self.m+1):
            s=0
            for j in range(1, self.n+1):
                s=s+self.mat[i][j]
            v.agregarDato(s)
        return v

    def sumarColumnnas(self):
        v=vector(self.n)
        for i in range(1, self.n+1):
            s=0
            for j in range(1, self.m+1):
                s=s+self.mat[j][i]
            v.agregarDato(s)
        return v

    def transpuesta(self):
        c=matriz(self.n, self.m)
        for i in range(1, self.m+1):
            for j in range(1, self.n+1):
                c.mat[j][i]=self.mat[i][j]
        return c


    def __add__(self, b):
        c = matriz(self.m, self.n)
        if self.m != b.m or self.n != b.n:
            print("Matrices no se pueden sumar. Son de dimensiones diferentes")
            return c
        for i in range(1, self.m + 1):
            for j in range(1, self.n + 1):
                c.mat[i][j] = self.mat[i][j] + b.mat[i][j]
        return c

    def productoDiagonalPrincipal(self):
        f = 1
        for i in range(1, self.m + 1):
            f = f * self.mat[i][i]
        return f

    def random(self, a, b):
        for i in range(1, self.m + 1):
            for j in range(1, self.n + 1):
                self.mat[i][j] = random.randint(a, b+1)