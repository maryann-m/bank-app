package com.ekenya.rnd.etourism.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;

import androidx.lifecycle.ViewModelProvider;

import com.ekenya.rnd.common.abstractions.BaseDaggerFragment;
import com.ekenya.rnd.etourism.databinding.FragmentDiscoverBinding;


import javax.inject.Inject;


public class DashboardFragment extends BaseDaggerFragment {
    @Inject
    public ViewModelProvider.Factory viewModelFactory;

    private DashboardViewModel dashboardViewModel;
    private FragmentDiscoverBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this,viewModelFactory).get(DashboardViewModel.class);

        binding = FragmentDiscoverBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       /* final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}