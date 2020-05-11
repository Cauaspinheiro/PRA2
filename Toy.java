package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "toys")

public class Toy {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "toyId")
    private int mId;

    private String mName;

    private String mNickname;

    private int mStateOfUse;

    public Toy(String name, String nickname, int stateOfUse, String creationDate) {
        mName = name;
        mNickname = nickname;
        mStateOfUse = stateOfUse;
        mCreationDate = creationDate;
    }

    public Double getId() {
        return mId;
    }

    public void setId(Double id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNickname() {
        return mNickname;
    }

    public void setNickname(String nickname) {
        mNickname = nickname;
    }

    public Double getStateOfUse() {
        return mStateOfUse;
    }

    public void setStateOfUse(Double stateOfUse) {
        mStateOfUse = stateOfUse;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }
}
