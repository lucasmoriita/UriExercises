case = 1
maior = 0
temp = 0
while (case == 1):
    
    n = int(input("Digite um numero: "))
    
    if n < 0:
        case = 0
    else:
        if n >= maior:
            maior = n
            if temp == 0:
                temp = maior
        else:
            if n <= temp:
                menor = n
                temp = n

    
print(maior)
print(menor)