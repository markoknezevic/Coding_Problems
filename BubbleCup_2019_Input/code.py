def initMatrix(xSprata,ySprata):
    matSprat=[]
    for i in range(xSprata):
        matSprat.append([])
        for j in range(ySprata):
            matSprat[i].append(0)
    return matSprat

def slaganjePlocica(matSprat,redPrve,colPrve,redDruge,colDruge):

    pom=colPrve
    while redPrve<=redDruge:
        while pom<=colDruge:
            matSprat[redPrve][pom]+=1
            pom+=1
        pom=colPrve
        redPrve+=1
def funPreklapanje(matSprat):
    for i in matSprat:
        for j in i:
            if j>1:
                return True
    return False

def funPokrivenost(matSprat):
    for i in matSprat:
        for j in i:
            if j !=1:
                return False
    return True


niz=[]

brSpratova=int(input())

for j in range(brSpratova):
    prelazPreko=False
    preklapanje=False
    pokriveno=False
    xSprata=int(input())
    ySprata=int(input())

    matSprat=initMatrix(xSprata,ySprata)

    brPlocica=int(input())

    for i in range(brPlocica):
        redPrve=int(input())
        colPrve=int(input())

        redDruge=int(input())-1
        colDruge=int(input())-1

        if colPrve<0:
            prelazPreko=True
            colPrve=0


        if redPrve<0:
            prelazPreko=True
            redPrve=0
            

        if colDruge>=ySprata:
            prelazPreko=True
            colDruge=ySprata-1
            

        if redDruge>=xSprata:
            prelazPreko=True
            redDruge=xSprata-1
            




        slaganjePlocica(matSprat,redPrve,colPrve,redDruge,colDruge)
    preklapanje=funPreklapanje(matSprat)
    pokriveno=funPokrivenost(matSprat)
    
    if preklapanje:
        niz.append("NONDISJOINT")
    else:
        if prelazPreko:
            niz.append("NONCONTAINED")
        else:
            if not pokriveno:
                niz.append("NONCOVERING")
            else:
                niz.append("OK")
for k in niz:
    print(k)



    