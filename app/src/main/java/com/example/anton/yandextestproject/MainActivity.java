package com.example.anton.yandextestproject;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected String data;
    protected String url = "http://cache-default02g.cdn.yandex.net/download.cdn.yandex.net/mobilization-2016/artists.json";
    protected String testData = "[{\"id\":1080505,\"name\":\"Tove Lo\",\"genres\":[\"pop\",\"dance\",\"electronics\"],\"tracks\":81,\"albums\":22,\"link\":\"http://www.tove-lo.com/\",\"description\":\"шведская певица и автор песен. Она привлекла к себе внимание в 2013 году с выпуском сингла «Habits», но настоящего успеха добилась с ремиксом хип-хоп продюсера Hippie Sabotage на эту песню, который получил название «Stay High». 4 марта 2014 года вышел её дебютный мини-альбом Truth Serum, а 24 сентября этого же года дебютный студийный альбом Queen of the Clouds. Туве Лу является автором песен таких артистов, как Icona Pop, Girls Aloud и Шер Ллойд.\",\"cover\":{\"small\":\"http://avatars.yandex.net/get-music-content/dfc531f5.p.1080505/300x300\",\"big\":\"http://avatars.yandex.net/get-music-content/dfc531f5.p.1080505/1000x1000\"}},{\"id\":2915,\"name\":\"Ne-Yo\",\"genres\":[\"rnb\",\"pop\",\"rap\"],\"tracks\":256,\"albums\":152,\"link\":\"http://www.neyothegentleman.com/\",\"description\":\"обладатель трёх премии Грэмми, американский певец, автор песен, продюсер, актёр, филантроп. В 2009 году журнал Billboard поставил Ни-Йо на 57 место в рейтинге «Артисты десятилетия».\",\"cover\":{\"small\":\"http://avatars.yandex.net/get-music-content/15ae00fc.p.2915/300x300\",\"big\":\"http://avatars.yandex.net/get-music-content/15ae00fc.p.2915/1000x1000\"}},{\"id\":91546,\"name\":\"Usher\",\"genres\":[\"rnb\",\"pop\",\"rap\"],\"tracks\":450,\"albums\":183,\"link\":\"http://usherworld.com/\",\"description\":\"американский певец и актёр. Один из самых коммерчески успешных R&B-музыкантов афроамериканского происхождения. В настоящее время продано более 65 миллионов копий его альбомов по всему миру. Выиграл семь премий «Грэмми», четыре премии World Music Awards, четыре премии American Music Award и девятнадцать премий Billboard Music Awards. Владелец собственной звукозаписывающей компании US Records. Он занимает 21 место в списке самых успешных музыкантов по версии Billboard, а также второе место, уступив Эминему в списке самых успешных музыкантов 2000-х годов. В 2010 году журнал Glamour включил его в список 50 самых сексуальных мужчин.\",\"cover\":{\"small\":\"http://avatars.yandex.net/get-music-content/b0e14f75.p.91546/300x300\",\"big\":\"http://avatars.yandex.net/get-music-content/b0e14f75.p.91546/1000x1000\"}}]";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Gson gson = new Gson();
        Type artistDataType = new TypeToken<List<ArtistData>>(){}.getType();
        ArrayList<ArtistData> artistDataList = gson.fromJson(testData, artistDataType);

        ArtistData aD = artistDataList.get(0);
        ArtistData.Cover cover = aD.cover;
        int a = 1;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}