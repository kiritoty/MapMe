package com.example.xiaofeng.myapplication;

/**
 * Created by Kaifeng on 10/26/16.
 */



import java.util.ArrayList;
import java.util.List;



public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}