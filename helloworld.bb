SUMMARY = "Simple Hello World Program"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=e5d6e0d09c71f4bd5c3bce6d2e01cc35"

SRC_URI = "file://helloworld.c"
S = "${WORKDIR}"
## CC = "${CCACHE} cpptesttrace --cpptesttraceOutputFile=scan.bdf gcc"
CC = "${CCACHE} gcc"

do_build() {
    echo "*** dxtrace do_build  ***\n"
    ## ${CC} ${CFLAGS} ${LDFLAGS} helloworld.c -o helloworld
    cpptesttrace --cpptesttraceOutputFile=scan.bdf ${CC} ${CFLAGS} ${LDFLAGS} helloworld.c helper.c -o helloworld
}
