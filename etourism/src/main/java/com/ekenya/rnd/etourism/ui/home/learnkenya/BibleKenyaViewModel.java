package com.ekenya.rnd.etourism.ui.home.learnkenya;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class BibleKenyaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    @Inject
    public BibleKenyaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}