SUMMARY = "Add ksz8463 python for autostartup"
SECTION = "SCRIPTS"
LICENSE = "CLOSED"

SRC_URI = "file://ksz8463.service"
inherit systemd
SYSTEMD_SERVICE_${PN} = "ksz8463.service"

S = "${WORKDIR}"
INITSCRIPT_NAME = "ksz8463.service"

do_install() {
             install -d ${D}${systemd_unitdir}/system
             install -m 0644 ${WORKDIR}/${INITSCRIPT_NAME} ${D}${systemd_unitdir}/system
}