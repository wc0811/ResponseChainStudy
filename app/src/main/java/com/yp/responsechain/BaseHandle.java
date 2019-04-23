package com.yp.responsechain;

//所谓的责任链模式，靠的是递归实现的
public abstract class BaseHandle {
    private BaseHandle nextHandle;

    public Response handleMsg(Request pRequest) {
        Response response = null;
        if (this.getHandleLevel().equals(pRequest.getLevel())) {
            response = dealEcho();
        } else {
            response = nextHandle.handleMsg(pRequest);
        }
        return response;
    }

    public abstract Level getHandleLevel();

    public abstract Response dealEcho();
}
