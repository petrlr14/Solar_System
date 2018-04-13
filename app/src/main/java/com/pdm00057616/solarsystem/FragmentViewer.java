package com.pdm00057616.solarsystem;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class FragmentViewer extends Fragment{
    TextView textViewName;
    ImageView imageView;
    TextView textViewContent;
    Serializable planet;
    Planet planetP;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.viewer_fragment, container, false);
        imageView=view.findViewById(R.id.image_planet);
        textViewName=view.findViewById(R.id.textViewName);
        textViewContent=view.findViewById(R.id.textViewContent);
        Bundle bundle=this.getArguments();
        if(bundle!=null){
            planet=bundle.getSerializable("Planet");
            planetP=(Planet)planet;
            System.out.println(planetP.toString());
            textViewName.setText(planetP.getName());
            textViewName.setTextColor(getResources().getColor(planetP.getColor()));
            textViewContent.setText(planetP.getContent());
            imageView.setImageResource(planetP.getImageView());
        }
        return view;
    }
}
