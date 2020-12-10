package com.geekbrains.avarkom.ui.firma;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirmashowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FirmashowViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}