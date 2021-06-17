package com.example.filemanager;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filemanager.R;

import java.lang.reflect.InvocationTargetException;

public class FileViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName, tvSize;

    public CardView container;
    public ImageView imgFile;
    public FileViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tv_filename);
        tvSize = itemView.findViewById(R.id.tv_fileSize);
        container = itemView.findViewById(R.id.container);
        imgFile = itemView.findViewById(R.id.img_filetype);
    }
}
