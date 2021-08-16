package com.ekenya.rnd.etourism.ui.home.destination;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

public class SingleTripViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    @Inject
    public SingleTripViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}