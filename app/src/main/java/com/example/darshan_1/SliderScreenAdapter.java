package com.example.darshan_1;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SliderScreenAdapter extends PagerAdapter {

    Context _context;
    LayoutInflater _inflater;

    // list of images--
    public int[] _lst_images = {
            R.drawable.a,
            R.drawable.c,
            R.drawable.b
    };

    // list of titles--
    public String[] _lst_title = {
            " ",
            " ",
            " "
    };

    // list of description--
    public int[] _lst_description = {
            R.string.description_1,
            R.string.description_2,
            R.string.description_3
    };

    // list of background color--
//    public int[] _lst_backgroundcolor = {
//            Color.rgb(69, 90, 100),
//            Color.rgb(55, 71, 79),
//            Color.rgb(38, 50, 56)
//    };

    public int[] _lst_backgroundcolor = {
            R.drawable.back1,
            R.drawable.back2,
            R.drawable.back4
    };


    public SliderScreenAdapter(Context context) {
        this._context = context;
    }


    @Override
    public int getCount() {
        return _lst_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (ConstraintLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        _inflater = (LayoutInflater) _context.getSystemService(_context.LAYOUT_INFLATER_SERVICE);
        View view = _inflater.inflate(R.layout.slide, container, false);
        ConstraintLayout _layoutSlide = view.findViewById(R.id.slide_constraint_layout);
        ImageView _imgSlide = view.findViewById(R.id.slide_img);
        TextView _txtTitle = view.findViewById(R.id.slide_title_txt);
        TextView _txtDescription = view.findViewById(R.id.slide_desc_txt);

        // set Contents--------

        //_layoutSlide.setBackgroundColor(_lst_backgroundcolor[position]);
        _layoutSlide.setBackgroundResource(_lst_backgroundcolor[position]);
        _imgSlide.setImageResource(_lst_images[position]);
        _txtTitle.setText(_lst_title[position]);
        _txtDescription.setText(_lst_description[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
