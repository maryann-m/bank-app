package com.ekenya.rnd.etourism.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.PagerAdapter;

import com.ekenya.rnd.etourism.R;
import com.ekenya.rnd.etourism.databinding.SlidesLayoutBinding;
import com.ekenya.rnd.etourism.models.SliderImage;
import com.ekenya.rnd.etourism.ui.AppData;

import java.util.List;

import javax.inject.Inject;


public class SliderAdapter extends PagerAdapter {
    private Context context;
    private List<SliderImage> images;

    @Inject
    public SliderAdapter  (Context context, AppData appData) {
        this.context = context;
        this.images = appData.getImages();

    }





        @Override
    public int getCount() {
        return images.size();
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==  object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        SlidesLayoutBinding binding = SlidesLayoutBinding.inflate((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        View view = binding.getRoot();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_home_to_singleTripFragment);



            }
        });
        binding.sliderBg.setBackgroundResource(images.get(position).getId());
        container.addView(view);
        return view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }
}

