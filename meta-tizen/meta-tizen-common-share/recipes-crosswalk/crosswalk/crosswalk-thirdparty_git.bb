require crosswalk-thirdparty.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/framework/web/crosswalk;tag=e02d90f63d504e1126cdb98e24cd0bd168b0d4d9;nobranch=1"

BBCLASSEXTEND += " native "

