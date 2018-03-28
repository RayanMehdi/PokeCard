//package com.example.iem.pokecard;
//
//import android.os.AsyncTask;
//
//import android.util.Log;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import com.example.iem.pokecard.Model.Pokemon;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.lang.reflect.Type;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Collection;
//
//import javax.net.ssl.HttpsURLConnection;
//
//public class Async extends AsyncTask<Object, Void, String> {
//    String RecupPokemon;
//    ArrayList<Pokemon> list;
//
//    MyAdapter adapter;
//    private URL url;
//    @Override
//    protected String doInBackground(Object... params) {
//
//
//        list = (ArrayList<Pokemon>)params[0];
//        adapter = (MyAdapter)params[1];
//
//
//        try {
//            RecupPokemon = this.GET();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        list.addAll(toArray(list));
//        return RecupPokemon;
//    }
//
//
//
//
//    protected String GET() throws IOException {
//        String str="";
//        String urlLink ="http://pokecardapi.local/index.php/pokemon/list";
//        try {
//            url = new URL(urlLink);
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//            if (httpURLConnection.getResponseCode() == HttpsURLConnection.HTTP_OK) {
//                String temp;
//                StringBuilder builder = new StringBuilder();
//                BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
//
//
//                while ((temp = in.readLine()) != null) {
//                    builder.append(temp);
//                }
//                str = builder.toString();
//
//            }
//        }
//        catch (IOException e)
//        {
//            final Exception ex = e;
//            e.printStackTrace();
//            str = e.getMessage();
//        }
//        return  str;
//    }
//
//
//    @Override
//    protected void onPostExecute(String s) {
//        adapter.notifyDataSetChanged();
//    }
//    protected ArrayList<Pokemon> toArray(ArrayList<Pokemon> pkm){
//        Type listType = new TypeToken<Collection<Pokemon>>(){}.getType();
//
//        return new Gson().fromJson(RecupPokemon, listType);
//
//    }
//}