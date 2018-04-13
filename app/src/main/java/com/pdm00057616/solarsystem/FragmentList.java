package com.pdm00057616.solarsystem;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class FragmentList extends ListFragment implements AdapterView.OnItemClickListener {

    Planet planet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter arrayAdapter=ArrayAdapter.createFromResource(getActivity(), R.array.Planets, android.R.layout.simple_list_item_1);
        setListAdapter(arrayAdapter);
        getListView().setOnItemClickListener(this);
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        planet=new Planet();
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT){
            Intent newIntent = new Intent(getActivity().getApplicationContext(), Main2Activity.class);
            setPlanetContent(position, parent);
            newIntent.putExtra("Planet", planet);
            startActivity(newIntent);

        }else if(getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE){
            Bundle bundle = new Bundle();
            setPlanetContent(position, parent);
            bundle.putSerializable("Planet", planet);
            FragmentViewer frag = new FragmentViewer();
            frag.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.view, frag);
            fragmentTransaction.commit();
        }
    }

    private void setPlanetContent(int indice,AdapterView parent){
        planet.setIndice(indice);
        planet.setName(parent.getItemAtPosition(indice).toString());
        System.out.println(planet.getName());
    }

}
