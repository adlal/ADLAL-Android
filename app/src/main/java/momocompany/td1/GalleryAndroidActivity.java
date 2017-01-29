package momocompany.td1;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Momo on 24/01/2017.
 */
public class GalleryAndroidActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
// appel de la méthode initiale d’une Activity
//assure le fonctionnement normal de l’application
        super.onCreate(savedInstanceState);
// initialisation de la vue avec gallery.xml
        setContentView(R.layout.gallery);
// récupération de l’objet graphique gallery contenu
// dans gallery.xml
        Gallery g = (Gallery) findViewById(R.id.gallery);
// initialisation de l’objet gallery avec un ’adapter’
// ImageAdapter à créer (voir suite)
        g.setAdapter(new ImageAdapter(this));
// implémentation de la méthode de click
// sur un élément de ImageAdapter
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v,
                                    int position, long id) {
                Toast.makeText(GalleryAndroidActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}