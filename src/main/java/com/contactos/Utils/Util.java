package com.contactos.Utils;

import com.contactos.models.Contacto;

import java.util.ArrayList;
import java.util.List;

public class Util {


   public static List<Contacto> listaContactos = new ArrayList<>(

           List.of(
                   new Contacto("Carlos","12345678","0321456987","La Tola"),
                   new Contacto("Luis","987456321","0987465632","Granados")
           )
   );

}
