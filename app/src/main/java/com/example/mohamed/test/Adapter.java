package com.example.mohamed.test;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.*;


public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {


    private ArrayList<String> mUsers;
    private ArrayList<String> mNumero;
    public Adapter() {
        mUsers = new ArrayList();
        mNumero=new ArrayList<>();
        mUsers.add("Loulout");
        mUsers.add("Travailleur");
        mUsers.add("Maison");
        mUsers.add("Maisons");
        mNumero.add("1555555555555");
        mNumero.add("2444545454848488");
        mNumero.add("35458787845845");
        mNumero.add("454878784544");

        }



    @Override
    public myViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_elements, viewGroup, false);
        return new myViewHolder(view);

    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        holder.tv_nom.setText(mUsers.get(position));
        holder.tv_numero.setText(mNumero.get(position));


    }


    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nom;
        TextView tv_numero;

        public myViewHolder(View itemViewUser) {
            super(itemViewUser);
            tv_nom = itemView.findViewById(R.id.tv_nom);
            tv_numero = itemView.findViewById(R.id.tv_numero);




        }
    }
}