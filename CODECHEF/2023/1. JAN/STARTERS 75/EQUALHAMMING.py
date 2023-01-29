mod = 10**9 + 7
def C(n, r):
    ret = 1
    for i in range(1, r+1):
        ret = ret * (n-i+1) * pow(i, mod-2, mod)
        ret %= mod
    return ret
for _ in range(int(input())):
    n = int(input())
    a = input()
    b = input()
    differ = 0
    for i in range(n):
        differ += a[i] != b[i]
    if differ%2 == 1: print(0)
    else: print(pow(2, n - differ, mod) * C(differ, differ//2) % mod)