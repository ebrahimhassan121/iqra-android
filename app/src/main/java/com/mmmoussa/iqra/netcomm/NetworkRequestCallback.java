package com.mmmoussa.iqra.netcomm;

import org.json.JSONObject;

public interface NetworkRequestCallback {

    void onSuccess(JSONObject response);

    void onFailure(Throwable e);
}
