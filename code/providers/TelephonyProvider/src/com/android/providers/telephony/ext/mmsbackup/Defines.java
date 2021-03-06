
package com.android.providers.telephony.ext.mmsbackup;

public interface Defines {

    public final static int SHORT_MESSAGE_CODE = 0;
    public final static int MEDIA_MESSAGE_CODE = 1;

    public static final boolean READ = true;
    public static final boolean WRITE = false;

    // Commands
    public static final int CMD_BACKUP = 0;
    // public static final int CMD_BACKUP_SMS = 1;
    public static final int CMD_CANCEL = 2;
    public static final int CMD_DEDUPLICATE = 3;
    public static final int CMD_GET_ACCOUNT = 4;
    public static final int CMD_GET_BACKUP_INFO = 5;
    public static final int CMD_GET_CATEGORY = 6;
    public static final int CMD_GET_STATE = 7;
    public static final int CMD_INIT_ENV = 8;
    public static final int CMD_INIT_INTERFACE = 9;
    public static final int CMD_REPORT_RESUALT = 10;
    // public static final int CMD_RESTORE_MMS = 11;
    public static final int CMD_RESTORE = 12;
    public static final int CMD_UPDATE_PROGRESS = 13;

    public static final int CMD_GET_PARAMETER = 14;

    // cancel all ;
    public static final int CMD_CANCEL_ALL = 15;

    // Resualt Code
    public static final int PARAMETER_FD = 100;
    public static final int PARAMETER_VERSION = 101;

    // error code
    public static final int ERROR_OTHER = 1000;
    public static final int ERROR_FD_NULL = 1001;
    public static final int ERROR_PDU_NULL = 1002;
    public static final int ERROR_STORAGE_LACK = 1003;
    public static final int ERROR_EXCEPTION = 1004;
    public static final int ERROR_SIZE_ZERO = 1005;
}
