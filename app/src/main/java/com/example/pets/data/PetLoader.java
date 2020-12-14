package com.example.pets.data;

import android.content.Context;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.CursorLoader;

import java.net.URI;

public class PetLoader extends CursorLoader {
    private Uri mUri;
    private String[] mProjection;
    private String mSelection;
    private String[] mSelectionArgs;
    private String mSortOrder;

    public PetLoader(@NonNull Context context, @NonNull Uri uri, @Nullable String[] projection,@Nullable String selection, @Nullable String[] selectionArgs,@Nullable String sortOrder) {
        super(context, uri, projection, selection, selectionArgs, sortOrder);
        this.mUri = uri;
        this.mProjection = projection;
        this.mSelection = selection;
        this.mSelectionArgs = selectionArgs;
        this.mSortOrder = sortOrder;
    }
}
