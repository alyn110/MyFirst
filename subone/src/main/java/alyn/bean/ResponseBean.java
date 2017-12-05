package alyn.bean;

public class ResponseBean {
    /**
     * 消息code
     */
    private String messageCode = "";

    /**
     * 消息
     */
    private String message = "";

    /**
     * 类型
     */
    private int messageType;

    /**
     * 数据体信息
     */
    private Object resultInfo;

    /**
     * 迁移URL
     */
    private String forward = "";

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public Object getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(Object resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }
}
