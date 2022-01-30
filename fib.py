# coding: utf-8

def fib(n):
    if n <= 0:
        return n
    bs = 0
    m = n
    while m > 1:
        bs <<= 1
        bs |= (m & 1)
        m >>= 1
    a = 1
    b = 1
    while m < n:
        m = (m << 1) + (bs & 1)
        bs >>= 1
        np = a ** 2 + b ** 2
        if (m & 1) == 0:
            a = a * ((b << 1) - a)
            b = np
        else:
            b = b * ((a << 1) + b)
            a = np
    return a


if __name__ == "__main__":
    print(fib(int(input("fib(x) x="))))
