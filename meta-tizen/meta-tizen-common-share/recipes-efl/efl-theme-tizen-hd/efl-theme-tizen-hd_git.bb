require efl-theme-tizen-hd.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/uifw/efl-theme-tizen;tag=583598df2aeb21a296cacbbbfffdff14ae595d7f;nobranch=1"

BBCLASSEXTEND += " native "

