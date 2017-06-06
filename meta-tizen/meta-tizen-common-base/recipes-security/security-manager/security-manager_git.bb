require security-manager.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/security/security-manager;tag=3dec492df1a5a937ceed39c4985d9659860e5783;nobranch=1"

BBCLASSEXTEND += " native "

