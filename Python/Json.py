import json

dic={"100":{"nombre":"Maria", "edad":21},
     "200":{"nombre":"Roland", "edad":24}
     }

ls=[1, 2, 3]
ls2=[[1, 2, 3], [4, 5, 6], [7, 8, 9]]

with open("archivo.json", "w") as ss:
    json.dump(dic, ss, indent=4)


with open("archivo.json", "r") as ss:
    dic=json.load(ss)

#print(dic)
#print(type(dic))
#print(dic["100"]["nombre"])

#for i in dic:
    #print(i)
    #print(dic[i])

with open("ovihcra.json", "w") as xd:
    json.dump(ls2, xd, indent=4)


with open("ovihcra.json", "r") as xd:
    ls2=json.load(xd)

#print(ls)
#print(type(ls))

ls2.append([9, 1, 1])
ls2.append([6, 6, 6])

with open("ovihcra.json", "w") as xd:
    json.dump(ls2, xd, indent=4)

for i in range(len(ls2)):
    print(ls2[i])