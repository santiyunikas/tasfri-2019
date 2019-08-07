package com.example.tasfri2019;

import com.example.tasfri2019.Allocation.Alokasi;
import com.example.tasfri2019.Application.Aplikasi;
import com.example.tasfri2019.Assignment.Assignment;

public interface ItemClickListener {

    void OnItemClick(int position, Assignment assData);

    void OnItemClick(int position, Aplikasi appData);

    void OnItemClick(int position, Alokasi alloData);
}
