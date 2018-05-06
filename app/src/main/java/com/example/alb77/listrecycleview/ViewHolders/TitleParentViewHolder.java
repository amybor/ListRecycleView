package com.example.alb77.listrecycleview.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.example.alb77.listrecycleview.R;

import org.w3c.dom.Text;

/**
 * Created by alb77 on 3/13/2018.
 */

public class TitleParentViewHolder extends ParentViewHolder{
    public TextView _textView;
    public ImageButton _imageButton;

    public TitleParentViewHolder(View itemView){
        super(itemView);
        _textView = (TextView)itemView.findViewById(R.id.parentTitle);
        _imageButton = (ImageButton)itemView.findViewById(R.id.expandArrow);
    }
}
