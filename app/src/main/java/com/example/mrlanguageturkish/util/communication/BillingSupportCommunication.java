package com.example.mrlanguageturkish.util.communication;


import com.example.mrlanguageturkish.util.IabResult;

public interface BillingSupportCommunication {
    void onBillingSupportResult(int response);
    void remoteExceptionHappened(IabResult result);
}
