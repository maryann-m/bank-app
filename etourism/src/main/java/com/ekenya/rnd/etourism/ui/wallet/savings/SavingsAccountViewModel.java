package com.ekenya.rnd.etourism.ui.wallet.savings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class SavingsAccountViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    @Inject
    public SavingsAccountViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }}