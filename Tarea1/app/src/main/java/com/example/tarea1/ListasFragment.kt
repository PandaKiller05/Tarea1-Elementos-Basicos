package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class ListasFragment : Fragment(R.layout.listas) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listView = view.findViewById<ListView>(R.id.lista_elementos)
        
        val jugadores = arrayOf(
            "1. Mario - 9999 pts",
            "2. Luigi - 8500 pts",
            "3. Peach - 7200 pts",
            "4. Yoshi - 6800 pts",
            "5. Toad - 5500 pts",
            "6. Bowser - 4300 pts",
            "7. Wario - 3100 pts",
            "8. Waluigi - 2500 pts",
            "9. Donkey Kong - 1800 pts",
            "10. Rosalina - 1200 pts"
        )

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.item_lista,
            android.R.id.text1,
            jugadores
        )

        listView.adapter = adapter
    }
}
