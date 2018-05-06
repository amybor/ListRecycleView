package com.example.alb77.listrecycleview.Models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alb77 on 3/13/2018.
 */

public class TitleCreator {

    static TitleCreator _titleCreator;
    List<TitleParent> _titleParents;

    public TitleCreator(Context context) {
       _titleParents = new ArrayList<>();
       for(int i = 0; i <= 100; i++){
          TitleParent title = new TitleParent(String.format("Caller #%d",i));
          _titleParents.add(title);
       }
    }

    public static TitleCreator get(Context context) {
        if(_titleCreator == null)
            _titleCreator = new TitleCreator(context);
        return _titleCreator;
    }

    public List<TitleParent> getAll() {
        return _titleParents;
    }
}
