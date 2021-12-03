def Poker(Lista1, Lista2):
    Orden=[]
    for i in Lista1:
        Orden+=[i]
    Orden.sort()
    #Tenemos escalera si
    if int(Orden[0]) == int(Orden[1])-1 == int(Orden[2])-2 == int(Orden[3])-3 == int(Orden[4])-4:
        #Verificamos si es de color
        if Lista2[0]==Lista2[1]==Lista2[2]==Lista2[3]==Lista2[4]:
            #Verificamos si es real
            if Orden[0]=='10':
                print("Escalera real")
            else:
                print("Escalera de color")
        else:
            print("Escalera normal")
    #Verificamos que al menos haya color
    elif Lista2[0]==Lista2[1]==Lista2[2]==Lista2[3]==Lista2[4]:
        print("Color")
    #No hay nada :(
    else:
        print("Otra mano")

n=int(input())
for i in range(n):
    List1 = []
    List2 = []
    for j in range(10):
        x=input()
        if j%2==0:
            List1=List1+[x]
        else:
            List2=List2+[x]
    Poker(List1, List2)