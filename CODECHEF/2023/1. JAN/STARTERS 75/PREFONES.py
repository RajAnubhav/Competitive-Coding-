for _ in range(int(input())):
    n = int(input())
    s = input()
    L = 0
    while L < n and s[L] == '1': L += 1
    R = L+1
    mx = cur = 0
    while R < n:
        if s[R] == '0':
            mx = max(mx, cur)
            cur = 0
        else: cur += 1
        R += 1
    mx = max(mx, cur)
    print(mx + L)