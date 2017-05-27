LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_PRIVILEGED_MODULE := true

LOCAL_SRC_FILES := $(call all-subdir-java-files)

LOCAL_PACKAGE_NAME := TelephonyProvider
LOCAL_CERTIFICATE := platform

LOCAL_JAVA_LIBRARIES += telephony-common
LOCAL_STATIC_JAVA_LIBRARIES += android-common
LOCAL_STATIC_JAVA_LIBRARIES += com.sprd.appbackup.service

include $(BUILD_PACKAGE)
