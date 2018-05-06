package com.example.alb77.listrecycleview.ViewHolders;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.example.alb77.listrecycleview.R;

/**
 * Created by alb77 on 3/13/2018.
 */

public class TitleChildViewHolder extends ChildViewHolder{
    public TextView option1,option2;
    public TitleChildViewHolder(View itemView){
        super(itemView);
        option1 = (TextView)itemView.findViewById(R.id.optional);
        option2 = (TextView)itemView.findViewById(R.id.optiona2);


    }
}
