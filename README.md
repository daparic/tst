Setup:
```
git clone https://github.com/daparic/tst.git
cd tst
export BBPATH=`pwd`
export PATH=/path/of/bitbake/bin:$PATH
```

Generate bdf:
```
bitbake helloworld
```

Static analysis:
```
# make sure -compiler ID matches your gcc version (cpptestcli -list-compilers)
/path/of/cpptest/10.4/engine/dtp/cpptestcli -config "builtin://MISRA C 1998" -compiler gcc_9-64 -bdf scan.bdf
```
