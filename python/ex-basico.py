case = 1
maior = 0
tempMenor = None
while (case == 1):
    
    n = int(input("Digite um numero: "))
    
    if n < 0:
        case = 0
    else:
        if n >= maior:
            maior = n
            tempMaior = maior
            if tempMenor == None:
                tempMenor = tempMaior
        else:
            if n <= tempMenor:
                menor = n
                tempMenor = n

    
print(maior)
print(menor)