SUMMARY = "Simple Hello World Program"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=e5d6e0d09c71f4bd5c3bce6d2e01cc35"

SRC_URI = "file://helloworld.c"

S = "${WORKDIR}"


do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} helloworld.c -o helloworld
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 helloworld ${D}${bindir}
}
