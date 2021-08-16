package com.ekenya.rnd.etourism.ui.home.virtualsafari;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class VirtualSafariViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    @Inject
    public VirtualSafariViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}