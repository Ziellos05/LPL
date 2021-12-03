import csv
import pandas as pd

columnas = ['Nombre','Edad']

datos = [['Andres','28'],
        ['Diana','18']]

nombreArchivo="personas.csv"


#Leer un archivo

def readcsv(fileName):
    fields = []
    data = []
    with open(fileName,'r') as csv_file:
        #Crear objeto reader
        csv_reader=csv.reader(csv_file)

        #Obtener encabezado
        fields = next(csv_reader)

        #Extrar cada una de las filas
        for row in csv_reader:
            data.append(row)
    return fields, data

#Guardar informacion en archivo

def writecsv(fileName, fields, data):
    with open(fileName,'w') as csv_file:
        #Crear un objeto de tipo writer
        csv_writer = csv.writer(csv_file)
        #Añadir encabezado al archivo
        csv_writer.writerow(fields)
        #Añadir datos al archivo
        csv_writer.writerows(data)

#PANDAS

def readcsvpandas(fileName):
    #Se leen los datos
    df = pd.read_csv(fileName)
    #Se crea la tabla
    mean = sum(df.Edad.tolist())/2
    print(mean)


def writecsvpandas(fileName, fields, data):
    #Se crea DataFrame con los datos de la tabla
    df=pd.DataFrame(data=data, columns=fields)
    #Guardar DataFrame en arcivo csv
    df.to_csv(fileName)
    print("Archivo creado exitosamente")