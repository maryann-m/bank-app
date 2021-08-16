package com.ekenya.rnd.etourism.ui.wallet.airtel;




import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class AirtelViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    @Inject
    public AirtelViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}