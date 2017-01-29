package momocompany.td1;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by Momo on 24/01/2017.
 */
public class ImageAdapter extends BaseAdapter {

    int mGalleryItemBackground;
    private Context mContext;
    // tous les éléments de ImageAdapter
// les références vers les ressources d’images
    private Integer[] mImageIds = {R.drawable.donut, R.drawable.eclair, R.drawable.lollipop, R.drawable.nougat, R.drawable.cupcake, R.drawable.marshmallow};
    public ImageAdapter(Context c) {
// le contexte correspond à l’Ativity en cours d’exécution
// ici c’est GalleryAndroidActivity
        mContext = c;
// initialisation de la gallery avec un style
// fichier attrs.xml à créer (voir suite)
        TypedArray a = mContext.obtainStyledAttributes(
                R.styleable.GalleryAndroid);
        mGalleryItemBackground = a.getResourceId(
                R.styleable.GalleryAndroid_android_galleryItemBackground, 0);
        a.recycle();
    }
    // implémentation des méthodes de BaseAdapter
    public int getCount() {
        return mImageIds.length;
    }
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position) {
        return position;
    }
    // cette méthode renvoit la vue pour un élément de BaseAdapter
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        i.setImageResource(mImageIds[position]);
        i.setLayoutParams(new Gallery.LayoutParams(150, 170));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        i.setBackgroundResource(mGalleryItemBackground);
        return i;
    }
}