package com.ekenya.rnd.etourism;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import com.ekenya.rnd.baseapp.TourismApp;
import com.ekenya.rnd.common.abstractions.BaseActivity;
import com.ekenya.rnd.etourism.databinding.ActivityMainEtourismBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

import dagger.android.AndroidInjector;

public class MainActivity extends BaseActivity {

    private ActivityMainEtourismBinding binding;
    private NavController navController;

    @Inject
    public ViewModelProvider.Factory viewModelFactory;

    //private MainViewModel mViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            );
            getWindow().setStatusBarColor(Color.WHITE   );

        }

        binding = ActivityMainEtourismBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //
        //mViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel.class);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        //NavigationUI.setupWithNavController(binding.navView, navController);
        NavigationUI.setupWithNavController(binding.navView, navController);

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull @NotNull NavController controller, @NonNull @NotNull NavDestination destination, @Nullable @org.jetbrains.annotations.Nullable Bundle arguments) {
                int destinationId= destination.getId();
                if(destinationId == R.id.navigation_home || destinationId == R.id.registeredUserFragment || destinationId ==  R.id.newUserFragment || destinationId == R.id.intermediateFragment || destinationId == R.id.navigation_dashboard ||destinationId == R.id.navigation_notifications|| destinationId == R.id.navigation_profile ) {
                    navView.setVisibility(View.VISIBLE);


                }

                else{

                    navView.setVisibility(View.GONE);
                }
            }
        });


    }
    @Override
    public AndroidInjector<Fragment> supportFragmentInjector()  {
        // Fragment Injector should use the Application class
        // If necessary, I will use AndroidInjector as well as App class (I have not done this time)
        return ((TourismApp)getApplication()).supportFragmentInjector();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp() || super.onSupportNavigateUp();
    }



}