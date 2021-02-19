package com.body.gg.common;

public enum APIResponseCode {
    // 시스템
    G_SUCCESS("01.000", "OK"),
    G_INTERNAL_ERROR("01.001", "Internal server error"),
//    G_WRONG_PARAMETER("01.002", 200, "Wrong parameter(s)"),
//    G_PERMISSION_DENIED("01.003", 403, "Permission denied"),
//    G_PLEASE_WAIT("01.004", 200, "Please wait..."),
//    G_INVALID_SORT_OPTION("01.005", 200, "Invalid sort options"),
//    G_API_RESTRICTED_TO_FREEMIUM("01.006", 200, "This action of API is restricted to freemium user."),
//    G_INVALID_PERMISSION_TYPE("01.007", 200, "Invalid Permission Type"),
//    G_INVALID_PERMISSION_TARGET("01.008", 200, "Directory is not supported to set global permission."),
//    G_DATE_EXPIRED("01.009", 200, "Date expired."),
//    G_MAX_DOWNALOD_COUNT_EXCEEDED("01.010", 200, "Download count has been exceeded."),
//    G_UNAUTHORIZED_ACCESS("01.011", 200, "Unauthorized access Exception"),
//    G_NOT_SUPPORT("01.012", 200, "Not support");

    PARAM_EMPTY("02.001", "Param is empty"),
    PARAM_WRONG("02.002", "Param is wrong"),

