package com.example.chihurmnanyanwanevu.ussdbanking.utils;

import com.example.chihurmnanyanwanevu.ussdbanking.animation.AccordionTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.BackgroundToForegroundTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.CubeInTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.CubeOutTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.DefaultTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.DepthPageTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.FlipHorizontalTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.FlipVerticalTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.ForegroundToBackgroundTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.RotateDownTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.RotateUpTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.ScaleInOutTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.StackTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.TabletTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.ZoomInTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.ZoomOutSlideTransformer;
import com.example.chihurmnanyanwanevu.ussdbanking.animation.ZoomOutTranformer;

import java.util.ArrayList;

/**
 * Created by Chihurumnanya
 */

public class Constants {

    public static final String NAV_HEADER_COLOR_TAG = "nav_header_color";
    public static final String ID = "id";
    public static final String TITLE = "title";
    public static final String DESC = "desc";
    public static final String COLOR = "color";
    public static final ArrayList<TransformerItem> TRANSFORM_CLASSES;

    static {
        TRANSFORM_CLASSES = new ArrayList<>();
        TRANSFORM_CLASSES.add(new TransformerItem(DefaultTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(AccordionTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(BackgroundToForegroundTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(CubeInTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(CubeOutTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(DepthPageTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(FlipHorizontalTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(FlipVerticalTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ForegroundToBackgroundTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(RotateDownTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(RotateUpTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ScaleInOutTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(StackTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(TabletTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ZoomInTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ZoomOutSlideTransformer.class));
        TRANSFORM_CLASSES.add(new TransformerItem(ZoomOutTranformer.class));
    }
}
