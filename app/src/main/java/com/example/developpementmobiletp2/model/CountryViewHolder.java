package com.example.developpementmobiletp2.model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.developpementmobiletp2.R;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private final TextView name;
    private final TextView capital;
    private final ImageView drapeau;
    private final TextView currency;
    private Country country;

    public CountryViewHolder(final View itemView) {
        super(itemView);
        name = ((TextView)itemView.findViewById(R.id.tvc_name));
        capital = ((TextView)itemView.findViewById(R.id.tvc_capital));
        drapeau = ((ImageView)itemView.findViewById(R.id.ivc_drapeau));
        currency = ((TextView)itemView.findViewById(R.id.tvc_currency));
    }

    public void afficher(Country country, RequestManager glide) {
        this.country = country;

        name.setText(country.getCommonName()+ " ("+country.getOfficialName()+ ")");
        capital.setText(country.getCapitalCity());
        currency.setText(country.getCurrencyName() + " ("+
                country.getCurrencyTrigram()+ ", " +
                country.getCurrencySymbol() + ")");
        glide.load("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/No_flag.svg/338px-No_flag.svg.png").apply(RequestOptions.circleCropTransform()).into(drapeau);
    }
}