    LAST("ddd","ddd");

//    L_USER_NOT_FOUND("02.001", 200, "User with specified name/e-mail not found or wrong password"),
//    L_WRONG_PASSWORD("02.001", 200, "User with specified name/e-mail not found or wrong password"),
//    L_NO_SESSION("02.003", 401, "Session header not found in HTTP request"),
//    L_WRONG_SESSION("02.004", 401, "Session ID is wrong"),
//    L_WRONG_STATE("02.005", 200, "User account is disabled"),
//    L_WRONG_EMAIL("02.006", 200, "The email address you provided is not registered"),
//    L_SESSION_NOT_FOUND("02.007", 401, "Session not found"),
//    L_USER_NOT_AUTHORIZED("02.007", 200, "Not authorized to this product"),
//    L_MAX_NUMBER_DEVICES_EXCEEDED("02.008", 200, "Maximum number of allowed devices exceeded"),
//    L_MAX_NUMBER_REQUEST_EXCEEDED("02.009", 200, "The maximum number of allowed request has been exceeded."),
//    L_FAILED_AUTHKEY_LOGIN("02.010", 200, "Auth Failed : Wrong AuthKey or AccountType or AccountState."),
//    L_USER_IS_DISABLED("02.011", 200, "User account is disabled. Please reactivate."),
//    L_USER_IS_REACTIVATE_REQUESTED("02.012", 200, "User account reactivation is requested. Please check email."),
//    L_USER_IS_REACTIVATE_FAILED("02.013", 200, "User account reactivation is failed."),
//
//    FS_WRONG_ID("03.001", 404, "File not found"),
//    FS_AUTH_REQUIRED("03.002", 200, "3rd party service requires authentication"),
//    FS_INVALID_FILE_TYPE("03.003", 415, "Invalid file type"),
//    FS_FREE_SPACE_EXCEEDED("03.004", 200, "Not enough free space to complete operation"),
//    FS_NO_FOLDER_THUMB("03.005", 200, "No thumbnail available for specified folder"),
//    FS_FILE_NOT_SHARED("03.006", 200, "File has not been shared."),
//    FS_WRONG_VERSION("03.010", 404, "Version not found"),
//    FS_UPLOAD_SIZE_EXCEEDED("03.011", 200, "Upload file size exceeded"),
//    FS_EXIST_SAME_NAME("03.012", 200, "Folder with same name already exists."),
//    FS_INVALID_FILE_NAME("03.013", 200, "Invalid file name."),
//    FS_NOT_FOUND_FILE_OR_INVALID_PERMISSION("03.014", 200, "File not found or invalid permission."),
//    FS_TRAFFIC_FULL("03.015", 200, "Traffic has been fulled."),
//    FS_FILE_LOCKED("03.016", 200, "File is locked."),
//    FS_NOT_SUPPORT_FOLDER_QUOTA("03.017", 200, "This storage don't support to setting quota.."),
//    FS_SEARCH_BAD_REQUEST("03.018", 200, "Bad search request"),
//    FS_SEARCH_TO_SHORT_KEYWORD("03.019", 200, "Search keyword should be at least solr.minTermLength characters. Please try again."),
//    FS_SEARCH_DUPLICATE_SEARCH_OPTION("03.020", 200, "Duplicate SearchOption exception occurred."),
//    FS_SEARCH_UNSUPPORTED_SEARCH_OPTION("03.021", 200, "SearchByOption is not supported for general search."),
//    FS_SEARCH_SOLR_SERVER_EXCEPTION("03.022", 200, "An exception occurred on Solr Server."),
//    FS_SEARCH_IC_NULL_RESULT("03.023", 200, "IndexingClient.search: searchResult is null"),
//    FS_SEARCH_IC_SERVER_BUSY("03.024", 200, "IndexingClient.search: Cannot access search server or it is overloaded. Please try later or write more specific query."),
//    FS_SEARCH_RPC_NULL_RESULT("03.025", 200, "XmlRpcIndexServer.search: SearchResult is null"),
//    FS_SEARCH_RPC_SERVER_BUSY("03.026", 200, "XmlRpcIndexServer.search: Cannot access search server or it is overloaded. Please try later or write more specific query."),
//
//    OAUTH_NO_SESSION("04.001", 200, "OAuth session not found"),
//    OAUTH_SESSION_IN_PROGRESS("04.002", 200, "OAuth session in progress"),
//    OAUTH_FLICKR_CONFIRM_FAILED("04.003", 200, "Flickr OAuth confirmation failed"),
//    OAUTH_SERVICE_NOT_FOUND("04.004", 200, "Service not found or not supported"),
//    OAUTH_PREPARE_URL_FAILED("04.005", 200, "Failed to prepare OAuth URL"),
//    OAUTH_USER_AUTHENTICATED("04.006", 200, "User is already authenticated"),
//    OAUTH_DUPLICATE_SESSION_NAME("04.007", 200, "Session with specified name already exists"),
//    OAUTH_MULTIPLE_SESSIONS_NOT_SUPPORTED("04.008", 200, "This service does not support multiple connections."),
//    OAUTH_MULTIPLE_SESSIONS_NOT_ALLOWED("04.009", 200, "Your account type does not allow multiple connections to the same service. Please upgrade your account."),
//
//    REG_ACCOUNT_TYPE_NOT_SUPPORTED("05.001", 200, "Account type not supported"),
//    REG_FAILED("05.002", 200, "User registration failed"),
//    REG_EMAIL_IS_ALREADY_REGISTERED("05.003", 200, "User email is already registered"),
//    REG_NAME_IS_ALREADY_REGISTERED("05.004", 200, "User name is already registered"),
//    REG_WEAK_PASSWORD("05.005", 200, "Password is too weak"),
//    REG_ACCOUNT_STATE_WAITTING("05.006", 200, "User email is already registered. Account state : WAITTING."),
//    REG_ACCOUNT_ALREADY_ACTIVE("05.007", 200, "User account is already active."),
//    REG_ACCOUNT_STATE_SUSPENDED("05.008",200,"User account is suspended."),
//    REC_ACCOUNT_CHANGE_FAILED("05.009", 200, "Account change failed."),
//    REC_ACCOUNT_CHANGE_CODE_EXPIRED("05.010", 200, "Account change failed: Code is expired."),
//    REG_EMAIL_IS_ALREADY_TEMP_REGISTERED("05.011", 200, "User email is already registered as a temporary user."),
//
//    INVALID_SERVICE_NAME("06.001", 200, "Service name is invalid."),
//    ALREADY_CONNECTED_SERVICE("06.002", 200, "It's already connected service."),
//    NOT_CONNECTED_SERVICE("06.003", 200, "It's not a connected service."),
//
//    QS_NO_SERVICE_AUTHENTICATION("07.001", 200, "Cannot publish to requested service: user not authenticated"),
//    QS_LIMIT_REACHED("07.002", 200, "A Free user account is limited to 5 active Quick Shares. You must Unshare one of your other Quick Shares in order to share the selected content."),
//
//    BILLING_APPLE_PAYMENT_INVALID_RECEIPT("08.001", 200, "Receipt is invalid"),
//
//    THUMBNAILS_IN_PROGRESS("09.001", 200, "Conversion in progress"),
//    THUMBNAILS_NOT_AVAILABLE("09.002", 200, "Not available"),
//
//    ACC_FAILED("10.001", 200, "Failed to set account type"),
//    ACC_ACCOUNT_TYPE_NOT_SUPPORTED("10.002", 200, "Account type not supported"),
//    ACC_UPDATE_FAILED("10.003", 200, "Failed to update account"),
//
//    AUTH_INVALID_REQUEST("11.001", 400, "Invalid request"),
//    AUTH_INVALID_GRANT("11.002", 400, "Invalid grant"),
//
//    SRV_CANT_RENAME_SERVICE("12.001", 200, "Can not rename service"),
//
//    PASSWORD_NOT_CHANGED("13.010", 200, "Your password has not been changed because the reset password link you clicked has already been used"),
//    PASSWORD_SET_CODE_EXPIRED("13.011", 200, "Password reset failed: reset code is expired."),
//    PASSWORD_RESET_FAILED("13.012", 200, "Password reset failed."),
//    PASSWORD_CHANGE_FAILED("13.013", 200, "Password change failed."),
//    PASSWORD_NOT_SAME_CURRENT("13.014", 200, "New password should not be same as current password."),
//
//    BILLING_PROCESS_FAILED("14.001",200,"Billing job failed."),
//    BILLING_NOT_FOUND("14.002",200,"Billing information not found."),
//    BILLING_CANNOT_APPLY_FOR_FREEMIUM_USER("14.003",200,"Cannot apply for freemium user"),
//    BILLING_CANCEL_FAILED("14.004",200,"Failed to billing cancel"),
//    BILLING_PRICE_INVALID("14.005",200,"Plan is invalid"),
//    BILLING_ALREADY_EXIST_PAYMENT_INFORMATION("14.006",200,"There is already exist payment information"),
//    BILLING_MINIMUM_COUNTER_ERROR("14.007",200,"Billing counter have to be over 1"),
//    BILLING_ALREADY_APPLIED("14.008",200,"setting value is already applied."),
//    BILLING_CARD_NUM_INVALID("14.009",200,"Card number is invalid"),
//    BILLING_PASSWORD_INVALID("14.010",200,"Password is invalid"),
//    BILLING_PG_SERVICE_INVALID("14.011",200,"Pg service is invalid"),
//    BILLING_CARD_EXP_DATE_INVALID("14.012",200,"Card expire date(4 digits) is invalid"),
//    BILLING_SOCIAL_NUMBER_INVALID("14.013",200,"Social number is invalid"),
//    BILLING_PLAN_INVALID("14.014",200,"Plan is invalid"),
//    BILLING_CARD_CVC_INVALID("14.015",200,"Card cvc is invalid"),
//    BILLING_PERIOD_INVALID("14.016",200,"Period is invalid"),
//    BILLING_ORG_ADD_USER_FAILED("14.017",200,"Failed to add user for Org."),
//    BILLING_ORG_ADD_USER_FAILED_TODAY_CAN_NOT_ADD_USER("14.018",200,"Failed to add user for Org because today can not user add"),
//    BILLING_TRANSACTION_DATA_NOT_FOUND("14.019",200,"Billing transaction data not found."),
//    BILLING_MAX_COUNTER_ERROR("14.020",200,"Billing counter is exceeded."),
//
//    COUPON_NOT_FOUND("15.001",200,"Coupon information not found."),
//    COUPON_ALREADY_USED("15.002",200,"Coupon is used already."),
//    COUPON_APPLY_FAIL("15.003",200,"Fail to set Coupon information."),
//    COUPON_APPLY_LESS_BENEFIT("15.004",200,"Coupon expiry date is shorter than current benefit."),
//    COUPON_APPLY_EXPIRED("15.005",200,"Promotion expired."),
//
//    ORG_NOT_FOUND("16.001",200,"Organization information not found."),
//    ORG_ACCOUNT_ALREADY_REG("16.002", 200, "User already other organization user."),
//    ORG_LICENSE_COUNT_EXCEEDED("16.003", 200, "License count has been exceeded."),
//    ORG_ACCOUNT_NOT_BELONG_TO("16.004", 200, "User is not belong to organization."),
//    ORG_CREATE_PERMISSION_DENIED("16.005", 200, "The creation of an organization is only possible BIZ / EDU account."),
//    TEAM_EXISTING_TEAM_NAME("16.006", 200, "Existing team name. Please rename it."),
//    CONTACT_GROUP_NAME_DUPLICATED("16.007", 200, "The contact group name entered is a duplicate."),
//    CONTACT_GROUP_IS_NOT_EXIST("16.008", 200, "The contact group is not exist."),
//    ORG_NOT_AVAILABLE("16.009", 200, "Organization not available"),
//    ORG_NO_USER_INVITED("16.010", 200, "No user invited."),
//    ORG_MANAGER_NOT_DELETED("16.011", 200, "This manager can not be deleted."),
//    ORG_NOT_NETFFICE_MEMBER("16.012", 200, "The invitation is only available for this service member."),
//    ORG_FILE_MOVE_FAILED("16.013", 200, "Failed to move file."),
//    CONTACT_NOT_FOUND("16.014", 200, "Contact not found."),
//    TEAM_HAVE_SUBTEAM_CANNOT_DELETED("16.015", 200, "The specified group must have no subgroups. Please, remove subgroups before deleting it."),
//    CONTACT_IS_ALREADY_EXIST("16.016", 200, "The contact is already exist."),
//    ORG_WORNG_PROCESS_DELETE_USER("16.017", 200, "Organization member can not be deleted through this API."),
//
//    COMMNENT_CANNOT_DELETE_USER_NOT_AUTHORIZED("17.001", 200, "Cannot delete comment because not authorized"),
//    COMMNENT_NOT_FOUND("17.002", 200, "Not found comment"),
//    COMMNENT_NOT_FOUND_USER("17.003", 200, "Not found user"),
//    COMMNENT_PERMISSION_DENIED("17.004", 200,  "permission denied");

    private String key;
    private String reason;
    private Object data;

    APIResponseCode(String key, String reason) {
        this.key = key;
        this.reason = reason;
    }

    public String getKey() {
        return key;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return name() + ": " + key;
    }
}
