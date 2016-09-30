package com.example.jhon.recursos.dao;

import com.example.jhon.recursos.models.Mascota;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhon on 30/09/16.
 */

public class MascotaDao {

    public static List<Mascota> mascotasInit(){
        List<Mascota> data = new ArrayList<>();
        Mascota mascota = new Mascota();
        mascota.setNombre("Cheo");
        mascota.setColor("Rojo");
        mascota.setDescripcion("Un perro muy fiel y jugueton");
        mascota.setEstado(Mascota.SANO);
        mascota.setDineroNecesitado("20000");
        mascota.setUrlImg("http://static.vix.com/es/sites/default/files/styles/large/public/btg/curiosidades.batanga.com/files/Animales-en-peligro-de-extincion-Conoce-al-maravilloso-perro-rojo-asiatico-1.jpg?itok=p3aPQL71");
        mascota.setRaza("Perro");
        data.add(mascota);

        Mascota mascota2 = new Mascota();
        mascota2.setNombre("Ñero, el perro policia");
        mascota2.setColor("Negrito");
        mascota2.setDescripcion("en mas fiel miebro de la policia naciona");
        mascota2.setEstado(Mascota.ADOPTADO);
        mascota2.setDineroNecesitado("000000");
        mascota2.setUrlImg("http://images.et.eltiempo.digital/contenido/bogota/IMAGEN/IMAGEN-16337955-2.jpg");
        mascota2.setRaza("Perro");
        data.add(mascota2);

        Mascota mascota3 = new Mascota();
        mascota3.setNombre("Copo de nieve");
        mascota3.setColor("Blanco");
        mascota3.setDescripcion("Alma malvada y llena de odio hacia la humanidad");
        mascota3.setEstado(Mascota.ENFERMO);
        mascota3.setDineroNecesitado("100000");
        mascota3.setUrlImg("http://cache3.asset-cache.net/xc/468426532.jpg?v=2&c=IWSAsset&k=2&d=wu4YkVJkL6WyzzE0_tUq7xNMwcmlFCpsI-gsBsYTGjwYOr3TDnSuRp0wY7f13yfv0");
        mascota3.setRaza("Gato");
        data.add(mascota3);
        return data;
    }
}
