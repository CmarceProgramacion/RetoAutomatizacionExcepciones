package com.aliexpress.utils.enums;

public enum MessageExceptions {
    THE_LOGIN_POP_UP_IS_NOT_VISIBLE("!! The login pop up is not visible.¡¡"),
    HE_ADD_RESULT_TITLE_POP_UP_IS_NOT_VISIBLE("!! The add result title pop up is not visible ¡¡");

    final String messageException;

    MessageExceptions(String messageException) {
        this.messageException = messageException;
    }

    public String getMessageException() {
        return messageException;
    }
}
