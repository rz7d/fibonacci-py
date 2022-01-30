# fibonacci-py
Python における高速なフィボナッチ数計算
- fib.py - import 文が存在しない実装です
- fib-fast.py - 多倍長整数 (任意精度演算) に Python 3 組み込みの int ではなく **gmpy2** を使用します。非常に高速です。
- FibFast.java - Java で実装しました。

https://blog.miz-ar.info/2019/01/fast-fibonacci/ の記事をもとに実装いたしました。  
間違いはないことを確認しましたが、アルゴリズムについてなんの理解もないため、もしかすると誤った実装かもしれません。  
また、すべての実装において、再帰を排除するように変形させてあります。  
本プログラムは [JetBrains Quest](https://blog.jetbrains.com/blog/2020/03/27/what-on-earth-was-the-jetbrains-quest/) の対策に使用いたしました。アルゴリズム考案者の方々および上記のブログ主の方に大変感謝いたします。  


## 免責事項
当方は小学校卒業程度の学力しかなく、本アルゴリズムについて何の理解も知識もございませんことをご理解とご容赦願います。
