# coding: utf-8

import sys
from gmpy2 import mpz


def fib(n: mpz):
    if n <= 0:
        return n
    bs = mpz(0)
    m = mpz(n)
    while m > 1:
        bs <<= 1
        bs |= (m.bit_test(0))
        m >>= 1
    a = mpz(1)
    b = mpz(1)
    while m < n:
        m = (m << 1) + bs.bit_test(0)
        bs >>= 1
        np = a ** 2 + b ** 2
        if m.bit_test(0) == 0:
            a = a * ((b << 1) - a)
            b = np
        else:
            b = b * ((a << 1) + b)
            a = np
    return a


if __name__ == "__main__":
    n = mpz(int(sys.stdin.readline().rstrip()))
    try:
        fibN = fib(n)
        sys.stdout.writelines(fibN.digits())
    except KeyboardInterrupt:
        pass
