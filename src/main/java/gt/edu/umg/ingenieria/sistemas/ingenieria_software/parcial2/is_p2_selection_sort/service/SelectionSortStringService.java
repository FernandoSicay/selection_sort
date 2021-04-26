package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.is_p2_selection_sort.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class SelectionSortStringService {


    public String[] selectionSortString(String[] array){

        // Find the string reference that should go in each cell of
        // the array, from cell 0 to the end
        for ( int j=0; j < array.length-1; j++ )
        {
            // Find min: the index of the string reference that should go into cell j.
            // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
            int min = j;
            for ( int k=j+1; k < array.length; k++ )
                if ( array[k].compareTo( array[min] ) < 0 ) min = k;

            // Swap the reference at j with the reference at min
            String temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
