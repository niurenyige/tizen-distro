require buxton.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/upstream/buxton;tag=e113af469291708b73b3f7fe0b3b838fbb8ac2b4;nobranch=1"

BBCLASSEXTEND += " native "

