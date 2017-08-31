package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.drawable.ic_play_arrow_white_24dp;
import static com.example.android.miwok.R.id.white_arrow;

/**
 * Created by tammy on 8/15/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mResourceId;
    /**
     * Class Constructor
     *
     * @param context the Object (context it is being used)
     * @param words   an ArrayList of Word objects, which hold a default translation and miwok translation
     *                The context is used to inflate the layout file, and the list is the data we want
     *                to populate into the lists.
     *                "super()" is used to modify the superclass constructor, which is:
     *                ArrayAdapter(Context context, int resource id, List<T> objects)
     *                We can pass in '0' because we are inflating the layout ourselves
     *    @param resourceId the color of the background
     */

    public WordAdapter(Activity context, ArrayList<Word> words, int resourceId) {
        super(context, 0, words);
        mResourceId = resourceId;
    }

    /**
     * Overriding the ArrayAdapter super class to return view as opposed to string
     *
     * @param position    determines the position of the object in the ArrayList
     * @param convertView the view to populate (the RecycleView)
     * @param parent      the parent ViewGroup (null or false if you are referencing the parent layout)
     * @return the new View object
     * To inflate means to render a View object in memory
     * list
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Create a view to display
        View listItemView = convertView;
        if (listItemView == null) {
            // Create an inflater to render View. false because we don't want to attach the listItemView to the parent yet
            LayoutInflater inflater = LayoutInflater.from(getContext());
            listItemView = inflater.inflate(R.layout.list_item, parent, false);
        }
        // getItem is a method from the superclass, it returns the position of the word
        Word currentWord = getItem(position);
        int color = ContextCompat.getColor(getContext(), mResourceId);

        // create a Textview to display Miwok Translation
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        miwokTextView.setBackgroundColor(color);

        // Create a TextView to display default translation
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        defaultTextView.setBackgroundColor(mResourceId);
        defaultTextView.setBackgroundColor(color);

        ImageView arrow = (ImageView) listItemView.findViewById(white_arrow);
        arrow.setBackgroundColor(color);
        arrow.setImageResource(ic_play_arrow_white_24dp);
        arrow.setVisibility(View.VISIBLE);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
