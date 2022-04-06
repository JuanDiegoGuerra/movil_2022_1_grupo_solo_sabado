package com.cibertec.proyecto.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.cibertec.proyecto.entity.Autor;
import com.cibertec.proyecto.entity.Libro;

import java.util.List;

public class AutorAdapter extends ArrayAdapter<Autor>  {

    private Context context;
    private List<Autor> lista;

    public AutorAdapter(@NonNull Context context, int resource, @NonNull List<Autor> lista) {
        super(context, resource, lista);
        this.context = context;
        this.lista = lista;
    }

}
