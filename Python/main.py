import csv


def concepto(x):
    if x < 239:
        return "MUY BAJO"
    elif x >= 239 and x < 265:
        return "BAJO"
    elif x >= 265 and x < 291:
        return "MEDIO"
    elif x >= 291 and x < 317:
        return "ALTO"
    else:
        return "MUY ALTO"


def readcsv(fileName):
    data = []
    with open(fileName, 'r') as csv_file:
        csv_reader = csv.reader(csv_file)
        fields = next(csv_reader)
        for row in csv_reader:
            data.append(row)
    return data


def renglones(fileName):
    data = readcsv(fileName)
    renglones = []
    for i in range(len(data)):
        x = []
        b = (float(data[i][2]) + float(data[i][3])) / 2
        a = str(data[i][0])
        x = [a, str(b), concepto(b)]
        renglones = renglones + [x]
    return renglones


def writercsv(fileName2, fileName):
    lineas = renglones(fileName)
    fields=["Fecha", "Mean-Min-Max", "Concepto"]
    with open(fileName2, 'a') as csv_file:
        writer = csv.writer(csv_file, delimiter='\t')
        writer.writerow(fields)
        for i in range(len(lineas)):
            writer.writerow(lineas[i])


"""Fin espacio para programar funciones propias"""


def solucion():
    # ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    fileName = "FB.csv"
    fileName2 = "analisis_archivo.csv"
    writercsv(fileName2, fileName)
    data = readcsv(fileName)
    analisis = []
    for i in range(len(data)):
        b = (float(data[i][2]) + float(data[i][3])) / 2
        a = str(data[i][0])
        x = [b]
        analisis = analisis + x
    lowest_mean = min(analisis)
    highest_mean = max(analisis)
    dateL = analisis.index(lowest_mean)
    dateH = analisis.index(highest_mean)
    date_lowest_mean = str(data[dateL][0])
    date_highest_mean = str(data[dateH][0])
    return date_lowest_mean, lowest_mean, date_highest_mean, highest_mean

GG=solucion()