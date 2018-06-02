package com.example.android.newsfeed;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link NewsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link News} objects.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * This ViewHolder class is help to represent data in ListView by recycling.
     */
    static class ViewHolder {

        private TextView sectionTextView;
        private TextView titleTextView;
        private TextView dateTextView;
        private TextView timeTextView;
    }


    /**
     * Create a new {@link NewsAdapter} object.
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param object is the list of {@link News} to be displayed.
     */
    public NewsAdapter(Context context, ArrayList<News> object) {
        super(context, 0, object);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Create a ViewHolder object.
        ViewHolder holder;

        // Check if the existing view is being reused, otherwise inflate the view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.news_list_item, parent, false);
            holder = new ViewHolder();
            holder.sectionTextView = convertView.findViewById(R.id.section);
            holder.titleTextView = convertView.findViewById(R.id.title);
            holder.dateTextView = convertView.findViewById(R.id.date);
            holder.timeTextView = convertView.findViewById(R.id.time);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the News object located at this position in the list.
        News currentNews = getItem(position);

        // Set proper data in news_list_item by using ViewHolder.
        holder.sectionTextView.setText(currentNews.getSectionName());
        holder.titleTextView.setText(currentNews.getTitle());
        holder.dateTextView.setText(currentNews.getPublicationDate());
        holder.timeTextView.setText(currentNews.getPublicationDate());

        return convertView;
    }
}
