num_calls = 0


def fib(n):
    global num_calls
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        num_calls += 2
        return fib(n - 1) + fib(n - 2)


casos_teste = int(input())
vetor = []

for i in range(casos_teste):
    X = int(input())
    vetor.append(X)

for i in vetor:
    num_calls = 0
    result = fib(i)
    print("fib(%d) = %d calls = %d" % (i, num_calls, result))
